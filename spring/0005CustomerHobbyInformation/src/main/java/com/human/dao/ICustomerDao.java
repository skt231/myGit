package com.human.dao;

import java.util.List;

import com.human.dto.CustomerDto;
import com.human.dto.HobbyDto;

public interface ICustomerDao {
	public void insert(CustomerDto dto) throws Exception;

	public HobbyDto select(CustomerDto dto) throws Exception;

	public List<CustomerDto> selectAll() throws Exception;

	public void delete(CustomerDto dto) throws Exception;

	public void update(CustomerDto dto) throws Exception;

	public List<Integer> insertItem() throws Exception;

	public List<String> selectId(Integer id) throws Exception;

	public void deleteId(int id) throws Exception;
}
