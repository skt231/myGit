package com.human.dao;

import java.util.ArrayList;

import com.human.dto.pocketDto;

public interface IPocketDao {
	public void insert(pocketDto dto) throws Exception;
	public void update(pocketDto dto) throws Exception;
	public void delete(String name) throws Exception;
	public ArrayList<pocketDto> selectAll() throws Exception;
	public pocketDto selectName(String name) throws Exception;
}
