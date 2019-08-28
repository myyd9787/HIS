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

@WebServlet(name = "UserServlet")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method=request.getParameter("method");
        UserBiz userBiz=new UserBizImpl();
        if(method.equals("login")){//执行登录操作
            String userName=request.getParameter("userName");
            String passWord=request.getParameter("passWord");
            User user=userBiz.login(userName,passWord);
            if(user!=null){
                switch (user.getUseType()){
                    case 1://进入医院管理员界面
                        response.sendRedirect(request.getContextPath()+"");
                        break;
                    case 2://进入挂号收费员界面
                        response.sendRedirect(request.getContextPath()+"");
                        break;
                    case 3://进入门诊医生界面
                        response.sendRedirect(request.getContextPath()+"");
                        break;
                    case 4://进入医技医生界面
                        response.sendRedirect(request.getContextPath()+"");
                        break;
                    case 5://进入药房操作员界面
                        response.sendRedirect(request.getContextPath()+"");
                        break;
                    case 6://进入财务管理员界面
                        response.sendRedirect(request.getContextPath()+"");
                        break;
                }
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
