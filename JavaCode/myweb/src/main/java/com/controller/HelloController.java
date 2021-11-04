package com.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.DispatcherServlet;
@WebServlet("/helloController")
public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // TODO Auto-generated method stub
        ModelAndView mv = new ModelAndView("hello.jsp");
        mv.addObject("message", "hellospringmvc");
        return mv;
    }
    
}
