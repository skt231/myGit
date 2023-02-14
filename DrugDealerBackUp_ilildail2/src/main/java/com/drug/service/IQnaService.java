package com.drug.service;

import java.util.List;

import com.drug.dto.QnaDTO;
import com.drug.vo.PageMaker;

public interface IQnaService {
	public void write(QnaDTO board) throws Exception;
	public QnaDTO read(int bno, int indent, int depthno) throws Exception;
	public void modify(QnaDTO board) throws Exception;
	public void remove(int bno) throws Exception;
	
	public List<QnaDTO> listSearchCriteria(PageMaker pm) throws Exception;
	public int listSearchCount(PageMaker pm) throws Exception;
	public void viewCount(int bno) throws Exception;
	}
	

