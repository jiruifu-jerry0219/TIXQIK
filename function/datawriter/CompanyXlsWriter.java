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
//import org.apache.poi.ss.usermodel.WorkbookFactory;


import com.tixqik.object.Company;

public class CompanyXlsWriter {
	protected File file;  
    protected OutputStream os;  
    protected Workbook book = null;  
    public CompanyXlsWriter() {  
        super();  
}
    public CompanyXlsWriter(File file) throws IOException, IllegalFormatException {
    	
   	 super();  
        this.file = file;  
        
        os = new FileOutputStream(file);  
        book = new HSSFWorkbook();  
        Sheet sheet = book.createSheet("user");  
          
        String[] title = {"Company Name","Address","City","State","ID","email"};  
        Row titleRow = sheet.createRow(0);  
        for(int i = 0; i < title.length; i++) {  
            Cell cell = titleRow.createCell(i + 1);  
            cell.setCellValue(title[i]);  
        }  
    }  
      
    public void Write(Company newcompany) throws IOException {  
        Sheet sheet = book.getSheet("user");  
        int lastRowNum = sheet.getLastRowNum();  
        Row currentRow = sheet.createRow(lastRowNum + 1);  
        currentRow.createCell(0).setCellFormula("ROW() - 1");  
        currentRow.createCell(1).setCellValue(newcompany.getCompanyname());  
        currentRow.createCell(2).setCellValue(newcompany.getAddress());  
        currentRow.createCell(3).setCellValue(newcompany.getCity());  
        currentRow.createCell(4).setCellValue(newcompany.getState());  
        currentRow.createCell(5).setCellValue(newcompany.getIdnumber());  
        currentRow.createCell(6).setCellValue(newcompany.getEmail());  
      
    }  
      
    public void Write(Collection<Company> newcompany) throws IOException {  
        for(Company c : newcompany) {  
            this.Write(c);  
        }  
    }  
      
    public void Write(Company... newcompany) throws IOException {  
        for(Company c : newcompany) {  
            this.Write(c);  
        }  
    }  
      
    public void Extract() throws IOException {  
        book.write(os);  
        book.close();  
    }  
   }  

