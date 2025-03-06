package com.yedam.app.book.mapper;

import java.util.List;
import com.yedam.app.book.service.BookVO;
import com.yedam.app.book.service.RentVO;

public interface BookMapper {

	// 도서목록조회
	public List<BookVO> selectBookAllList();
	
	// 대여목록조회
	public List<RentVO> selectRentAllList();
	
	// 도서등록
	public int insertInfo(BookVO bookVO);
}
