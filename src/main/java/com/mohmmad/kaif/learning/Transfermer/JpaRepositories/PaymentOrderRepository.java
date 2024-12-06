package com.mohmmad.kaif.learning.Transfermer.JpaRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mohmmad.kaif.learning.Transfermer.Entities.PaymentOrder;

public interface PaymentOrderRepository extends JpaRepository<PaymentOrder,String> {
}