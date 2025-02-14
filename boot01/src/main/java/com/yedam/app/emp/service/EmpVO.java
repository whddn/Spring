package com.yedam.app.emp.service;



import java.util.Date;

import lombok.Data;

@Data
public class EmpVO {
	private Integer employeeId; // 사원번호
	private String firstName; // 이름
	private String lastName; // 성
	private String email; // 이메일
	private String phoneNumber; // 연락처
	private Date hireDate; // 입사일
	private String jobId; // 업무번호
	private double salary; // 급여
	private double commissionPct; // 성과금
	private int managerId; // 상사번호
	private int departmentId; // 부서번호
}
