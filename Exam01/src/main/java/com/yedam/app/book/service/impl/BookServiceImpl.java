package com.yedam.app.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.app.book.mapper.BookMapper;
import com.yedam.app.book.service.BookService;
import com.yedam.app.book.service.BookVO;
import com.yedam.app.book.service.RentVO;

@Service
public class BookServiceImpl implements BookService {
	
	private BookMapper bookMapper;
	
	@Autowired
	public BookServiceImpl(BookMapper bookMapper) {
		this.bookMapper = bookMapper;
	}
	
	@Override // 도서목록 조회
	public List<BookVO> findBookList() {
		return bookMapper.selectBookAllList();
	}

	@Override // 대여목록 조회
	public List<RentVO> findRentList() {
		return bookMapper.selectRentAllList();
	}

	@Override // 도서생성
	public int createBook(BookVO bookVO) {
		int result = bookMapper.insertInfo(bookVO);
		return result == 1 ? bookVO.getBookNo() : -1;
	}

}
