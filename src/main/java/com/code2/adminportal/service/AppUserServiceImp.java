package com.code2.adminportal.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code2.adminportal.entity.AppUser;
import com.code2.adminportal.repository.AppUserRepository;
@Service
public class AppUserServiceImp implements AppUserService {
	@Autowired
	private AppUserRepository appUserRepository;
	@Override
	@Transactional
	public List<AppUser> getAppUsers() {
		return appUserRepository.findAll();
	}

}
