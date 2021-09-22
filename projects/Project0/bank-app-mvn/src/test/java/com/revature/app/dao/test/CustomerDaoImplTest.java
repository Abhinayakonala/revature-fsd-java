package com.revature.app.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.revature.bankapp.dao.CustomerDao;
import com.revature.bankapp.dao.impl.CustomerDaoImpl;
import com.revature.bankapp.model.Customer;

class CustomerDaoImplTest {

	@Test
	void testCreate() {
		CustomerDao dao = new CustomerDaoImpl();
		Customer customer = new Customer("abhi", "abhi27", "123", null);
		try {
			dao.create(customer);
		} catch (SQLException e) {
			e.printStackTrace();
			fail("Not yet implemented");
		}

	}

}
