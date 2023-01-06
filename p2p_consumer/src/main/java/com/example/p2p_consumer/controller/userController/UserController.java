package com.example.p2p_consumer.controller.userController;

import com.example.p2p_consumer.service.UserService;
import com.example.p2p_commons.commons.ReturnObject;
import com.example.p2p_commons.mybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/userController")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/logincheck")
    public String logincheck(){
        return "logincheck";
    }


    @RequestMapping("/userLogin")
    public String userLogin(String phone, String loginPassword, Model model, HttpSession httpSession){
        ReturnObject<User> returnObject = userService.judgeUserLogin(phone, loginPassword);
        if(returnObject.getCode() == 200){
            httpSession.setAttribute("usersession",returnObject.getResult());
        }else {
            model.addAttribute("errorMessage","登录失败");
            return "login";
        }
        return "redirect:/";
    }
}
