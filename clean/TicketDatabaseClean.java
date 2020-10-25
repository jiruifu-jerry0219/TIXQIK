package com.tixqik.clean;

import java.io.File;
import java.io.IOException;

import com.tixqik.function.datawriter.CompanyXlsWriter;
import com.tixqik.function.datawriter.TicketClassify;
import com.tixqik.function.datawriter.TicketXlsWriter;

public class TicketDatabaseClean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("ticketinfo.xls");
        try {
        	TicketXlsWriter writer = new TicketXlsWriter(file);
			//writer.Write(users);
			writer.Extract(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
        File file1 = new File("ticketclass.xls");
        try {
        	TicketClassify writer = new TicketClassify(file1);
			//writer.Write(users);
			writer.Extract(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println("Rewrite Successfylly!");

	}

}
