package com.ciq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.dao.CreditCardDAO;
import com.ciq.dao.DebitCardDAO;
@Service("cardService")
public class CardServiceImpl implements CardService {

	@Autowired
	private CreditCardDAO creditCardDAO;
	
	@Autowired
	private DebitCardDAO debitCardDAO;

	@Override
	public void getCardDetails() {
		creditCardDAO.getCreditCardDetails();
		debitCardDAO.getDebitCardDetails();
	}

}
