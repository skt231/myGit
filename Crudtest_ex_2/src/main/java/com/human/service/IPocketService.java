package com.human.service;

import java.util.ArrayList;

import com.human.dto.pocketDto;

public interface IPocketService {
	public void insert(pocketDto dto) throws Exception;
	public void update(pocketDto dto) throws Exception;
	public ArrayList<pocketDto> selectAll() throws Exception;
	public pocketDto selectName(String name) throws Exception;
	public void delete(String name) throws Exception;
}

