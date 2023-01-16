package com.human.ex;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.human.dto.DeptDto;
import com.human.service.IDeptService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class DeptController {
	
	private static final Logger logger = LoggerFactory.getLogger(DeptController.class);
	@Autowired
	private IDeptService deptService;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/dept/home", method = RequestMethod.GET)
	public String home() throws Exception{
		return "redirect:/dept/selectAll";
	}
	@RequestMapping(value = "/dept/modify", method = RequestMethod.GET)
	public String modify(Model model,int deptno) throws Exception{
		System.out.println("modify");
		model.addAttribute(deptService.selectOne(deptno));
		return "/dept/update";
	}
	@RequestMapping(value = "/dept/modify", method = RequestMethod.POST)
	public String modifyDB(Model model,DeptDto dto,RedirectAttributes ra) throws Exception{
		System.out.println("modify DB");
		deptService.update(dto);
		ra.addFlashAttribute("msg","success");
		return "redirect:/dept/selectAll";
	}
	@RequestMapping(value = "/dept/delete", method = RequestMethod.GET)
	public String delete(int deptno,RedirectAttributes ra) throws Exception{
		System.out.println("delete DB");
		deptService.delete(deptno);
		ra.addFlashAttribute("msg", "success");
		return "redirect:/dept/selectAll";
	}
	@RequestMapping(value = "/dept/read", method = RequestMethod.GET)
	public void read(Model model,int deptno) throws Exception{
		System.out.println("selectOne DB");
		model.addAttribute(deptService.selectOne(deptno));
	}
	@RequestMapping(value = "/dept/selectAll", method = RequestMethod.GET)
	public void home(Model model)throws Exception{
		System.out.println("SELECT ALL DB");
		List<DeptDto> dtos = deptService.selectAll();
		System.out.println(dtos);
		model.addAttribute("list", dtos);
	}
	@RequestMapping(value = "/dept/insert", method = RequestMethod.GET)
	public void insert() throws Exception{
		System.out.println("insert INPUT");
	}
	@RequestMapping(value = "/dept/insert", method = RequestMethod.POST)
	public String insertDB(DeptDto dto, RedirectAttributes ra) throws Exception{
		System.out.println("insert DB");
		deptService.insert(dto);
		ra.addFlashAttribute("msg", "success");
		return "redirect:/dept/selectAll";
	}
	
}
