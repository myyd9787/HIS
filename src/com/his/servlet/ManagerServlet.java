package com.his.servlet;

import com.alibaba.fastjson.JSON;
import com.his.biz.ManagerBiz;
import com.his.biz.impl.ManagerBizImpl;
import com.his.entity.*;

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
        if(method.equals("constantList")){//获取常数项列表
            List<ConstantType> constantTypeList=managerBiz.getConstantTypeList();

            String constantTypeJSON=JSON.toJSONString(constantTypeList);
//            System.out.print(constantTypeJSON);
            out.print(constantTypeJSON);
        }else if(method.equals("searchConstantList")){//执行模糊查询操作
            String str=request.getParameter("title");
            List<ConstantType> constantTypeList=managerBiz.getConstantTypeListByConstantTypeCode(str);
            List<ConstantType> constantTypeList1=managerBiz.getConstantTypeListByConstantTypeName(str);
            if(method.equals("search")){
                if(constantTypeList==null){
                    String constantTypeJSON=JSON.toJSONString(constantTypeList1);
                    out.print(constantTypeJSON);
                }else{
                    String constantTypeJSON=JSON.toJSONString(constantTypeList);
                    out.print(constantTypeJSON);
                }

            }

        }else if(method.equals("add")){//执行新增操作
            String constantCode=request.getParameter("constantCode");
            String constantName=request.getParameter("constantName");
            ConstantType constantType=new ConstantType(constantCode,constantName);
            if( managerBiz.addConstantType(constantType)>0){
                out.print("success");
            }else{
                out.print("adsads");
            }

        }else if(method.equals("constantItemList")){
           List<ConstantItem>  constantItemList=managerBiz.getConstantItemList();
           String constantItemListJSON=JSON.toJSONString(constantItemList);
           out.print(constantItemListJSON);
        }else if(method.equals("userDetailList")){//获取前端需要显示的用户信息
            String userName=request.getParameter("category");

            if(userName!=null){
                List<UserDetail> userDetailList=managerBiz.getUserDetailListByUserName(userName);
                String userDetailListJSON=JSON.toJSONString(userDetailList);
                out.print(userDetailListJSON);

            }else{
                List<UserDetail> userDetailList=managerBiz.getUserDetailList();
                String userDetailListJSON=JSON.toJSONString(userDetailList);
                out.print(userDetailListJSON);
            }
//            System.out.print(userDetailList);

        }else if(method.equals("constantItemList_edit")){//常数项编辑
            int oldId=Integer.parseInt(request.getParameter("oldid"));
            String constantItemCode=request.getParameter("constantItemCode");
            String constantItemName=request.getParameter("constantItemName");
            int constantItemType=Integer.parseInt(request.getParameter("constantItemType"));
            ConstantItem constantItem=new ConstantItem(constantItemType,constantItemCode,constantItemName);
            if(managerBiz.updateConstantItem(constantItem,oldId)>0){//修改成功

            }else{//修改失败

            }
        }else if(method.equals("constantItem_del")){//删除选中的常数项
            int newId=Integer.parseInt(request.getParameter("newid"));
            if(managerBiz.delConstantItemById(newId)>0){//删除成功

            }else{//删除失败

            }
        }else if(method.equals("addUser")){//新增用户
            String userName=request.getParameter("userName");
            String password=request.getParameter("password");
            String realName=request.getParameter("realName");
            int deptNo=Integer.parseInt(request.getParameter("deptNo"));
            int userTypeId=Integer.parseInt(request.getParameter("userTypeId"));
            int docTitleId=Integer.parseInt(request.getParameter("docTitleId"));
            int registLevelId=Integer.parseInt(request.getParameter("registLevelId"));
            String IsScheduling=request.getParameter("IsScheduling");
            User user=new User(userName,password,realName,userTypeId,docTitleId,IsScheduling,deptNo,registLevelId);
            if(managerBiz.addUser(user)>0){//新增成功
                out.print("success");
            }else{
                out.print("error");
            }
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
