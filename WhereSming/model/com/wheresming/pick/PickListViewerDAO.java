package com.wheresming.pick;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.wheresming.database.SqlSessionManager;

public class PickListViewerDAO {

	SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	SqlSession sqlSession = sqlSessionFactory.openSession();

	public List<PickListViewerDTO> selectAllPickList(String mb_id) {

		List<PickListViewerDTO> list = null;

		try {
			list = sqlSession.selectList("com.wheresming.pick.PickDAO.folderViewer", mb_id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}

		return list;

	}
	
	
}
