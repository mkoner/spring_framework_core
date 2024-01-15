package com.mkoner.spring_framework_core.using_xml_config;

public class Computer {
	
	private ComputerType type;
	private String model;
	private Cpu cpu;
	
	public Computer() {
	}

	public Computer(ComputerType type, String model, Cpu cpu) {
		super();
		this.type = type;
		this.model = model;
		this.cpu = cpu;
	}

	public ComputerType getType() {
		return type;
	}

	public void setType(ComputerType type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "Computer [type=" + type + ", model=" + model + ", cpu=" + cpu + "]";
	}
	
	
	
}
