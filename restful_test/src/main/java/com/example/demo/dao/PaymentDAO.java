package com.example.demo.dao;

import org.springframework.stereotype.Repository;

import com.example.demo.db.DBManager;
import com.example.demo.vo.PaymentVO;
 

@Repository

public class PaymentDAO {
	
	public static int insert(PaymentVO p) {
		return DBManager.insertPayment(p);
	}
}
