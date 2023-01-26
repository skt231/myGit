package com.human.service;

import java.util.List;

import com.human.dto.PocketDto;


public interface IPocketService {
	public void insert(PocketDto dto) throws Exception;
	public List<PocketDto> selectAll() throws Exception;
	public void delete(String name) throws Exception;
	public void update(PocketDto dto) throws Exception;
	public PocketDto select(String name) throws Exception;
}
