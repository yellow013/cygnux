package io.ffreedom.redstone.state.jmx;

public class Config implements ConfigMBean {

	private String name;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

}
