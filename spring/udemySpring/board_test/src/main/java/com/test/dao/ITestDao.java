package com.test.dao;

import java.util.ArrayList;

import com.test.dto.testDto;

public interface ITestDao {
	public void insert(testDto dto) throws Exception;
	public void update(testDto dto) throws Exception;
	public void delete(String name) throws Exception;
	public ArrayList<testDto> selectAll() throws Exception;
	public testDto selectName(String name) throws Exception;
}
