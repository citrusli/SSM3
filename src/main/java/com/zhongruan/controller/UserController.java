package com.zhongruan.controller;

import com.zhongruan.bean.UserInfo;
import com.zhongruan.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        List<UserInfo> list = userService.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("userinfos",list);
        mv.setViewName("allUser");
        return mv;
    }

    @RequestMapping("/insertUser.do")
    public String insertUser(UserInfo user){
        userService.insertUser(user);
        return "redirect:findAll.do";
    }

    @RequestMapping("/delUser.do")
    public String delUser(int id){
        userService.delUser(id);
        return "redirect:findAll.do";
    }

    @RequestMapping("/findOne.do")
    public ModelAndView findOne(int id){
        UserInfo userInfo = userService.findOne(id);
        ModelAndView mv = new ModelAndView();
        mv.addObject("userInfo",userInfo);
        mv.setViewName("updateUser");
        return mv;
    }

    @RequestMapping("/updateUser.do")
    public String updateUser(UserInfo userInfo){
        userService.updateUser(userInfo);
        return "redirect:findAll.do";
    }

    @RequestMapping("/log.do")
    public ModelAndView log(UserInfo userInfo){
        System.out.println(userInfo.getUsername()+""+userInfo.getPassword());
        ModelAndView mv = new ModelAndView();
        boolean flag = userService.log(userInfo);
        if(flag){
            mv.setViewName("allUser");
        }
        else{
            mv.setViewName("login");
        }
        return mv;
    }
}
