package com.yedam.app.dep.service;

import java.util.List;
import java.util.Map;

public interface DepService {
	public List<DepVO> findAllDep();
	// 단건조회
	public DepVO findDepInfo(DepVO depVO);
	// 등록
	public int createDepInfo(DepVO depVO);
	// 수정
	public Map<String, Object>modifyDepInfo(DepVO depVO);
	// 삭제
	public Map<String, Object>removeDepInfo(int departmentId);
}
