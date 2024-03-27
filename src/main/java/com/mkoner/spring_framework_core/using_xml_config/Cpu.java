package com.mkoner.spring_framework_core.using_xml_config;

public class Cpu {
	private String manufacturer;
	private String clockSpeed;
	
//	public Cpu() {
//	}

	public Cpu(String manufacturer, String clockSpeed) {
		this.manufacturer = manufacturer;
		this.clockSpeed = clockSpeed;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		System.out.println("Setter called");
		this.manufacturer = manufacturer;
	}

	public String getClockSpeed() {
		return clockSpeed;
	}

	public void setClockSpeed(String clockSpeed) {
		System.out.println("Setter called");
		this.clockSpeed = clockSpeed;
	}

	@Override
	public String toString() {
		return "Cpu [manufacturer=" + manufacturer + ", clockSpeed=" + clockSpeed + "]";
	}
	
	public void init() {
		System.out.println("Init method called inside CPU");
	}
	
	
	
}
