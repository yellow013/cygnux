package io.ffreedom.redstone.core.order;

import java.time.LocalDateTime;

import org.eclipse.collections.api.set.sorted.MutableSortedSet;
import org.eclipse.collections.impl.set.sorted.mutable.TreeSortedSet;

public class TradeList {

	private long ordSysId;
	private int tradeSerial = -1;

	private MutableSortedSet<Trade> tradeSet = new TreeSortedSet<>();

	public TradeList(long ordSysId) {
		this.ordSysId = ordSysId;
	}

	public long getOrdSysId() {
		return ordSysId;
	}

	public MutableSortedSet<Trade> getTradeSet() {
		return tradeSet;
	}

	public boolean isEmpty() {
		return tradeSet.isEmpty();
	}

	public Trade firstTrade() {
		return tradeSet.first();
	}

	public Trade lastTrade() {
		return tradeSet.last();
	}

	public void addNewTrade(LocalDateTime tradeDateTime, double price, double qty) {
		tradeSet.add(new Trade(ordSysId, ++tradeSerial, tradeDateTime, price, qty));
	}

	public class Trade implements Comparable<Trade> {

		private long ordSysId;
		private int tradeSerial;
		private LocalDateTime tradeDateTime;
		private double tradePrice;
		private double tradeQty;

		public Trade(long ordSysId, int tradeSerial, LocalDateTime tradeDateTime, double tradePrice,
				double tradeQty) {
			super();
			this.ordSysId = ordSysId;
			this.tradeSerial = tradeSerial;
			this.tradeDateTime = tradeDateTime;
			this.tradePrice = tradePrice;
			this.tradeQty = tradeQty;
		}

		public long getOrdSysId() {
			return ordSysId;
		}

		public int getTradeSerial() {
			return tradeSerial;
		}

		public LocalDateTime getTradeDateTime() {
			return tradeDateTime;
		}

		public double getTradePrice() {
			return tradePrice;
		}

		public double getTradeQty() {
			return tradeQty;
		}

		@Override
		public int compareTo(Trade o) {
			if (this.tradeSerial < o.tradeSerial) {
				return -1;
			} else if (this.tradeSerial > o.tradeSerial) {
				return 1;
			} else {
				return 0;
			}
		}

	}

}
