package com.tixqik.clean;

import java.io.File;
import java.io.IOException;

import com.tixqik.function.datawriter.CompanyXlsWriter;
import com.tixqik.function.datawriter.UserXlsWriterUdgrade;

public class CompanyDatabaseClean {

	public static void main(String[] args) {
		File file = new File("companyinfo.xls");
        try {
        	CompanyXlsWriter writer = new CompanyXlsWriter(file);
			//writer.Write(users);
			writer.Extract(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println("Rewrite Successfylly!");


	}

}
