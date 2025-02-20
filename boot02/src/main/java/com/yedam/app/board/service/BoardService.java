package com.yedam.app.board.service;

import java.util.List;

public interface BoardService {
	// 현재 게시판의 전체 글 조회
	public List<BoardVO> findBoardList();
	
	// 선택한 게시글의 상세조회
	public BoardVO findBoardByBno(BoardVO boardVO);
}
