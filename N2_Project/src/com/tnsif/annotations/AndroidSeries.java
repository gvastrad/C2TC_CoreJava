package com.tnsif.annotations;

//@SmartTV(os = "android", height = 40, width = 50)
@SmartPhone

class AndroidSeries {
	private String model;
	private int screenSize;

	public AndroidSeries(String model, int screenSize) {
		this.model = model;
		this.screenSize = screenSize;
	}

	public String getModel() {
		return model;
	}

	public int getScreenSize() {
		return screenSize;
	}	
}