package com.tixqik.entity;

public class Event {
protected String name;
protected String type;
protected String players;
protected String location;
protected String number1;
protected String am1;
protected String number2;
protected String am2;
protected String month;
protected String day;
protected String year;

public Event(){
	super();
}
public Event(String name, String type, String players, String location,
		String number1, String am1, String number2, String am2, String month,
		String day, String year) {
	this.name = name;
	this.type = type;
	this.players = players;
	this.location = location;
	this.number1 = number1;
	this.am1 = am1;
	this.number2 = number2;
	this.am2 = am2;
	this.month = month;
	this.day = day;
	this.year = year;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getPlayers() {
	return players;
}
public void setPlayers(String players) {
	this.players = players;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getNumber1() {
	return number1;
}
public void setNumber1(String number1) {
	this.number1 = number1;
}
public String getAm1() {
	return am1;
}
public void setAm1(String am1) {
	this.am1 = am1;
}
public String getNumber2() {
	return number2;
}
public void setNumber2(String number2) {
	this.number2 = number2;
}
public String getAm2() {
	return am2;
}
public void setAm2(String am2) {
	this.am2 = am2;
}
public String getMonth() {
	return month;
}
public void setMonth(String month) {
	this.month = month;
}
public String getDay() {
	return day;
}
public void setDay(String day) {
	this.day = day;
}
public String getYear() {
	return year;
}
public void setYear(String year) {
	this.year = year;
}
@Override
public String toString() {
	return "Event [name=" + name + ", type=" + type + ", players=" + players
			+ ", location=" + location + ", number1=" + number1 + ", am1="
			+ am1 + ", number2=" + number2 + ", am2=" + am2 + ", month="
			+ month + ", day=" + day + ", year=" + year + "]";
}

}
