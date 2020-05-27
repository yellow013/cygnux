package io.mercury.redstone.core.order.enums;

import org.slf4j.Logger;

import io.mercury.common.log.CommonLoggerFactory;

public enum OrdStatus {

	Invalid(-1, true),

	PendingNew(1, false),

	New(1 << 1, false),

	PendingCancel(1 << 2, false),

	PartiallyFilled(1 << 3, false),

	Filled(1 << 4, true),

	Canceled(1 << 5, true),

	NewRejected(1 << 6, true),

	CancelRejected(1 << 7, true),

	NotProvided(1 << 8, false),

	@Deprecated
	PendingReplace(101, false),

	@Deprecated
	Replaced(102, true),

	@Deprecated
	Suspended(103, true),

	;

	private int code;
	private boolean isFinished;

	/**
	 * 
	 * @param code       代码
	 * @param isFinished 是否为已结束状态
	 */
	private OrdStatus(int code, boolean isFinished) {
		this.code = code;
		this.isFinished = isFinished;
	}

	public int code() {
		return code;
	}

	public boolean isFinished() {
		return isFinished;
	}

	private static final Logger log = CommonLoggerFactory.getLogger(OrdStatus.class);

	public static OrdStatus valueOf(int code) {
		switch (code) {
		case 1:
			return PendingNew;
		case 1 << 1:
			return New;
		case 1 << 2:
			return PendingCancel;
		case 1 << 3:
			return PartiallyFilled;
		case 1 << 4:
			return Filled;
		case 1 << 5:
			return Canceled;
		case 1 << 6:
			return NewRejected;
		case 1 << 7:
			return CancelRejected;
		case 1 << 8:
			return NotProvided;
		case 101:
			return PendingReplace;
		case 102:
			return Replaced;
		case 103:
			return Suspended;
		default:
			log.error("OrdStatus.valueOf(code=={}) -> is no matches, return OrdStatus.Invalid", code);
			return Invalid;
		}

	}

}
