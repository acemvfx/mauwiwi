package com.accenture.tcf.bars.dao;

import java.sql.Connection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.accenture.tcf.bars.domain.Record;

// @Repository
// public class RecordDAOImpl implements IRecordDAO {
	
// 	@Autowired
// 	private SessionFactory sessionFactory;
	
// 	private Connection conn;
	
// 	public RecordDAOImpl(Connection conn) {
		
// 	}

// 	@Override
// 	public List<Record> retrieveRecords() {
		
// 		Session currentSession = SessionFactory.getCurrentSession();
		
// //		Session currentSession = entityManager.unwrap(Session.class);
		
// 		Query<Record> theQuery =
// 				currentSession.createQuery("from Record", Record.class);
		
// 		List<Record> records = theQuery.getResultList();
		
// 		return records;
// 	}
	
// //	@Override
// //	public List<Record> retrieveRecords() {
// //
// //		return employeeService.retrieveRecords();
// //		
// //		//get the current hibernate session
// //		Session currentSession = entityManager.unwrap(Session.class);
// //		
// //		//create a query
// //		Query<Employee> theQuery = 
// //				currentSession.createQuery("from Employee", Employee.class);
// //		
// //		//execute query and get result list
// //		List<Employee> employees = theQuery.getResultList();
// //		
// //		//return the results
// //		return employees;
// //	}
// }
