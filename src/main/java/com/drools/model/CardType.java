package com.drools.model;

public class CardType {

	private String type;

	private Integer limits;

	private Integer fees;

	private Integer cardUsage;

	private String loadingLimits;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getLimits() {
		return limits;
	}

	public void setLimits(Integer limits) {
		this.limits = limits;
	}

	public Integer getFees() {
		return fees;
	}

	public void setFees(Integer fees) {
		this.fees = fees;
	}

	public Integer getCardUsage() {
		return cardUsage;
	}

	public void setCardUsage(Integer cardUsage) {
		this.cardUsage = cardUsage;
	}

	public String getLoadingLimits() {
		return loadingLimits;
	}

	public void setLoadingLimits(String loadingLimits) {
		this.loadingLimits = loadingLimits;
	}
}