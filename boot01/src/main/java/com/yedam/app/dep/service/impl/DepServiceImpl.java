package com.yedam.app.dep.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.app.dep.mapper.DepMapper;
import com.yedam.app.dep.service.DepService;
import com.yedam.app.dep.service.DepVO;

@Service
public class DepServiceImpl implements DepService {
	private DepMapper depMapper;
	
	@Autowired
	DepServiceImpl(DepMapper depMapper){
		this.depMapper = depMapper;
	}

	// 전체조회
	@Override
	public List<DepVO> findAllDep() {
		return depMapper.selectDepList();
	}

	//단건
	@Override
	public DepVO findDepInfo(DepVO depVO) {
		return depMapper.selectDepInfo(depVO);
	}

	//등록
	@Override
	public int createDepInfo(DepVO depVO) {
		int result = depMapper.insertDepInfo(depVO);
		return result == 1 ? depVO.getDepartmentId() : -1;
	}

	//수정
	@Override
	public Map<String, Object> modifyDepInfo(DepVO depVO) {
		Map<String, Object> map = new HashMap<>();
		boolean isSuccessed = false;
		
		int result = depMapper.updateDepInfo(depVO);
		if(result == 1) {
			isSuccessed = true;
		}
		map.put("result", isSuccessed);
		map.put("target", depVO);
		
		return map;
	}

	//삭제
	@Override
	public Map<String, Object> removeDepInfo(int departmentId) {
		Map<String, Object> map = new HashMap<>();

		int result = depMapper.deleteDepInfo(departmentId);
		if (result == 1) {
			map.put("departmentId", departmentId);
		}
		return map;
	}

}
