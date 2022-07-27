package com.wheresming.member;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.wheresming.database.SqlSessionManager;

public class LoginDAO {
	SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	SqlSession sqlSession = sqlSessionFactory.openSession();
	
	public MemberDTO selectMember(MemberDTO vo) {
		
		System.out.println("도착 확인");
		MemberDTO loginMember = null;
		
		try {
			System.out.println("SQL 트라이");
			loginMember = sqlSession.selectOne("com.wheresming.member.LoginDAO.select",vo);
			// select - commit/rollback 생략
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("SQL 실패");
		}finally {
			sqlSession.close();
			
		}
		
		return loginMember;
	}

}
