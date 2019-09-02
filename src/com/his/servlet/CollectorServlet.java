package com.his.servlet;

import com.his.biz.CollectorBiz;
import com.his.biz.impl.CollectorBizImpl;
import com.his.entity.Collector;
import com.his.entity.Register;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/CollectorServlet")
public class CollectorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                request.setCharacterEncoding("utf-8");
                response.setCharacterEncoding("utf-8");
                response.setContentType("text/html;charset=utf-8");
                DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                DateFormat hsm = new SimpleDateFormat("yyyy/MM/dd");
                PrintWriter out = response.getWriter();
                String method = request.getParameter("method");
                CollectorBiz collectorbiz = new CollectorBizImpl();
             if(method.equals("regist")){//新增用户挂号信息
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
                 String  registtime = request.getParameter("RegistTime");
                 String registerid = request.getParameter("RegisterID");
                 String visitstate = request.getParameter("VisitState");
                 Date birth = null;
                 Date visit = null;
                 Date regist = null;
                 try {
                     birth = sdf.parse(birthdate);
                     visit = sdf.parse(visitdate);
                     regist = sdf.parse(registtime);
                     Collector collector = new Collector(casenumber,realname,gender,idnumber,birth,age,agetype,homeaddress,visit,none,deptid,userid,registleid,setteid,isbook,regist,registerid,visitstate);
                     if (collectorbiz.add(collector)>0){//新增成功
                         System.out.println("新增成功");
                         response.sendRedirect(request.getContextPath()+"pages/Registered-Fees/On-site-registration.html");
                     }
                 } catch (ParseException e) {
                     e.printStackTrace();
                 }

             }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
