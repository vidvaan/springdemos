package com.ciq.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DebitCardDAOImpl implements DebitCardDAO {

	@Override
	public void getDebitCardDetails() {
		System.out.println("Card Type IS VISA DEBIT CARD :  CARD NUMBER IS: 3290 8745 43456");
	}

}
