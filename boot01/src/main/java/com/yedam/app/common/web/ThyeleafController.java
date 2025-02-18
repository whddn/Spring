package com.yedam.app.common.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yedam.app.emp.service.EmpService;
import com.yedam.app.emp.service.EmpVO;

@Controller
public class ThyeleafController {
	private EmpService empService;

	@Autowired
	public ThyeleafController(EmpService empService) {
		this.empService = empService;
	}

	@GetMapping("thymeleaf")
	public String thymeleafTest(Model model) {
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(100);
		EmpVO findVO = empService.findEmpInfo(empVO);
		model.addAttribute("empInfo", findVO);
		
		List<EmpVO> list = empService.findAllEmp();
		model.addAttribute("empList", list);
		return "test";
		// prifix : classpath:/templates/
		// suffix : .html
		// classpath:/templates/test.html
		// boot01/src/main/resources/templates/test.html
	}
}
