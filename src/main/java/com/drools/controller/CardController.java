package com.drools.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.drools.model.CardType;
import com.drools.service.CardService;

@RestController
public class CardController {

	@Autowired
	private CardService cardService;

	/**
	 * This method is used to Issue Card based on request param passed
	 * 
	 * @param type      - This can be CREDIT / PREPAID
	 * @param cardUsage - This will be percentage of card utilized
	 * @return
	 */
	@RequestMapping(value = "/issueCard", method = RequestMethod.GET, produces = "application/json")
	public CardType issueCard(@RequestParam(required = true) String type) {

		CardType cardType = new CardType();
		cardType.setType(type);

		return cardService.issueCard(cardType);
	}

}
