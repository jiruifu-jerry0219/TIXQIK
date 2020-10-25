package com.tixqik.clean;

import java.io.File;
import java.io.IOException;


import com.tixqik.function.datawriter.UserXlsWriterUdgrade;


public class UserDatabaseClean {

	public static void main(String[] args) {
		File file = new File("userInfo.xls");
        try {
        	UserXlsWriterUdgrade writer = new UserXlsWriterUdgrade(file);
			writer.Extract(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println("Rewrite Successfylly!");

	}
	

}

