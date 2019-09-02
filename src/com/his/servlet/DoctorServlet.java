package com.his.servlet;

import com.alibaba.fastjson.JSON;
import com.his.biz.DoctorBiz;
import com.his.biz.impl.DoctorBizImpl;
import com.his.entity.MedicalRecord;
import com.his.entity.Register;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet( "/DoctorServlet")
public class DoctorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");

        String method = req.getParameter("method");
        DoctorBiz doctorBiz = new DoctorBizImpl();
        PrintWriter out = resp.getWriter();

        //查询未诊患者列表
        if (method.equals("state0")){
            List<Register> register = doctorBiz.getRegisterByState(0);
            String register0 = JSON.toJSONString(register);
            System.out.println(register0);
            out.print(register0);
        }
        //查询已诊患者列表
        else if (method.equals("state1")){
            List<Register> register = doctorBiz.getRegisterByState(1);
            String register1 = JSON.toJSONString(register);
            System.out.println(register1);
            out.print(register1);
        }
        //将病历首页存入数据库
        else if (method.equals("medicalRecord")){
            String readMe = getInitParameter("readMe");
            String present = getInitParameter("present");
            String presentTreat = getInitParameter("presentTreat");
            String history = getInitParameter("history");
            String allergy = getInitParameter("allergy");
            String physique = getInitParameter("physique");
//            MedicalRecord medicalRecord = new MedicalRecord(, readMe, present, presentTreat, history, allergy, physique);

        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
