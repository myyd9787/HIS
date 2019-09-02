package com.his.servlet;

import com.alibaba.fastjson.JSON;
import com.his.biz.DrugsBiz;
import com.his.biz.impl.DrugsBizImpl;
import com.his.entity.Drugs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "DrugsServlet",urlPatterns = "/DrugsServlet")
public class DrugsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("html/text;utf-8");
        DrugsBiz drugsBiz = new DrugsBizImpl();
        PrintWriter out = response.getWriter();
        String method = request.getParameter("method");
        //多表查询返回数据
        if(method.equals("DrugsList")){
            List<Drugs> drugsList = new ArrayList<>();
            int page = request.getParameter("page")==null?1:Integer.parseInt(request.getParameter("page"));
            int limit = request.getParameter("limit")==null?1:Integer.parseInt(request.getParameter("limit"));
            drugsList = drugsBiz.getDrugs(page,limit);
            String drugsJSON = JSON.toJSONStringWithDateFormat(drugsList,"yyyy/MM/dd HH:mm:ss");
            StringBuffer sb = new StringBuffer("");
            sb.append("{" +
                    "  \"code\": 0," +
                    "  \"msg\": \"\"," +
                    "  \"count\": 1000," +
                    "  \"data\": [{");
            sb.append(drugsJSON);
            sb.append("}");
            out.print(sb);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
