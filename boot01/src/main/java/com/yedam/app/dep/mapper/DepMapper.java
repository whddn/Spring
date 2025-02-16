package com.yedam.app.dep.mapper;

import java.util.List;
import com.yedam.app.dep.service.DepVO;

public interface DepMapper {
	
	// 전체조회
	public List<DepVO> selectDepList();
	// 단건조회
	public DepVO selectDepInfo(DepVO depVO);
	// 등록
	public int insertDepInfo(DepVO depVO);
	// 수정
	public int updateDepInfo(DepVO depVO);
	// 삭제
	public int deleteDepInfo(int depId);
}
