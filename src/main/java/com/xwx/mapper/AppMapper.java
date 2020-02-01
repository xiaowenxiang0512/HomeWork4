package com.xwx.mapper;

import java.util.List;

import com.xwx.entity.Applicant;

public interface AppMapper {

	List<Applicant> getList();

	void del(int id);

	void tj(Applicant a);

	List<Applicant> zc();
 
	void getPjf(Applicant a);

	void getYjs(Applicant a);

}
