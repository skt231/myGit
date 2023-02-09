package com.drug.ex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.drug.dto.QnaDTO;
import com.drug.service.IQnaService;
import com.drug.vo.PageMaker;

@Controller
@RequestMapping("/qna/*")
public class QnaController {
	@Autowired
	private IQnaService bs;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void list(PageMaker pm, Model model) throws Exception {
		logger.info("listPage");
		System.out.println("--list pm " + pm);
		// PageMaker [page=2, perPageNum=10, searchType=t, keyword=888, totalCount=0,
		// startPage=0, endPage=0, prev=false, next=false]
		model.addAttribute("list", bs.listSearchCriteria(pm));
		pm.setTotalCount(bs.listSearchCount(pm));
		// model.addAttribute("pageMaker",pm);
		// return "qna/list";
	}

	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public void writeGet() throws Exception {
		// return "/qna/write

	}

	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String writePost(QnaDTO qna, RedirectAttributes rttr) throws Exception {
		bs.write(qna);
		// rttr.addAttribute("msg","success");
		rttr.addFlashAttribute("msg", "success");
		return "redirect:/qna/list";
	}

	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("bno") int bno, PageMaker pm, Model model) throws Exception {
		System.out.println("-----read pm" + pm);
		model.addAttribute(bs.read(bno));
		// return "/qna/read
	}

	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String remove(@RequestParam("bno") int bno, PageMaker pm, Model model, RedirectAttributes rttr)
			throws Exception {
		bs.remove(bno);

		rttr.addAttribute("page", pm.getPage());
		rttr.addAttribute("perPageNum", pm.getPerPageNum());
		rttr.addAttribute("searchType", pm.getSearchType());
		rttr.addAttribute("keyword", pm.getKeyword());

		rttr.addFlashAttribute("msg", "success");
		return "redirect:/qna/list";
	}

	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void modifyGet(@RequestParam("bno") int bno, PageMaker pm, Model model) throws Exception {
		System.out.println(pm);
		model.addAttribute(bs.read(bno));
	}

	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyPost(QnaDTO qna, PageMaker pm, Model model, RedirectAttributes rttr) throws Exception {
		bs.modify(qna);
		System.out.println(pm);

		rttr.addAttribute("page", pm.getPage());
		rttr.addAttribute("perPageNum", pm.getPerPageNum());
		rttr.addAttribute("searchType", pm.getSearchType());

		rttr.addAttribute("keyword", pm.getKeyword());

		rttr.addFlashAttribute("msg", "success");
		return "redirect:/qna/list";
	}
	@RequestMapping(value="/faq", method=RequestMethod.GET)
	public String faq() {
		return "/qna/faq";
	}

}
