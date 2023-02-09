package com.drug.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.drug.dto.QnaDTO;
import com.drug.vo.PageMaker;

public interface QnaDAO {
	  public void create(QnaDTO vo) throws Exception;
	  public QnaDTO read(@Param("bno")int bno, @Param("indent")int indent, @Param("depthno")int depthno) throws Exception;

	  public void update(QnaDTO vo) throws Exception;

	  public void delete(int bno) throws Exception;

	//  
	  public List<QnaDTO> listSearch(PageMaker pm)throws Exception;
	//  
	  public int listSearchCount(PageMaker pm)throws Exception;

	  //reply
	  
	  
}
