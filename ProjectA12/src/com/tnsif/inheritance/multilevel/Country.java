package com.tnsif.inheritance.multilevel;

public class Country {
	private String countryName;
	private String capitalCity;
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCapitalCity() {
		return capitalCity;
	}
	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", capitalCity=" + capitalCity + "]";
	}
}
