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
import java.math.BigDecimal;
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
        if(method.equals("DrugsList")){   //药品管理—页面刷新显示的所有数据，分页显示
            List<Drugs> drugsList = new ArrayList<>();
            int page = request.getParameter("page")==null?1:Integer.parseInt(request.getParameter("page"));
            int limit = request.getParameter("limit")==null?1:Integer.parseInt(request.getParameter("limit"));
            drugsList = drugsBiz.getDrugs(page,limit);
            String drugsJSON = JSON.toJSONStringWithDateFormat(drugsList,"yyyy/MM/dd HH:mm:ss");
            StringBuffer sb = new StringBuffer("");
            sb.append("{" +
                    "  \"code\": 0," +
                    "  \"msg\": \"\"," +
                    "  \"count\":"+drugsBiz.getCount()+"," +
                    "  \"data\": ");
            sb.append(drugsJSON);
            sb.append("}");
            out.print(sb);
        }else if(method.equals("chaxun")){     //根据药品助记码查询药品
            String username = request.getParameter("username");
            Drugs drugs = drugsBiz.getDrugsByCode(username);
            String drugsJSON = JSON.toJSONString(drugs);
            out.print(drugsJSON);
        }else if (method.equals("saveDrugs")){        //新增药品
            String  drugsCode= request.getParameter("drugsCode");
            String  drugsName= request.getParameter("drugsName");
            String  mnemonicCode= request.getParameter("mnemonicCode");
            String  drugsFormat= request.getParameter("drugsFormat");
            Double drugsPrice= Double.parseDouble(request.getParameter("drugsPrice"));
            String  drugsUnit= request.getParameter("drugsUnit");
            Integer drugsDosageId= Integer.parseInt(request.getParameter("drugsDosageId"));
            Integer drugsTypeId= Integer.parseInt(request.getParameter("drugsTypeId"));
            Drugs drugs = new Drugs(drugsCode,drugsName,drugsFormat,drugsUnit,drugsDosageId,drugsTypeId,drugsPrice,mnemonicCode);
            drugsBiz.save(drugs);
        }else if (method.equals("updataID")){     //通过ID渲染单条数据
            int id =Integer.parseInt(request.getParameter("id")) ;
            Drugs drugs = drugsBiz.getDrugsByid(id);
            String drugsJSON = JSON.toJSONStringWithDateFormat(drugs,"yyyy/MM/dd HH:mm:ss");
            out.print(drugsJSON);
        } else if (method.equals("updataDrugs")){           //编辑药品
            int id =Integer.parseInt(request.getParameter("id")) ;
            String  drugsCode= request.getParameter("drugsCode");
            String  drugsName= request.getParameter("drugsName");
            String  mnemonicCode= request.getParameter("mnemonicCode");
            String  drugsFormat= request.getParameter("drugsFormat");
            Double drugsPrice= Double.parseDouble(request.getParameter("drugsPrice"));
            String  drugsUnit= request.getParameter("drugsUnit");
            Integer drugsDosageId= Integer.parseInt(request.getParameter("drugsDosageId"));
            Integer drugsTypeId= Integer.parseInt(request.getParameter("drugsTypeId"));
            Drugs drugs = new Drugs(drugsCode,drugsName,drugsFormat,drugsUnit,drugsDosageId,drugsTypeId,drugsPrice,mnemonicCode);
            int updata = drugsBiz.updata(drugs,id);
            if (updata>0){
                out.print("操作成功");
            }else {
                out.print("操作失败");
            }
        }else if(method.equals("del")){     //删除药品
            int id =Integer.parseInt(request.getParameter("id")) ;
            int deleteID = drugsBiz.delete(id);
            if (deleteID>0){
                out.print("success");
            }
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
