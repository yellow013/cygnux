package io.ffreedom.redstone.adaptor.simulator;

import io.ffreedom.common.param.ParamKeyMap;
import io.ffreedom.redstone.core.adaptor.Adaptor;
import io.ffreedom.transport.socket.config.SocketConfigurator;

public abstract class BaseSimAdaptor implements Adaptor {

	protected ParamKeyMap<SimAdaptorParams> paramMap;

	protected SocketConfigurator mdConfigurator;

	protected SocketConfigurator tdConfigurator;

	public BaseSimAdaptor(ParamKeyMap<SimAdaptorParams> paramMap) {
		this.paramMap = paramMap;
		initSocketConfigurator();
		init();
	}

	private void initSocketConfigurator() {
		this.mdConfigurator = SocketConfigurator.builder().setHost(paramMap.getString(SimAdaptorParams.MdHost))
				.setPort(paramMap.getInteger(SimAdaptorParams.MdPort)).build();

		this.tdConfigurator = SocketConfigurator.builder().setHost(paramMap.getString(SimAdaptorParams.TdHost))
				.setPort(paramMap.getInteger(SimAdaptorParams.TdPort)).build();
	}

	@Override
	public int getAdaptorId() {
		return 0;
	}

}
