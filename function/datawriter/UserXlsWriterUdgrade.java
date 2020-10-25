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

import com.tixqik.object.UserBuilder;


	public class UserXlsWriterUdgrade {
		protected File file;  
	    protected OutputStream os;  
	    protected Workbook book = null;
	    public String filename = "userInfo.xls";
	    public UserXlsWriterUdgrade() {  
	        super();  
	}

	    public UserXlsWriterUdgrade(File filename) throws IOException, IllegalFormatException {
	    	
	   	 super();  
	        this.file = filename;  
	        
	        os = new FileOutputStream(file);  
	        book = new HSSFWorkbook();  
	        Sheet sheet = book.createSheet("user");  
	          
	        String[] title = {"Username", "Password", "Type","payment","address","city","zipcode","state","email","firstname","lastname","Company Name"};  
	        Row titleRow = sheet.createRow(0);  
	        for(int i = 0; i < title.length; i++) {  
	            Cell cell = titleRow.createCell(i + 1);  
	            cell.setCellValue(title[i]);  
	        }  
	    }  
	      
	    public void Write(UserBuilder user) throws IOException {  
	        Sheet sheet = book.getSheet("user");  
	        int lastRowNum = sheet.getLastRowNum();  
	        Row currentRow = sheet.createRow(lastRowNum + 1);  
	        currentRow.createCell(0).setCellFormula("ROW() - 1");  
	        currentRow.createCell(1).setCellValue(user.getUsername());  
	        currentRow.createCell(2).setCellValue(user.getPassword());  
	        currentRow.createCell(3).setCellValue(user.getType());  
	        currentRow.createCell(4).setCellValue(user.getPayment());  
	        currentRow.createCell(5).setCellValue(user.getAddress());  
	        currentRow.createCell(6).setCellValue(user.getCity());  
	        currentRow.createCell(7).setCellValue(user.getZipcode());  
	        currentRow.createCell(8).setCellValue(user.getState());  
	        currentRow.createCell(9).setCellValue(user.getEmail());  
	        currentRow.createCell(10).setCellValue(user.getFirstname());  
	        currentRow.createCell(11).setCellValue(user.getLastname());    
	        currentRow.createCell(12).setCellValue(user.getCompanyname());
	    }  
	      
	    public void Write(Collection<UserBuilder> users) throws IOException {  
	        for(UserBuilder u : users) {  
	            this.Write(u);  
	        }  
	    }  
	      
	    public void Write(UserBuilder... users) throws IOException {  
	        for(UserBuilder u : users) {  
	            this.Write(u);  
	        }  
	    }  
	      
	    public void Extract() throws IOException {  
	        book.write(os);  
	        os.close();  
	    }  
	   }  


