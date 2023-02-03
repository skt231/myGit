package com.drug.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drug.dao.QnaDao;
import com.drug.dto.QnaDto;
import com.drug.vo.PageMaker;

@Service
public class QnaService implements IQnaService {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public void write(QnaDto qna) throws Exception {
		QnaDao dao = sqlSession.getMapper(QnaDao.class);
		dao.create(qna);
	}

	@Override
	public QnaDto read(int bno) throws Exception {
		QnaDao dao = sqlSession.getMapper(QnaDao.class);
		return dao.read(bno);
	}

	@Override
	public void modify(QnaDto qna) throws Exception {
		QnaDao dao = sqlSession.getMapper(QnaDao.class);
		dao.update(qna);
	}

	@Override
	public void remove(int bno) throws Exception {
		QnaDao dao = sqlSession.getMapper(QnaDao.class);
		dao.delete(bno);
	}

	@Override
	public List<QnaDto> listSearchCriteria(PageMaker pm) throws Exception {
		QnaDao dao = sqlSession.getMapper(QnaDao.class);
		return dao.listSearch(pm);
	}

	@Override
	public int listSearchCount(PageMaker pm) throws Exception {
		QnaDao dao = sqlSession.getMapper(QnaDao.class);
		return dao.listSearchCount(pm);
	}

}
