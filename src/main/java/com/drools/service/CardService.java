package com.drools.service;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drools.model.CardType;

@Service
public class CardService {

	private final KieContainer kieContainer;

	@Autowired
	public CardService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

	public CardType issueCard(CardType cardType) {

		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(cardType);
		kieSession.fireAllRules();
		kieSession.dispose();

		return cardType;
	}
}