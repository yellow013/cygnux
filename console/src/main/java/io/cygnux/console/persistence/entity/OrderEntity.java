package io.cygnux.console.persistence.entity;

import io.cygnux.console.persistence.constant.ColumnDefinition;
import io.cygnux.console.persistence.constant.CommonQueryColumn;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

/**
 * Order Entity 基本信息
 *
 * @author yellow013
 */
@Data
@Entity
@Table(name = "cyg_order")
public final class OrderEntity {

    @Id
    @Column(name = ColumnDefinition.UID)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long uid;

    /**
     * tradingDay [*]
     */
    @Column(name = CommonQueryColumn.TRADING_DAY)
    private int tradingDay;

    /**
     * strategyId [*]
     */
    @Column(name = CommonQueryColumn.STRATEGY_ID)
    private int strategyId;

    /**
     * instrumentCode [*]
     */
    @Column(name = CommonQueryColumn.INSTRUMENT_CODE)
    private String instrumentCode;

    /**
     * investorId [*]
     */
    @Column(name = CommonQueryColumn.INVESTOR_ID)
    private String investorId;

    /**
     * brokerId [*]
     */
    @Column(name = CommonQueryColumn.BROKER_ID)
    private String brokerId;

    /**
     * accountId [*]
     */
    @Column(name = CommonQueryColumn.ACCOUNT_ID)
    private int accountId;

    /**
     * subAccountId [*]
     */
    @Column(name = CommonQueryColumn.SUB_ACCOUNT_ID)
    private int subAccountId;

    /**
     * userId [*]
     */
    @Column(name = CommonQueryColumn.USER_ID)
    private int userId;

    /**
     * ordSysId [*]
     */
    @Column(name = "ord_sys_id")
    private long ordSysId;

    /**
     * ordType
     */
    @Column(name = "ord_type")
    private String ordType;

    /**
     * orderRef
     */
    @Column(name = "order_ref")
    private String orderRef;

    /**
     * direction
     */
    @Column(name = "direction")
    private char direction;

    /**
     * side
     */
    @Column(name = "side")
    private char side;

    /**
     * offerPrice
     */
    @Column(name = "offer_price", columnDefinition = ColumnDefinition.DECIMAL_19_4)
    private double offerPrice;

    /**
     * offerQty
     */
    @Column(name = "offer_qty")
    private int offerQty;

    /**
     * insertTime
     */
    @Column(name = "insert_time", columnDefinition = ColumnDefinition.TIME)
    private Date insertTime;

    /**
     * updateTime
     */
    @Column(name = "update_time", columnDefinition = ColumnDefinition.TIME)
    private Date updateTime;

    /**
     * cancelTime
     */
    @Column(name = "cancel_time", columnDefinition = ColumnDefinition.TIME)
    private Date cancelTime;

    /**
     * frontId
     */
    @Column(name = "front_id")
    private int frontId;

    /**
     * sessionId
     */
    @Column(name = "session_id")
    private int sessionId;

    /**
     * fee double 19_4
     */
    @Column(name = "fee")
    private double fee;

    /**
     * adaptorType
     */
    @Column(name = "adaptor_type")
    private String adaptorType;

    /**
     * remark
     */
    @Column(name = "remark")
    private String remark;

}
