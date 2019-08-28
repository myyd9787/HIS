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
            String caseNumber=request.getParameter("caseNumber");
            String realName=request.getParameter("realName");
            String  gender=request.getParameter("gender");
            String idNumber=request.getParameter("idNumber");
            try {
                 birthDate=sdf.parse(request.getParameter("birthDate"));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            int age=Integer.parseInt(request.getParameter("age"));
            String ageType=request.getParameter("ageType");
            String homeAdress=request.getParameter("homeAddress");
            try {
                visitDate=sdf.parse(request.getParameter("visitDate"));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            String noon=request.getParameter("noon");
            int deptId=Integer.parseInt(request.getParameter("deptId"));
            int userId=Integer.parseInt(request.getParameter("userId"));
            int registLeId=Integer.parseInt(request.getParameter("registLeId"));
            int settleId=Integer.parseInt(request.getParameter("settleId"));
            String isBook=request.getParameter("isBook");
            try {
                registTime=sdf.parse(request.getParameter("registTime"));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            int registerId=Integer.parseInt(request.getParameter("registerId"));
            int visitState=Integer.parseInt(request.getParameter("visitState"));
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
