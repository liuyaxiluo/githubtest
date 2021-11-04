package com.FormTest;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloForm")
public class HelloForm extends HttpServlet{
    private static final long serialVersionUID = 1L;
    public HelloForm(){
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //super.doGet(req, resp);
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        String title = "GET method";
        String docType = "<!DOCTYPE html> \n";
        //String age =new String(req.getParameter("age"));
        //String lastname = new String(req.getParameter("lastname"));
        String name = new String(req.getParameter("name"));
        Cookie nameCookie = new Cookie("name",URLEncoder.encode(req.getParameter("name"),"UTF-8"));
        Cookie urlCookie = new Cookie("url",URLEncoder.encode(req.getParameter("url"),"UTF-8"));
        resp.addCookie(nameCookie);
        resp.addCookie(urlCookie);
        nameCookie.setMaxAge(24*24*60);
        urlCookie.setMaxAge(24*24*60);
        out.println(docType +
        "<html>\n" +
        "<head><title>" + title + "</title></head>\n" +
        "<body bgcolor=\"#f0f0f0\">\n" +
        "<h1 align=\"center\">" + title + "</h1>\n" +
        "<ul>\n" +
        "  <li><b>站点名</b>："
        + name + "\n" +
        "  <li><b>网址</b>："
        + req.getParameter("url") + "\n" +
        "</ul>\n" +
        "</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //super.doPost(req, resp);
        doGet(req, resp);
    }
    
}
