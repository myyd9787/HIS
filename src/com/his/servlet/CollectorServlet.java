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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/CollectorServlet")
public class CollectorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             String method = request.getParameter("method");
             PrintWriter out = response.getWriter();
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
                 String registtime = request.getParameter("RegistTime");
                 String registerid = request.getParameter("RegisterID");
                 String visitstate = request.getParameter("VisitState");
                 Collector collector = new Collector(casenumber,realname,gender,idnumber,birthdate,age
                 ,agetype,homeaddress,visitdate,none,deptid,userid,registleid,setteid,isbook,registtime,registerid
                 ,visitstate);
                 if (collectorbiz.add(collector)>0){//新增成功
                     System.out.println("新增成功");
                     response.sendRedirect(request.getContextPath()+"/On-site-registration.html");
                 }

             }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
