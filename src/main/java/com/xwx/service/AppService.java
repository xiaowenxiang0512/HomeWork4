package com.xwx.service;

import java.util.List;

import com.xwx.entity.Applicant;

public interface AppService {

	List<Applicant> getList();

	void tj(Applicant a);

	void del(int id);

	List<Applicant> zc();

	void pjf(Applicant a);

	void yjs(Applicant a); 
	

}
