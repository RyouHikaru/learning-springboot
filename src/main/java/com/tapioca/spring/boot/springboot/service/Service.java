package com.tapioca.spring.boot.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tapioca.spring.boot.springboot.dao.DAO;

@Component
public class Service {

	private DAO dao;
	
	@Autowired
	public Service(DAO dao) {
		System.out.println("Service bean created");
		this.dao = dao;
	}
	
	public void save() {
		dao.create();
	}
}
