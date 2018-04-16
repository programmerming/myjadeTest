package com.hengjue.test.dao;

import java.util.List;

import com.hengjue.dao.annotation.DAO;
import com.hengjue.dao.annotation.SQL;
import com.hengjue.test.Test;

@DAO
public interface TestDAO {
	
	@SQL("select id,msg from test")
    public List<Test> getTest();

}
