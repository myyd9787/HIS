package com.his.servlet;

import com.alibaba.fastjson.JSON;
import com.his.biz.ManagerBiz;
import com.his.biz.impl.ManagerBizImpl;
import com.his.entity.ConstantType;
import com.his.entity.Manager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet( "/ManagerServlet")
public class ManagerServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String method=request.getParameter("method");
        ManagerBiz managerBiz=new ManagerBizImpl();

        PrintWriter out=response.getWriter();
        if(method.equals("constantList")){
            List<ConstantType> constantTypeList=managerBiz.getConstantTypeList();

            String constantTypeJSON=JSON.toJSONString(constantTypeList);
            System.out.print(constantTypeJSON);
            out.print(constantTypeJSON);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
