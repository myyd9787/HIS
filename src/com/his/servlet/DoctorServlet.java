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
        //暂存1
        else if (method.equals("medicalRecordSave1")){
            String caseNumber = req.getParameter("caseNumber1");
            int registId = Integer.parseInt(req.getParameter("registId1"));
            String readMe = req.getParameter("readMe");
            String present = req.getParameter("present");
            String presentTreat = req.getParameter("presentTreat");
            String history = req.getParameter("history");
            String allergy = req.getParameter("allergy");
            String physique = req.getParameter("physique");
            MedicalRecord medicalRecord = new MedicalRecord(caseNumber, registId, readMe, present, presentTreat, history,
                    allergy, physique);
            medicalRecord.setCaseState(1);//暂存
            if (doctorBiz.isExistMedicalRecord(caseNumber, registId)){
                if (doctorBiz.updateMedicalRecord(medicalRecord, caseNumber, registId)>0){
                    System.out.println("success!");
                }else{
                    System.out.println("fail!");
                }
            }else{
                if(doctorBiz.setMedicalRecord(medicalRecord)>0){
                    System.out.println("success!");
                }else{
                    System.out.println("fail!");
                }
            }

        //提交1
        }else if (method.equals("medicalRecordSubmit1")){
            String caseNumber = req.getParameter("caseNumber1");
            int registId = Integer.parseInt(req.getParameter("registId1"));
            String readMe = req.getParameter("readMe");
            String present = req.getParameter("present");
            String presentTreat = req.getParameter("presentTreat");
            String history = req.getParameter("history");
            String allergy = req.getParameter("allergy");
            String physique = req.getParameter("physique");
            MedicalRecord medicalRecord = new MedicalRecord(caseNumber, registId, readMe, present, presentTreat, history,
                    allergy, physique);
            medicalRecord.setCaseState(2);//提交
            if (doctorBiz.isExistMedicalRecord(caseNumber, registId)){
                if (doctorBiz.updateMedicalRecord(medicalRecord, caseNumber, registId)>0){
                    System.out.println("success!");
                }else{
                    System.out.println("fail!");
                }
            }else{
                if(doctorBiz.setMedicalRecord(medicalRecord)>0){
                    System.out.println("success!");
                }else{
                    System.out.println("fail!");
                }
            }
        }
        //暂存2
        else if(method.equals("medicalRecordSave2")){
            String caseNumber = req.getParameter("caseNumber2");
            int registId = Integer.parseInt(req.getParameter("registId2"));
            String checkResult = req.getParameter("checkResult");
            String diagnosis = req.getParameter("diagnosis");
            String handling = req.getParameter("handling");
            MedicalRecord medicalRecord = new MedicalRecord(checkResult, diagnosis, handling);
            medicalRecord.setCaseState(1);//暂存
            if(doctorBiz.updateMedicalRecord(medicalRecord, caseNumber, registId)>0){
                System.out.println("success!");
            }else {
                System.out.println("fail!");
            }
        }
        //提交2
        else if(method.equals("medicalRecordSubmit2")){
            String caseNumber = req.getParameter("caseNumber2");
            int registId = Integer.parseInt(req.getParameter("registId2"));
            String checkResult = req.getParameter("checkResult");
            String diagnosis = req.getParameter("diagnosis");
            String handling = req.getParameter("handling");
            MedicalRecord medicalRecord = new MedicalRecord(checkResult, diagnosis, handling);
            medicalRecord.setCaseState(3);//诊毕
            if((doctorBiz.updateMedicalRecord(medicalRecord, caseNumber, registId)>0)
                    &&(doctorBiz.changeRegisterState(registId)>0)){//同时修改register号的visitstate为诊毕
                System.out.println("success!");
            }else {
                System.out.println("fail!");
            }
        }
//        else if(method.equals("")){}

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doPost(req, resp);
    }
}
