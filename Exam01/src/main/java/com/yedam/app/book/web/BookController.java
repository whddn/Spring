package com.yedam.app.book.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.yedam.app.book.service.BookService;
import com.yedam.app.book.service.BookVO;
import com.yedam.app.book.service.RentVO;

@Controller
public class BookController {
	
	private BookService bookService;
	
	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	// 도서목록 조회
	@GetMapping("bookList")
	public String bookList(Model model) {
		List<BookVO> list = bookService.findBookList();
		model.addAttribute("book", list);
		return "book/list";
	}
	
	// 대여목록 조회
	@GetMapping("rentList")
	public String rentList(Model model) {
		List<RentVO> list = bookService.findRentList();
		model.addAttribute("rent", list);
		return "book/rent";
	}
	
	// 등록 - 페이지
	@GetMapping("bookInsert")
	public String bookInsertForm() {
		return "book/insert";
	}
	// 등록 - 처리
	@PostMapping("bookInsert")
	public String bookInsertProcess(BookVO bookVO) {
		int bookno = bookService.createBook(bookVO);
		return "redirect:bookInfo?bookno=" + bookno;
	}
}
