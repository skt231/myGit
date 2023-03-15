package com.test.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.ITestDao;
import com.test.dto.testDto;

@Service
public class testServiceImpl implements ITestService {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void insert(testDto dto) throws Exception {
		ITestDao dao=sqlSession.getMapper(ITestDao.class);
		dao.insert(dto);
	}

	@Override
	public void update(testDto dto) throws Exception {
		ITestDao dao=sqlSession.getMapper(ITestDao.class);
		dao.update(dto);

	}

	@Override
	public void delete(String name) throws Exception {
		ITestDao dao=sqlSession.getMapper(ITestDao.class);
		dao.delete(name);
	}

	@Override
	public ArrayList<testDto> selectAll() throws Exception {
		ITestDao dao=sqlSession.getMapper(ITestDao.class);
		return dao.selectAll();
	}

	@Override
	public testDto selectName(String name) throws Exception {
		ITestDao dao=sqlSession.getMapper(ITestDao.class);
		return dao.selectName(name);
	}

}
