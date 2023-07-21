package com.maheshspringboot.batch2023;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentServiceConfigController {
	@Autowired
	private PaymentServiceConfiguration paymentConfig;
	
	public PaymentServiceConfigController(PaymentServiceConfiguration paymentConfig) {
		this.paymentConfig = paymentConfig;
	}
	
	@RequestMapping("payment-config")
	public PaymentServiceConfiguration getPaymentConfig() {
		return this.paymentConfig;
	}
}
