package net.java_school.examples;

public enum Day {

	SUNDAY("Sun"),//Pass the value "Sun" to the constructor
	MONDAY("Mon"), 
	TUESDAY("Tue"),
	WEDNESDAY("Wed"), 
	THURSDAY("Thu"), 
	FRIDAY("Fri"),
	SATURDAY("Sat");//Add a semicolon(;) at the end

	private final String value;

	//Add constructor
	private Day(String value) {
		this.value = value;
	}

	//Add method to get value
	public String getValue() {
		return value;
	}
	
}