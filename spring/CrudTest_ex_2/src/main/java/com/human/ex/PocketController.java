package com.human.ex;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.human.dto.PocketDto;
import com.human.service.IPocketService;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

@Controller
public class PocketController {
	private static final Logger logger = LoggerFactory.getLogger(PocketController.class);

	@Inject
	private IPocketService pocketService;

	@RequestMapping(value = "/pocket/midify", method = RequestMethod.POST)
	public String modifyDB(Model model, PocketDto dto, RedirectAttributes rttr) throws Exception {
		System.out.println("modify db");
		pocketService.update(dto);
		rttr.addFlashAttribute("msg", "success");
		return "redirect:/pocket/selectAll";
	}

	@RequestMapping(value = "/pocket/modify", method = RequestMethod.GET)
	public String modify(Model model, @RequestParam("name") String name) throws Exception {
		System.out.println("modify gui");
		model.addAttribute(pocketService.select(name));
		return "/pocket/update";
	}

	@RequestMapping(value = "/pocket/delete", method = RequestMethod.GET)
	public String delete(@RequestParam("name") String name, RedirectAttributes rttr) throws Exception {
		System.out.println("delete");
		pocketService.delete(name);
		rttr.addFlashAttribute("msg", "success");
		return "redirect:/pocket/selectAll";
	}

	@RequestMapping(value = "/pocket/read", method = RequestMethod.GET)
	public void read(Model model, @RequestParam("name") String name) throws Exception {
		System.out.println("read");
		model.addAttribute(pocketService.select(name));
	}

	@RequestMapping(value = "/pocket/selectAll", method = RequestMethod.GET)
	public void home(Model model) throws Exception {
		System.out.println("selectAll");
		List<PocketDto> dto = pocketService.selectAll();
		System.out.println(dto);
		model.addAttribute("list", dto);
	}

	@RequestMapping(value = "/pocket/insert", method = RequestMethod.GET)
	public void insert() throws Exception {
		System.out.println("insert GUI");
	}

	@RequestMapping(value = "/pocket/insert", method = RequestMethod.POST)
	public String insertData(PocketDto dto, RedirectAttributes rttr) throws Exception {
		System.out.println("insert db");
		pocketService.insert(dto);
		rttr.addFlashAttribute("msg", "success");
		return "redirect:/pocket/selectAll";
	}
}
