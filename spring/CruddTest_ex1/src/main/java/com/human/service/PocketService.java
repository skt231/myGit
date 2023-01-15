package com.human.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.dao.IPocketDao;
import com.human.dto.PocketDto;

@Service
public class PocketService implements IPocketService {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insert(PocketDto dto) throws Exception {
		IPocketDao dao = sqlSession.getMapper(IPocketDao.class);
		dao.insert(dto);

	}

	@Override
	public void update(PocketDto dto) throws Exception {
		IPocketDao dao = sqlSession.getMapper(IPocketDao.class);
		dao.update(dto);

	}

	@Override
	public void delete(String name) throws Exception {
		IPocketDao dao = sqlSession.getMapper(IPocketDao.class);
		dao.delete(name);

	}

	@Override
	public ArrayList<PocketDto> selectAll() throws Exception {
		IPocketDao dao = sqlSession.getMapper(IPocketDao.class);

		return dao.selectAll();
	}

	@Override
	public PocketDto selectName(String name) throws Exception {
		IPocketDao dao = sqlSession.getMapper(IPocketDao.class);
		return dao.selectName(name);
	}

}
