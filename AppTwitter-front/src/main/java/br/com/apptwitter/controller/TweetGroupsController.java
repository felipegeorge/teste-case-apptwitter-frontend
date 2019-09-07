package br.com.apptwitter.controller;

import java.io.Serializable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TweetGroupsController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@RequestMapping(value = "/groupbyhours")
    public String groupByHours() {
        return "tweetGroupByHours.html";
    }

	@RequestMapping(value = "/groupbyhastag")
    public String groupByHashtag() {
        return "tweetGroupByHashtag.html";
    }
	
}
