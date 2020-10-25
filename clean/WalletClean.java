package com.tixqik.clean;

import java.io.File;
import java.io.IOException;

import com.tixqik.function.datawriter.WalletXlsWriter;

public class WalletClean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("userwallet.xls");
        try {
        	WalletXlsWriter writer = new WalletXlsWriter(file);
			writer.Extract(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println("Rewrite Successfylly!");

	}

}
