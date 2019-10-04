/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.act.showcase.controller;

import com.act.showcase.dto.User;
import com.act.showcase.form.LoginForm;
import com.act.showcase.model.UserModel;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author pc
 */
@Controller
public class HomeController {
    
    @RequestMapping("/laptrinhbangNNTN")
    public String laptrinhbangNNTN(){
        return "LaptrinhbangNNTN";
    }
    @RequestMapping("/laptrinhCcanban")
    public String laptrinhCcanban(){
        return "LaptrinhCcanban";
    }
    @RequestMapping("/giaithuatcanban")
    public String giaithuatcanban(){
        return "Giaithuatcanban";
    }
    @RequestMapping("/giaithuatnangcao")
    public String giaithuatnangcao(){
        return "Giaithuatnangcao";
    }
    @RequestMapping("/vechungtoi")
    public String vechungtoi(){
        return "Vechungtoi";
    }
    @RequestMapping("/")
    public String index(Model model) {
        //---- lay dw lieu tu mode
        //---- truyen cho view
                System.out.println("home");
        try {
            UserModel userModel = new UserModel();
            model.addAttribute("user", userModel);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "index";
    }
}
