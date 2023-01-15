package com.human.service;

import java.util.ArrayList;

import com.human.dto.PocketDto;

public interface IPocketService {
	public void insert(PocketDto dto) throws Exception;
	public void update(PocketDto dto) throws Exception;
	public void delete(String name) throws Exception;
	public ArrayList<PocketDto> selectAll() throws Exception;
	public PocketDto selectName(String name) throws Exception;
	
}
