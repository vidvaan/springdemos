package com.ciq.dao;

import org.springframework.stereotype.Repository;

@Repository
public class CreditCardDAOImpl implements CreditCardDAO{

	@Override
	public void getCreditCardDetails() {
		System.out.println("Card Type IS VISA CREDIT CARD :  CARD NUMBER IS: 1290 8765 43456");
		
	}

}
