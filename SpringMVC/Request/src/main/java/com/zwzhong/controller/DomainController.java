package com.zwzhong.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class DomainController {
    @RequestMapping("/testServletAPI")
    public String testServletAPI(HttpServletRequest httpServletRequest){
        httpServletRequest.setAttribute("servlet","Hello Servlet");
        return "show";
    }
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(ModelAndView mv){
        mv.setViewName("show");
        mv.addObject("mv","ModelAndView");
        return mv;
    }
    @RequestMapping("/testModel")
    public String testModelAndView(Model model){
        model.addAttribute("model","Hello Model");
        return "show";
    }

    @RequestMapping("/testModelMap")
    public String testModelAndView(ModelMap modelMap){
        modelMap.addAttribute("modelMap","hello modelMap");
        return "show";
    }

    @RequestMapping("/testSession")
    public String testSession(HttpSession session){
        session.setAttribute("sess","Hello Session");
        return "show";
    }
    @RequestMapping("/testApplication")
    public String testApplication(HttpSession session){
        ServletContext servletContext = session.getServletContext();
        servletContext.setAttribute("app","hello,Application");
        return "show";
    }
}
