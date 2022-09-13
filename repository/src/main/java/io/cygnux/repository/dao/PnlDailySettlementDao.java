package io.cygnux.repository.dao;

import io.cygnux.repository.entity.PnlSettlementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * PnlSettlementDaily DAO
 *
 * @author yellow013
 */
@Repository
public interface PnlDailySettlementDao extends JpaRepository<PnlSettlementEntity, Long> {

    List<PnlSettlementEntity> queryByStrategyIdAndTradingDay(int strategyId,
                                                             int tradingDay);

}
