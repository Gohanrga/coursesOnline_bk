package com.coursesplataform.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coursesplataform.app.entity.Payment;
import com.coursesplataform.app.service.IPaymentService;

@RestController
@RequestMapping("/api")
public class PaymentController {
	@Autowired
	private IPaymentService paymentService;
	
	@GetMapping("/getPayments")
	public List<Payment> getPayments(){
		return paymentService.getPayments();
	}
	
	@GetMapping("/getPayment/{id}")
	public ResponseEntity<?> getPayment(@PathVariable Long id){
		Payment paymentAux = paymentService.getPayment(id);
		if(paymentAux==null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(paymentAux);
	}
}
