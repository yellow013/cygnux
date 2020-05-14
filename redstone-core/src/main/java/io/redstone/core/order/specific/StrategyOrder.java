package io.redstone.core.order.specific;

import org.eclipse.collections.api.map.primitive.MutableLongObjectMap;

import io.mercury.common.collections.MutableMaps;
import io.mercury.financial.instrument.Instrument;
import io.redstone.core.order.OrderBaseImpl;
import io.redstone.core.order.enums.OrdType;
import io.redstone.core.order.enums.TrdAction;
import io.redstone.core.order.enums.TrdDirection;
import io.redstone.core.order.structure.OrdPrice;
import io.redstone.core.order.structure.OrdQty;

/**
 * 
 * 策略在出现交易信号后发出的订单, 可以对应一个或多个实际订单
 * 
 * @author yellow013
 */

public final class StrategyOrder extends OrderBaseImpl {

	private MutableLongObjectMap<ParentOrder> ownOrders = MutableMaps.newLongObjectHashMap();

	/**
	 * 
	 * @param strategyId
	 * @param subAccountId
	 * @param instrument
	 * @param ordQty
	 * @param ordPrice
	 * @param ordType
	 * @param direction
	 */
	public StrategyOrder(int strategyId, int subAccountId, Instrument instrument, OrdQty ordQty, OrdPrice ordPrice,
			OrdType ordType, TrdDirection direction) {
		super(strategyId, subAccountId, instrument, ordQty, ordPrice, ordType, direction);
	}

	public MutableLongObjectMap<ParentOrder> ownOrders() {
		return ownOrders;
	}

	public ParentOrder addOwnOrder(ParentOrder order) {
		ownOrders.put(order.ordSysId(), order);
		return order;
	}

	@Override
	public int ordLevel() {
		return 2;
	}

	@Override
	public long ownerOrdId() {
		return ordSysId();
	}

	public ParentOrder toActualOrder(TrdDirection direction, int offerQty, OrdType ordType) {
		return addOwnOrder(new ParentOrder(strategyId(), subAccountId(), instrument(), offerQty,
				ordPrice().offerPrice(), ordType, direction, TrdAction.Open, ordSysId()));
	}

}
