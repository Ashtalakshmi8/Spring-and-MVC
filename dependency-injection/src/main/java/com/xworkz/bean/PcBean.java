package com.xworkz.bean;

public class PcBean {
	private String name;

	private PowerBean powerBean;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PowerBean getPowerBean() {
		return powerBean;
	}

	public void setPowerBean(PowerBean powerBean) {
		this.powerBean = powerBean;
	}

	public void provideService() {
		powerBean.provideElectricity();
		System.out.println("Providing srvicesss.......!");
	}

}
