package com.yedam.app.board.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yedam.app.board.service.BoardService;
import com.yedam.app.board.service.BoardVO;

@Controller // Routing
public class BoardController {
	
	private BoardService boardService;
	
	@Autowired
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	
	// 전체조회 기능
	// 1) URL + Method
	@GetMapping("boardList")
	public String boardList(Model model) {
		// 2) Service
		List<BoardVO> list = boardService.findBoardList();
		// 2-1) Service의 결과를 View에 전달
		model.addAttribute("boards", list);
		// 3) View
		return "board/list";
		// ViewResolver : 경로 생성
		// prefix, classpath:/templates/
		// subffix, .html
		// prefix + return + suffix
		
	}
}
