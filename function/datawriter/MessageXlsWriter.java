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

public class MessageXlsWriter {
	protected File file;  
    protected OutputStream os;  
    protected Workbook book = null;  
    public MessageXlsWriter() {  
        super();  
}
    public MessageXlsWriter(File file) throws IOException, IllegalFormatException {
    	super();  
        this.file = file;  
        
        os = new FileOutputStream(file);  
        book = new HSSFWorkbook();  
        Sheet sheet = book.createSheet("message");  
          
        String[] title = {"title","email","content"};  
        Row titleRow = sheet.createRow(0);  
        for(int i = 0; i < title.length; i++) {  
            Cell cell = titleRow.createCell(i + 1);  
            cell.setCellValue(title[i]);  
        }  
    }
    public void Extract() throws IOException {  
        book.write(os);  
        book.close();  
    }  
    
    }


