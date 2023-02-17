package com.tnsif.inheritance.multilevel;

public class MultiLevelInheritanceDemo {

	public static void main(String args[]) {
		City c=new City();
		c.setCountryName("India");
		c.setStateName("Karnataka");
		c.setCapitalCity("Bengaluru");
		c.setLanguage("Kannada");
		c.setCityName("Mysuru");
		c.setArea(152.0f);
		System.out.println(c);
	}
}
