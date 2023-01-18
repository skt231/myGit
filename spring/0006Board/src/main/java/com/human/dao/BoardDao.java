package com.human.dao;

import java.util.List;

import com.human.dto.BoardDto;
import com.human.vo.PageMaker;

public interface BoardDao {
	public void create(BoardDto vo) throws Exception;

	public BoardDto read(int bno) throws Exception;

	public void update(BoardDto vo) throws Exception;

	public void delete(int bno) throws Exception;

	/*
	 * public List<BoardDto> listSearch(PageMaker pm) throws Exception;
	 * 
	 * public int listSearchCount(PageMaker pm) throws Exception;
	 */
}
