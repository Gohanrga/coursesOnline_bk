package com.coursesplataform.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursesplataform.app.entity.Payment;

public interface PaymentDao extends JpaRepository<Payment, Long>{

}
