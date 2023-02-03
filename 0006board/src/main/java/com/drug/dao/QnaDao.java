package com.drug.dao;

import java.util.List;

import com.drug.dto.QnaDto;
import com.drug.vo.PageMaker;

public interface QnaDao {
	public void create(QnaDto vo) throws Exception;
	public QnaDto read(int bno)throws Exception;
	public void update(QnaDto vo) throws Exception;
	public void delete(int bno) throws Exception;
	public List<QnaDto> listSearch(PageMaker pm) throws Exception;
	public int listSearchCount(PageMaker pm) throws Exception;
	
}
