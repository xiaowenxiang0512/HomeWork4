package com.xwx.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xwx.entity.Applicant;
import com.xwx.mapper.AppMapper;
import com.xwx.service.AppService;

@Service
public class AppServiceImpl implements AppService {

	@Autowired
	AppMapper mapper;
	
	@Override
	public List<Applicant> getList() {
		return mapper.getList();
	}
	
	
	@Override
	public void tj(Applicant a) {
		mapper.tj(a);
	}
	
	
	@Override
	public void del(int id) {
		mapper.del(id);
	}
	
	
	@Override
	public List<Applicant> zc() {
		
		return mapper.zc();
	}
	
	@Override
	public void pjf(Applicant a) {
		mapper.getPjf(a);
	}
	
	@Override
	public void yjs(Applicant a) {
		mapper.getYjs(a);
	}
}
