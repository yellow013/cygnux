package io.mercury.redstone.core.order.structure;

import java.util.Optional;

import org.eclipse.collections.api.list.MutableList;

import io.mercury.common.collections.MutableLists;

public final class TrdRecordList {

	private long ordSysId;
	private int serial = -1;

	private MutableList<TrdRecord> allRecord = MutableLists.newFastList(8);

	public TrdRecordList(long ordSysId) {
		this.ordSysId = ordSysId;
	}

	public long ordSysId() {
		return ordSysId;
	}

	public MutableList<TrdRecord> allRecord() {
		return allRecord;
	}

	public boolean isEmpty() {
		return allRecord.isEmpty();
	}

	public Optional<TrdRecord> first() {
		return allRecord.getFirstOptional();
	}

	public Optional<TrdRecord> last() {
		return allRecord.getLastOptional();
	}

	public void add(long epochTime, long trdPrice, int trdQty) {
		allRecord.add(new TrdRecord(++serial, ordSysId, epochTime, trdPrice, trdQty));
	}

}
