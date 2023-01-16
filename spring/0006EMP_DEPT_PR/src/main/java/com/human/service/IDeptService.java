package com.human.service;

import java.util.ArrayList;
import java.util.List;

import com.human.dto.DeptDto;

public interface IDeptService {
	public void insert(DeptDto dto) throws Exception;
	public void update(DeptDto dto) throws Exception;
	public void delete(int deptno) throws Exception;
	public ArrayList<DeptDto> selectAll() throws Exception;
	public DeptDto selectOne(int deptno) throws Exception;
}
