package io.redstone.engine.actor;

import org.eclipse.collections.api.list.MutableList;

import io.mercury.common.collections.MutableLists;
import io.redstone.core.trade.TradeSignal;

public final class TradeSignalActor {

	private MutableList<TradeSignal> tradeSignalList = MutableLists.newFastList(256);

	public static final TradeSignalActor Singleton = new TradeSignalActor();

	public boolean addTradeSignal(TradeSignal signal) {
		return tradeSignalList.add(signal);
	}

	public void handleTradeSignal(TradeSignal signal) {
		switch (signal.trdAction()) {
		case Open:
			switch (signal.trdDirection()) {
			case Long:
				
				break;
			case Short:
				
				break;

			default:
				break;
			}
			break;
		case Close:
			switch (signal.trdDirection()) {
			case Long:

				break;

			case Short:

				break;

			default:
				break;
			}

			break;
		default:
			break;
		}

	}

}
