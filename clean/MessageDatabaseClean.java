package com.tixqik.clean;

import java.io.File;
import java.io.IOException;

import com.tixqik.function.datawriter.MessageXlsWriter;
import com.tixqik.function.datawriter.StudentGameXlsWriter;

public class MessageDatabaseClean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("message.xls");
        try {
        	MessageXlsWriter writer = new MessageXlsWriter(file);
			//writer.Write(users);
			writer.Extract(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println("Rewrite Successfylly!");

	}

}
