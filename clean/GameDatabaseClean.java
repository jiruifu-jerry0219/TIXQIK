package com.tixqik.clean;

import java.io.File;
import java.io.IOException;

import com.tixqik.function.datawriter.StudentGameXlsWriter;
import com.tixqik.function.datawriter.TicketXlsWriter;

public class GameDatabaseClean {

	public static void main(String[] args) {
		File file = new File("studentgame.xls");
        try {
        	StudentGameXlsWriter writer = new StudentGameXlsWriter(file);
			//writer.Write(users);
			writer.Extract(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println("Rewrite Successfylly!");
		


	}

}
