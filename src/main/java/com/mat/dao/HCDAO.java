package com.mat.dao;

import java.util.List;

import com.mat.model.Criteria;
import com.mat.model.SecurityLightVO;
import com.mat.model.SelectKey;

public interface HCDAO {
	public List<SecurityLightVO> selectList(Criteria cri) throws Exception;
	public int getCount(Criteria cri)throws Exception;
	public List<String> getDongName()throws Exception;
	public List<String>getDongSubName()throws Exception;
	public List<SecurityLightVO> getAllList(Criteria cri)throws Exception;
	public SecurityLightVO selectLamp(SelectKey key)throws Exception;
}
