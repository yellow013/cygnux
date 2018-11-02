package io.ffreedom.redstone.adaptor.sim.dto;

import java.util.Collection;

import io.ffreedom.redstone.core.adaptor.dto.SubscribeMarketData;

public final class SimSubscribeMarketData extends SubscribeMarketData{

	private String investorId;
	private int clientId;
	private String startTradingDay;
	private String endTradingDay;

	public SimSubscribeMarketData(String investorId, int clientId, String startTradingDay, String endTradingDay,
			Collection<String> instrumentIdList) {
		super(instrumentIdList);
		this.investorId = investorId;
		this.clientId = clientId;
		this.startTradingDay = startTradingDay;
		this.endTradingDay = endTradingDay;
	}

	public String getInvestorId() {
		return investorId;
	}

	public int getClientId() {
		return clientId;
	}

	public String getStartTradingDay() {
		return startTradingDay;
	}

	public String getEndTradingDay() {
		return endTradingDay;
	}

}
