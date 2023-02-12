package com.drug.service;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drug.dao.QnaDAO;
import com.drug.dto.QnaDTO;
import com.drug.vo.PageMaker;

@Service
public class QnaServiceImpl implements IQnaService {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public void write(QnaDTO board) throws Exception {
		System.out.println(sqlSession);
		QnaDAO dao=sqlSession.getMapper(QnaDAO.class);
		dao.create(board);
	}

	@Override
	public QnaDTO read(int bno) throws Exception {
		QnaDAO dao=sqlSession.getMapper(QnaDAO.class);

		return dao.read(bno);
	}

	@Override
	public void modify(QnaDTO board) throws Exception {
		QnaDAO dao=sqlSession.getMapper(QnaDAO.class);
		dao.update(board);
	}

	@Override
	public void remove(int bno) throws Exception {
		QnaDAO dao=sqlSession.getMapper(QnaDAO.class);
		dao.delete(bno);

	}

	@Override
	public List<QnaDTO> listSearchCriteria(PageMaker pm) throws Exception {
		QnaDAO dao=sqlSession.getMapper(QnaDAO.class);
		return dao.listSearch(pm);
	}

	@Override
	public int listSearchCount(PageMaker pm) throws Exception {
		QnaDAO dao=sqlSession.getMapper(QnaDAO.class);
		return dao.listSearchCount(pm);
	}


}
