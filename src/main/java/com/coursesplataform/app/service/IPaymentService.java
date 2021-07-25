package com.coursesplataform.app.service;

import java.util.List;

import com.coursesplataform.app.entity.Payment;

public interface IPaymentService {
	public List<Payment> getPayments();
	public Payment getPayment(long id);
}
