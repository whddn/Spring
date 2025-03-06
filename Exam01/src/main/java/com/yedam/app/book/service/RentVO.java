package com.yedam.app.book.service;

import java.util.Date;
import lombok.Data;

@Data
public class RentVO {
	private Integer rentNo;		//대여번호
	private int bookNo;			//도서번호
	private int rentPrice;		//대여금액
	private Date rentDate;		//대여일자
	private String rentStatus;	//반납여부
	
	private String bookName;
}
