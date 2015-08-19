package com.bit2015.emaillist3.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bit2015.emaillist3.dao.EmaillistDao;
import com.bit2015.emaillist3.vo.EmaillistVo;

@Controller
public class EmaillistController {
	
	@Autowired
	private EmaillistDao emaillistDao;
	
	
	@RequestMapping("/emaillist")
	public String list(Model model){
			
			List<EmaillistVo> list = emaillistDao.getList();
			model.addAttribute("list",list);
			
			return "list";
	}
	
	@RequestMapping("/form")
	public String form(){
		return "/form_emaillist";
	}
	
	@RequestMapping("/insert")
	public String insert(@ModelAttribute EmaillistVo emaillistVo){ //jsp 파일에서 EmaillistVo의 변수명과 같으면 이렇게 받을수있다.
		
		emaillistDao.insert(emaillistVo);
		
		return "redirect:/emaillist";
	}
	
	@RequestMapping("/delete/{no}")
	public String delete( @PathVariable("no") long no ){
		
		emaillistDao.delete(no); 
		
		return "redirect:/emaillist";
	}
	

	
}
