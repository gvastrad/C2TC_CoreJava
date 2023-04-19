//Program to demonstrate class to use user defined annotations 
package com.tnsif.daytwentyone.userdefinedannotation;

@SmartTV(os = "android", height = 40, width = 50)
@SmartPhone(os = "android", version = 12)
class AndroidSeries {
	String model;
	int screenSize;

	public AndroidSeries(String model, int screenSize) {
		this.model = model;
		this.screenSize = screenSize;
	}
}