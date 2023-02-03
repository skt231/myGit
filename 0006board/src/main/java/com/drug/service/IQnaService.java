package com.drug.service;

import java.util.List;

import com.drug.dto.QnaDto;
import com.drug.vo.PageMaker;


public interface IQnaService {
	public void write(QnaDto qna) throws Exception;
	public QnaDto read(int bno) throws Exception;
	public void modify(QnaDto qna) throws Exception;
	public void remove(int bno) throws Exception;
	
	public List<QnaDto> listSearchCriteria(PageMaker pm) throws Exception; 
	 public int listSearchCount(PageMaker pm) throws Exception; 
}
