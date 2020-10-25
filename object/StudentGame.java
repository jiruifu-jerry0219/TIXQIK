package com.tixqik.object;

public class StudentGame {
	private String time;
	private String date;
	private String location;
	private String name;
	private String type;
	private String capacity;
	
	
	public StudentGame() {
		super();
	}

	public StudentGame(String time, String date, String location, String name,
			String type, String capacity) {
		super();
		this.time = time;
		this.date = date;
		this.location = location;
		this.name = name;
		this.type = type;
		this.capacity = capacity;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "StudentGame [time=" + time + ", date=" + date + ", location="
				+ location + ", name=" + name + ", type=" + type
				+ ", capacity=" + capacity + "]";
	}
	
	
	

}
