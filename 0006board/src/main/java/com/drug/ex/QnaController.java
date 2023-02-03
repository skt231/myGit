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

import com.drug.dto.QnaDto;
import com.drug.service.QnaService;
import com.drug.vo.PageMaker;

@Controller
@RequestMapping("/sboard/*")
public class QnaController {
	@Autowired
	private QnaService qs;

	private static final  Logger logger= LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public void wirteGet() throws Exception{
		//return "/sboard/write"
	}
	
	@RequestMapping(value="/wirte", method=RequestMethod.POST)
	public String wirtePost(QnaDto qna,RedirectAttributes rttr) throws Exception{
		qs.write(qna);
		rttr.addFlashAttribute("msg","success");
		return "redirect:/sboard/list";
	}
	
	@RequestMapping(value="/read", method= RequestMethod.GET)
	public void read(@RequestParam int bno,PageMaker pm,Model model)throws Exception{
		System.out.println("-----read pm"+pm);
		model.addAttribute(qs.read(bno));
		model.addAttribute("list",qs.listSearchCriteria(pm));
		pm.setTotalCount(qs.listSearchCount(pm));
	}
	@RequestMapping(value="/remove", method= RequestMethod.GET)
	public String remove(@RequestParam("bno") int bno,PageMaker pm, Model model,RedirectAttributes rttr) throws Exception{
		qs.remove(bno);
		
		rttr.addAttribute("page",pm.getPage());
		rttr.addAttribute("perPageNum",pm.getPerPageNum());
		rttr.addAttribute("searchType",pm.getSearchType());
		rttr.addAttribute("keyword",pm.getKeyword());
		rttr.addAttribute("msg","success");
		return "redirect:/sboard/list";
	}
	
	@RequestMapping(value="/modify",method=RequestMethod.GET)
	public void modifyGet(@RequestParam("bno") int bno,PageMaker pm,Model model) throws Exception{
		System.out.println(pm);
	}
	@RequestMapping(value="/modify",method=RequestMethod.POST)
	public String modifyPost(QnaDto qna,PageMaker pm,Model model, RedirectAttributes rttr) throws Exception{
		qs.modify(qna);
		System.out.println(pm);
		
		rttr.addAttribute("page",pm.getPage());
		rttr.addAttribute("perPageNum",pm.getPerPageNum());
		rttr.addAttribute("searchType",pm.getSearchType());
		rttr.addAttribute("keyword",pm.getKeyword());
		rttr.addAttribute("msg","success");
		return "redirect:/sboard/list";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void list(PageMaker pm,Model model) throws Exception {
		logger.info("listPage");
		System.out.println("--list pm " + pm);
		//PageMaker [page=2, perPageNum=10, searchType=t, keyword=888, totalCount=0, startPage=0, endPage=0, prev=false, next=false]
		model.addAttribute("list",qs.listSearchCriteria(pm)); 
		pm.setTotalCount(qs.listSearchCount(pm)); 
//		model.addAttribute("pageMaker",pm);
		
	}
}
