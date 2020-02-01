package com.xwx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xwx.entity.Applicant; 
import com.xwx.service.AppService;

@Controller
public class AppController {

	@Autowired
	AppService service;
	
	@RequestMapping("list")
	private String getList(Model model,@RequestParam(defaultValue="1")int pageNum) {
		PageHelper.startPage(pageNum, 3);
		List<Applicant> list = service.getList();
		PageInfo<Applicant> info = new PageInfo<>(list);
		model.addAttribute("list", list);
		model.addAttribute("info", info);
		return "list";
	}
	
	@RequestMapping("toadd")
	private String toadd() {
		return "add";
	}


	@RequestMapping("tj")
	private String tj(Applicant a) {
		service.tj(a);
		return "redirect:/list";
	}
	
	
	@RequestMapping("del")
	private String del(int id) {
		
		service.del(id);
		return "redirect:/list";
	}
	
	@RequestMapping("zc")
	private String getZc(Applicant a,Model model) {
		List<Applicant> list = service.zc();
		model.addAttribute("a", list);
		return "zc";
	}
	
	
	@RequestMapping("pjf")
	private String getPjf(Applicant a,Model model) {
		service.pjf(a);
		model.addAttribute("a", a);
		return "pjf";
	}
	
	@RequestMapping("yjs")
	private String getYjs(Applicant a,Model model) {
		service.yjs(a);
		model.addAttribute("a", a);
		return "yjs";
	}
	
}
