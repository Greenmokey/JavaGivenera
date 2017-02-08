package com.givenera.share.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.givenera.share.entity.Content;
import com.givenera.share.entity.User;
import com.givenera.share.service.ContentService;
import com.givenera.share.service.UserService;


@Controller  
@RequestMapping("/user")  
public class UserController {  
	@Resource
	private UserService userService;
	@Resource
	private ContentService contentService; 
    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){  
//        int userId = Integer.parseInt(request.getParameter("id"));  
        User user1 = this.userService.getUserById(1);
        User user2 = this.userService.getUserById(2);
        Content content = this.contentService.getAppreciationById("01b82788-bad0-4548-a63d-1e4efaf90026");

        model.addAttribute("content", content);

        model.addAttribute("user1", user1);
        model.addAttribute("user2", user2);
        return "home";  
    }
    


}
