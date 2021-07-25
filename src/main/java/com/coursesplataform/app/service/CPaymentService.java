package com.coursesplataform.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coursesplataform.app.dao.PaymentDao;
import com.coursesplataform.app.entity.Payment;

@Service
public class CPaymentService implements IPaymentService{

	@Autowired
	private PaymentDao paymentDao;
	
	@Override
	public List<Payment> getPayments() {
		return paymentDao.findAll();
	}

	@Override
	public Payment getPayment(long id) {
		return paymentDao.findById(id).orElse(null);
	}

}
