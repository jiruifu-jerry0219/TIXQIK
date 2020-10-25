package com.tixqik.function.datawriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.IllegalFormatException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.tixqik.object.Ticket;

public class StudentGameXlsWriter {
	protected File file;  
    protected OutputStream os;  
    protected Workbook book = null;  
    public StudentGameXlsWriter() {  
        super();  
}
    public StudentGameXlsWriter(File file) throws IOException, IllegalFormatException {
    	super();  
        this.file = file;  
        
        os = new FileOutputStream(file);  
        book = new HSSFWorkbook();  
        Sheet sheet1 = book.createSheet("Games");
        
        String[] title = {"Tiem","Date", "Location","Name","Type","Capacity"};  
        Row titleRow1 = sheet1.createRow(0);
        
        for(int i = 0; i < title.length; i++) {  
            Cell cell = titleRow1.createCell(i + 1);  
            cell.setCellValue(title[i]);  
        } 
    }
	      
	    public void Extract() throws IOException {  
	        book.write(os);  
	        os.close();  
	    }                     
}
