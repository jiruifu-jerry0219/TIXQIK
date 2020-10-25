package com.tixqik.function.datawriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.IllegalFormatException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class WalletXlsWriter {
	protected File file;  
    protected OutputStream os;  
    protected Workbook book = null;  
    public WalletXlsWriter() {  
        super();  
}
    public WalletXlsWriter(File filename) throws IOException, IllegalFormatException {
    	
	   	 super();  
	        this.file = filename;  
	        
	        os = new FileOutputStream(file);  
	        book = new HSSFWorkbook();   	          	        
	        }
    public void Extract() throws IOException {  
        book.write(os);  
        os.close();  
    }  
}
