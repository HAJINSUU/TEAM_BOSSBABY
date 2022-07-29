package com.wheresming.search;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.wheresming.database.SqlSessionManager;

public class SearchingDAO {
	SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	SqlSession sqlSession = sqlSessionFactory.openSession();
	
	public SearchDTO selectSearch(SearchDTO vo) {
		SearchDTO searchMovie = null;
		
		try {
			searchMovie = sqlSession.selectOne("com.wheresming.search.SearchingDAO.select",vo);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("SQL 실패");
		}finally {
			sqlSession.close();
			
		}
		return searchMovie;
	}	
}
