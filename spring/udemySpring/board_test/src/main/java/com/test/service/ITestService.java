package com.test.service;

import java.util.ArrayList;

import com.test.dto.testDto;

public interface ITestService {
	public void insert(testDto dto) throws Exception;

	public void update(testDto dto) throws Exception;

	public void delete(String name) throws Exception;

	public ArrayList<testDto> selectAll() throws Exception;

	public testDto selectName(String name) throws Exception;
}
