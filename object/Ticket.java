package com.tixqik.object;
import com.tixqik.function.datawriter.TicketXlsWriter;
import com.tixqik.behavior.TicketViewer;
import com.tixqik.behavior.TicketPost;



public class Ticket {
	public String event;
	public String location;
	public String organizer;
	public String date;
	public String time;
	public String price;
	public String type;
	
	public Ticket(){
		super();
	}
	public Ticket(String et, String ln, String or, String de, String tme, String pe, String tpe) {
		super();
		event = et;
		location = ln;
		organizer = or;
		date = de;
		time = tme;
		price = pe;
		type = tpe;
	}
	
	public String getEvent () {
		return event;
	}
	public void setEvent(String et) {
		event = et;
	}
	
	public String getLocation () {
		return location;
	}
	public void setLocation(String ln) {
		location = ln;
	}
	
	public String getOrganizer(){
		return organizer;
	}
	public void setOrganizer(String or){
		organizer = or;
	}
	
	public String getDate () {
		return date;
	}
	public void setDate(String de) {
		date = de;
	}
	
	public String getTime () {
		return time;
	}
	public void setTime(String tme) {
		time = tme;
	}
	
	public String getPrice () {
		return price;
	}
	public void setPrice(String pe) {
		price = pe;
	}
	
	public String getType () {
		return type;
	}
	public void setType(String tpe) {
		type = tpe;
	}
	@Override
	public String toString() {
		return "Component [event=" + event + ", location=" + location
				+ ", organizer=" + organizer + ", date=" + date + ", time="
				+ time + ", price=" + price + ", type=" + type + "]";
	}
	

}
