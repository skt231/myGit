package com.human.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.human.dto.EmpDeptVo;
import com.human.dto.EmpDto;
import com.human.service.IEmpService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class EmpController {
	
	private static final Logger logger = LoggerFactory.getLogger(EmpController.class);
	@Autowired
	private IEmpService empService;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/emp/modify", method = RequestMethod.GET)
	public String modify(Model model,int empno) throws Exception{
		System.out.println("modify");
		model.addAttribute(empService.selectOne(empno));
		return "/emp/update";
	}
	@RequestMapping(value = "/emp/modify", method = RequestMethod.POST)
	public String modifyDB(Model model,EmpDto dto,RedirectAttributes ra) throws Exception{
		System.out.println("modify DB");
		empService.update(dto);
		ra.addFlashAttribute("msg","success");
		return "redirect:/emp/selectAll";
	}
	@RequestMapping(value = "/emp/delete", method = RequestMethod.GET)
	public String delete(int empno,RedirectAttributes ra) throws Exception{
		System.out.println("delete DB");
		empService.delete(empno);
		ra.addFlashAttribute("msg", "success");
		return "redirect:/emp/selectAll";
	}
	@RequestMapping(value = "/emp/read", method = RequestMethod.GET)
	public void read(Model model,int empno) throws Exception{
		System.out.println("selectOne DB");
		model.addAttribute(empService.selectOne(empno));
	}
	@RequestMapping(value = "/emp/selectAll", method = RequestMethod.GET)
	public void home(Model model)throws Exception{
		System.out.println("SELECT ALL DB");
		ArrayList<EmpDto> dtos = empService.selectAll();
		System.out.println(dtos);
		model.addAttribute("list", dtos);
	}
	@RequestMapping(value = "/emp/insert", method = RequestMethod.GET)
	public void insert() throws Exception{
		System.out.println("insert INPUT");
	}
	@RequestMapping(value = "/emp/insert", method = RequestMethod.POST)
	public String insertDB(EmpDto dto, RedirectAttributes ra) throws Exception{
		System.out.println("insert DB");
		empService.insert(dto);
		ra.addFlashAttribute("msg", "success");
		return "redirect:/emp/selectAll";
	}
	@RequestMapping(value = "/emp/empdeptjoin", method = RequestMethod.GET)
	public void join(Model model) throws Exception{
		System.out.println("select all emp dept join");
		ArrayList<EmpDeptVo> dtos = empService.selectAllEmpDept();
		System.out.println(dtos);
		model.addAttribute("list", dtos);
	}
}
