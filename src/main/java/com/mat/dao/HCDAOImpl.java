package com.mat.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mat.model.Criteria;
import com.mat.model.SecurityLightVO;
import com.mat.model.SelectKey;

@Repository
public class HCDAOImpl implements HCDAO{
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<SecurityLightVO> selectList(Criteria cri) throws Exception {
		return sqlSession.selectList("selectList", cri);
	}

	@Override
	public int getCount(Criteria cri) throws Exception {
		return sqlSession.selectOne("getCount", cri);
	}

	@Override
	public List<String> getDongName() throws Exception {
		return sqlSession.selectList("getDongName");
	}

	@Override
	public List<String> getDongSubName() throws Exception {
		return sqlSession.selectList("getDongSubName");
	}

	@Override
	public List<SecurityLightVO> getAllList(Criteria cri) throws Exception {
		return sqlSession.selectList("getAllList", cri);
	}

	@Override
	public SecurityLightVO selectLamp(SelectKey key) throws Exception {
		return sqlSession.selectOne("selectLamp", key);
	}


}
