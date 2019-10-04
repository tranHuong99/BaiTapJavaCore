/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.act.showcase.controller;

import com.act.showcase.dto.User;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author HUONG XINH GAI
 */
@Controller
public class RegistrationController {
    private String[] courses = new String[] { "Lập trình bằng ngôn ngữ tự nhiên", "Lập trình C căn bản", "Giải thuật căn bản", "Giải thuật nâng cao" };
    @RequestMapping(value = "/dangkyhoc", method = RequestMethod.GET)
    public String showView(@RequestParam("course") int course, Model model){
        User user = new User();
        user.setCourse(courses[course]);
        model.addAttribute("user", user);
        return "dangkyhoc";
    }
    
    @RequestMapping(value = "/dangkyhoc", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("user")User user, 
      BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            System.out.println("Error-----------------------------");
        }
        
        final String username = "tranhuong@hocvienact.edu.vn";
        final String password = "egoqbmfkqacalluf";

        Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS
        
        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            MimeMessage message = new MimeMessage(session);
            message.setHeader("Content-Type", "text/plain; charset=UTF-8");
            message.setFrom(new InternetAddress("tranhuong@hocvienact.edu.vn"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse("tranhuong@hocvienact.edu.vn")
            );
            message.setSubject("Thông tin học viên", "utf-8");
            message.setContent("Họ tên: " + user.getName()
                    + "\n\n"
                    + "Số điện thoại: " + user.getPhone()
                    + "\n"
                    + "Email: " + user.getEmail()
                    + "\n"
                    + "Khóa học: " + user.getCourse(),
                    "text/plain; charset=UTF-8"
            );

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
       
        return "dangkyhoc";
    }
}
