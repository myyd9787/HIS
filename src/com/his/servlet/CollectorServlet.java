package com.his.servlet;

import com.alibaba.fastjson.JSON;
import com.his.biz.CollectorBiz;
import com.his.biz.impl.CollectorBizImpl;
import com.his.entity.Collector;
import com.his.entity.PageBean;
import com.his.entity.Register;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@WebServlet("/CollectorServlet")
public class CollectorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat hsm = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        PrintWriter out = response.getWriter();
        String method = request.getParameter("method");
        CollectorBiz collectorbiz = new CollectorBizImpl();
        if (method.equals("regist")) {//新增用户挂号信息
            String casenumber = request.getParameter("CaseNumber");
            String realname = request.getParameter("RealName");
            String gender = request.getParameter("gender");
            String idnumber = request.getParameter("IDnumber");
            String birthdate = request.getParameter("BirthDate");
            String age = request.getParameter("Age");
            String agetype = request.getParameter("AgeType");
            String homeaddress = request.getParameter("HomeAddress");
            String visitdate = request.getParameter("VisitDate");
            String none = request.getParameter("None");
            String deptid = request.getParameter("DeptID");
            String userid = request.getParameter("UserID");
            String registleid = request.getParameter("RegistLeID");
            String setteid = request.getParameter("SettleID");
            String isbook = request.getParameter("IsBook");
            String registtime = request.getParameter("RegistTime");
            String registerid = request.getParameter("RegisterID");
            String visitstate = request.getParameter("VisitState");
            Date birth = null;
            Date visit = null;
            Date regist = null;
            try {
                birth = sdf.parse(birthdate);
                visit = sdf.parse(visitdate);
                regist = hsm.parse(registtime);
                Collector collector = new Collector(casenumber, realname, gender, idnumber, birth, age, agetype, homeaddress, visit, none, deptid, userid, registleid, setteid, isbook, regist, registerid, visitstate);
                if (collectorbiz.add(collector) > 0) {//新增成功
                    System.out.println("新增成功");
                    response.sendRedirect(request.getContextPath() + "pages/Registered-Fees/On-site-registration.html");
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else if (method.equals("CollectorList")) {//读取regist表格数据不带分页
            List<Collector> collectorList = collectorbiz.getCollectorList();
            String collectorJSON = JSON.toJSONStringWithDateFormat(collectorList, "yyyy-MM-dd");
            out.print(collectorJSON);
        } else if (method.equals("CollectorListPage")) {//读取regist表格数据带分页
            //获得页面当前页码page,
            int page = request.getParameter("page") == null ? 1 : Integer.parseInt(request.getParameter("page"));
            //获得页面页大小limit
            int limit = request.getParameter("limit") == null ? 1 : Integer.parseInt(request.getParameter("limit"));
            List<Collector> collectorList = collectorbiz.getCollectorListByPage(page,limit);
            StringBuilder sb = new StringBuilder("");
            sb.append("{" +
                    "  \"code\": 0," +
                    "  \"msg\": \"\"," +
                    "  \"count\": " + collectorbiz.getCollectorCount() + "," +
                    "  \"data\":");
            String collectorListJSON = JSON.toJSONStringWithDateFormat(collectorList, "yyyy-MM-dd ");
            sb.append(collectorListJSON);//拼接对象数组
            sb.append("}");
            out.print(sb.toString());
           /* String collectorListJSON = JSON.toJSONStringWithDateFormat(collectorList, "yyyy-MM-dd");
            out.print(collectorListJSON);*/
        } else if (method.equals("delnumber")) {//退号删除数据
            String casenumber = request.getParameter("CaseNumber");
            if (collectorbiz.delCollectorById(casenumber) > 0) {
                out.print("success");
            } else {
                out.print("error");
            }

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
