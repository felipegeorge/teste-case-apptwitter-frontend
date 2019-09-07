package br.com.apptwitter.controller;

import java.io.Serializable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@RequestMapping(value = "/usertopfive")
    public String userTopFive() {
        return "userTopFive.html";
    }
}
