package com.his.servlet;

import com.his.biz.UserBiz;
import com.his.biz.impl.UserBizImpl;
import com.his.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String method=request.getParameter("method");
        UserBiz userBiz=new UserBizImpl();
        if(method.equals("login")){//执行登录操作
            String userName=request.getParameter("username");
            String passWord=request.getParameter("password");
            String usertype = request.getParameter("UserType");
            User user=userBiz.login(userName,passWord);
            if(user!=null){
                switch (usertype){
                    case "0"://进入医院管理员界面
                        response.sendRedirect(request.getContextPath()+"/index.html");
                        break;
                    case "1"://进入挂号收费员界面
                        response.sendRedirect(request.getContextPath()+"/index.html");
                        break;
                    case "2"://进入门诊医生界面
                        response.sendRedirect(request.getContextPath()+"/index.html");
                        break;
                    case "3"://进入医技处理界面
                        response.sendRedirect(request.getContextPath()+"/index.html");
                        break;
                    case "4"://进入药房操作员界面
                        response.sendRedirect(request.getContextPath()+"/index.html");
                        break;
                    case "5"://进入财务管理员界面
                        response.sendRedirect(request.getContextPath()+"/index.html");
                        break;
                }
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
