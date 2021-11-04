package com.FormTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readcookies")
public class ReadCookies extends HttpServlet {
    public ReadCookies(){
        super();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //super.doGet(req, resp);

        Cookie[] cookies = req.getCookies();
        PrintWriter out = resp.getWriter();
        if(cookies==null){
            out.println("this is null cookie");
        }
        else{
            for(Cookie ck:cookies){
                out.println(ck.getName()+": "+ck.getValue());
                //out.println(ck.getValue());
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.doPost(req, resp);
    }
    
}
