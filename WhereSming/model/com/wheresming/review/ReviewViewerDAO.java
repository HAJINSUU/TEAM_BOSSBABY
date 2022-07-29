package com.wheresming.review;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.wheresming.database.SqlSessionManager;
import com.wheresming.review.ReviewDTO;

public class ReviewViewerDAO {

	SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	SqlSession sqlSession = sqlSessionFactory.openSession();

	public List<ReviewDTO> selectAllMember(int mv_seq) {

		List<ReviewDTO> list = null;

		try {
			list = sqlSession.selectList("com.wheresming.review.ReviewDAO.selectList", mv_seq);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}

		return list;

	}

}
