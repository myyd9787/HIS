package com.his.servlet;

import com.alibaba.fastjson.JSON;
import com.his.biz.DoctorBiz;
import com.his.biz.PatientBiz;
import com.his.biz.impl.DoctorBizImpl;
import com.his.biz.impl.PatientBizImpl;
import com.his.dao.PatientDao;
import com.his.entity.Patient;
import com.his.entity.Register;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/PatientServlet")
public class PatientServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        String method = req.getParameter("method");
        PatientBiz patientBiz=new PatientBizImpl();
        PrintWriter out = resp.getWriter();
        if (method.equals("plist2")) {
            int page = req.getParameter("page")==null?1:Integer.parseInt(req.getParameter("page"));
            int limit = req.getParameter("limit")==null?1:Integer.parseInt(req.getParameter("limit"));
            String caseNumber = req.getParameter("caseNumber");
            List<Patient> patientList = patientBiz.getPatient(page,limit,caseNumber);
            String patient1 = JSON.toJSONString(patientList);
            StringBuffer sb = new StringBuffer("");
            sb.append("{" +
                    "  \"code\": 0," +
                    "  \"msg\": \"\"," +
                    "  \"count\": "+patientBiz.getCount()+"," +
                    "  \"data\": ");
            sb.append(patient1);
            sb.append("}");
            out.print(sb);
        }
        else if (method.equals("state1")){ //查询未诊患者列表
            DoctorBiz doctorBiz = new DoctorBizImpl();
                //页码
                int page = req.getParameter("page") == null ? 1 : Integer.parseInt(req.getParameter("page"));
                //页大小
                int limit = req.getParameter("limit") == null ? 1 : Integer.parseInt(req.getParameter("limit"));
                //姓名
                String name = req.getParameter("category");
                if (name != null){
                    List<Register> register = doctorBiz.getRegisterByName(name, page, limit);
                    String register0 = JSON.toJSONString(register);
                    StringBuffer sb = new StringBuffer("");
                    sb.append("{" +
                            "  \"code\": 0," +
                            "  \"msg\": \"\"," +
                            "  \"count\": 50," +
                            "  \"data\": ");
                    sb.append(register0);
                    sb.append("}");
                    out.print(sb);
                }else{
                    List<Register> register = doctorBiz.getRegisterByState(1, page, limit);//1表示已接诊
                    String register0 = JSON.toJSONString(register);
                    StringBuffer sb = new StringBuffer("");
                    sb.append("{" +
                            "  \"code\": 0," +
                            "  \"msg\": \"\"," +
                            "  \"count\": 50," +
                            "  \"data\": ");
                    sb.append(register0);
                    sb.append("}");
                    out.print(sb);
                }

            }


    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
