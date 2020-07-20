package com.mat.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.gson.Gson;
import com.mat.dao.HCDAO;
import com.mat.model.Criteria;
import com.mat.model.PageMaker;
import com.mat.model.SecurityLightVO;
import com.mat.model.SelectKey;

@Controller
public class MainController {

	@Autowired
	private HCDAO dao;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String mainPage(Model model, @ModelAttribute("cri") Criteria cri){
		
		List<SecurityLightVO> lamp = new ArrayList<SecurityLightVO>();
		List<SecurityLightVO> allLamp = new ArrayList<SecurityLightVO>();
		List<String> dongName = new ArrayList<String>();
		List<String> dongSubName = new ArrayList<String>();
		
		try {
			PageMaker pm = new PageMaker();
			pm.setCri(cri);
			pm.setTotalCount(dao.getCount(cri));
			lamp = dao.selectList(cri);
			allLamp = dao.getAllList(cri);
			dongName = dao.getDongName();
			dongSubName = dao.getDongSubName();
			Gson gson = new Gson();
			String lampList = gson.toJson(allLamp);
			model.addAttribute("lamp", lamp);
			model.addAttribute("lampList", lampList);
			model.addAttribute("dongName", dongName);
			model.addAttribute("dongSubName", dongSubName);
			model.addAttribute("pageMaker", pm);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "list";
	}
	
	@RequestMapping(value = "/print", method = RequestMethod.GET)
	public String printPage(@ModelAttribute("key") SelectKey key, Model model){
		System.out.println(key.toString());
		SecurityLightVO lamp = new SecurityLightVO();
		try {			
			lamp = dao.selectLamp(key);
			model.addAttribute("lamp", lamp);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "print";
	}
	
}
