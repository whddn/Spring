package com.yedam.app.emp.mapper;

import org.apache.ibatis.annotations.Insert;

public interface AaaMapper {
	@Insert("insert into tbl_aaa values(#{value}")
	public int insert(String value);
}
