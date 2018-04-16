package com.hengjue.test;

import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hengjue.test.dao.TestDAO;

@Service
public class TestService implements InitializingBean{

	@Autowired
	private TestDAO testDao;
	
	
	public void test() {
		
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		List<Test> list = testDao.getTest();
		for (Test test : list) {
			System.out.println(test.getId() + ":" + test.getMsg());
		}
	}
}
