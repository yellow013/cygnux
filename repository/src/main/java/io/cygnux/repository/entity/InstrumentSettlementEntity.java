package io.cygnux.repository.entity;

import io.cygnux.repository.constant.ColumnDefinition;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import static io.cygnux.repository.constant.RdbColumn.INSTRUMENT_CODE;
import static io.cygnux.repository.constant.RdbColumn.TRADING_DAY;
import static io.cygnux.repository.constant.RdbColumn.UID;

/**
 * InstrumentSettlement Entity
 *
 * @author yellow013
 */
@Getter
@Setter
@Accessors(chain = true)
@Table(name = "t_instrument_settlement")
@Entity
public final class InstrumentSettlementEntity {

    @Id
    @Column(name = UID)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long uid;

    /**
     * instrumentCode
     */
    @Column(name = INSTRUMENT_CODE, nullable = false)
    private String instrumentCode;

    /**
     * tradingDay
     */
    @Column(name = TRADING_DAY, nullable = false)
    private int tradingDay;

    /**
     * lastPrice
     */
    @Column(name = "last_price", columnDefinition = ColumnDefinition.DECIMAL_19_4)
    private double lastPrice;

    /**
     * openPrice
     */
    @Column(name = "open_price", columnDefinition = ColumnDefinition.DECIMAL_19_4)
    private double openPrice;

    /**
     * settlementPrice
     */
    @Column(name = "settlement_price", columnDefinition = ColumnDefinition.DECIMAL_19_4)
    private double settlementPrice;

}
