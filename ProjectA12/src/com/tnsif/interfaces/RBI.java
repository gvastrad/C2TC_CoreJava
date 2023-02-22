package com.tnsif.interfaces;

public interface RBI {
	float getRateOfInterest();
}
class SBI implements RBI{

	@Override
	public float getRateOfInterest() {
		return 6.2f;
	}
}

class HDFC implements RBI{

	@Override
	public float getRateOfInterest() {
		return 6.3f;
	}
}