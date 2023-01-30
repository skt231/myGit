package com.human.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.human.dto.pocketDto;
import com.human.service.IPocketService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	private IPocketService service;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("welcome home! The client locale is{}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		return "redirect:selectAll";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(pocketDto pocketDto) {
		System.out.println(pocketDto);
		return "update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateDB(pocketDto pocketDto, RedirectAttributes rttr) throws Exception {
		service.update(pocketDto);
		rttr.addFlashAttribute("msg", "success");
		return "redirect:selectAll";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(String name, RedirectAttributes rttr) throws Exception {
		service.delete(name);
		rttr.addFlashAttribute("msg", "success");
		return "redirect:selectAll";
	}

	@RequestMapping(value = "/selectAll", method = RequestMethod.GET)
	public String selectAll(Model model) throws Exception {
		model.addAttribute("list", service.selectAll());
		return "selectAll";
	}

	@RequestMapping(value = "/selectName", method = RequestMethod.GET)
	public String SelectName(String name, Model model) throws Exception {
		model.addAttribute("dto", service.selectName(name));
		return "selectName";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert() {
		return "insert";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insertDB(pocketDto pocketDto, RedirectAttributes rttr) throws Exception {
		service.insert(pocketDto);
		rttr.addFlashAttribute("msg", "success");
		return "redirect:/selectAll";
	}
}
