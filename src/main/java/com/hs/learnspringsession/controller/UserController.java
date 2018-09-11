package com.hs.learnspringsession.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/session/")
public class UserController {

    @RequestMapping("setsession")
    public String setSession(HttpSession session){
        session.setAttribute("username" , "hans");
        session.setAttribute("userage","24");
        return "success";
    }


    @RequestMapping("getsession")
    public Map getSession(HttpSession session){
        Map map = new HashMap();
        map.put("username",(String)session.getAttribute("username"));
        map.put("userage",(String) session.getAttribute("userage"));

        return map;
    }

    @RequestMapping("delsessoin")
    public Map delsession(HttpSession session) {
        session.removeAttribute("username");
        Map map = new HashMap();
        map.put("username",(String)session.getAttribute("username"));
        map.put("userage",(String) session.getAttribute("userage"));

        return map;
    }

}
