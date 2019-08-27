package com.his.servlet;

import com.his.biz.CollectorBiz;
import com.his.biz.impl.CollectorBizImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CollectorServlet")
public class CollectorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CollectorBiz collectorBiz=new CollectorBizImpl();//创建一个挂号收费员对象
        String method=request.getParameter("method");
        if(method.equals("regist")){//现场挂号

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
