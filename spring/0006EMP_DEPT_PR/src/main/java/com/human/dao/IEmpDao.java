package com.human.dao;

import java.util.ArrayList;
import java.util.List;

import com.human.dto.EmpDeptVo;
import com.human.dto.EmpDto;

public interface IEmpDao {
	public void insert(EmpDto dto) throws Exception;
	public void update(EmpDto dto) throws Exception;
	public void delete(int empno) throws Exception;
	public ArrayList<EmpDto> selectAll() throws Exception;
	public EmpDto selectOne(int empno) throws Exception;
	public ArrayList<EmpDeptVo> selectAllEmpDept() throws Exception;
}
