package com.his.servlet;

import com.his.biz.CollectorBiz;
import com.his.biz.impl.CollectorBizImpl;
import com.his.entity.Register;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "CollectorServlet")
public class CollectorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CollectorBiz collectorBiz=new CollectorBizImpl();//创建一个挂号收费员对象
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date birthDate=null;
        Date visitDate=null;
        Date registTime=null;
        String method=request.getParameter("method");
        if(method.equals("regist")){//现场挂号
            String caseNumber=request.getParameter("CaseNumber");
            String realName=request.getParameter("RealName");
            String  gender=request.getParameter("Gender");
            String idNumber=request.getParameter("IDnumber");
            try {
                 birthDate=sdf.parse(request.getParameter("BirthDate"));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            int age=Integer.parseInt(request.getParameter("Age"));
            String ageType=request.getParameter("AgeType");
            String homeAdress=request.getParameter("HomeAddress");
            try {
                visitDate=sdf.parse(request.getParameter("VisitDate"));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            String noon=request.getParameter("Noon");
            int deptId=Integer.parseInt(request.getParameter("DeptID"));
            int userId=Integer.parseInt(request.getParameter("UserID"));
            int registLeId=Integer.parseInt(request.getParameter("RegistLeID"));
            int settleId=Integer.parseInt(request.getParameter("SettleID"));
            String isBook=request.getParameter("IsBook");
            try {
                registTime=sdf.parse(request.getParameter("RegistTime"));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            int registerId=Integer.parseInt(request.getParameter("RegisterID"));
            int visitState=Integer.parseInt(request.getParameter("VisitState"));
            Register register=new Register(caseNumber,realName,gender,idNumber,birthDate,age,ageType,homeAdress,visitDate,noon,deptId,userId,registLeId,settleId,isBook,registTime,registerId,visitState);
            if(collectorBiz.regist(register)>0){//现场挂号成功

            }else{//挂号失败

            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
