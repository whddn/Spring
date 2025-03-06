package com.yedam.app.book.service;

import java.util.List;

public interface BookService {
	// 현재 도서목록 전체 조회
	public List<BookVO> findBookList();
	
	// 현재 대여현황 전체 조회
	public List<RentVO> findRentList();
	
	// 도서 등록
	public int createBook(BookVO bookVO);
	
}
