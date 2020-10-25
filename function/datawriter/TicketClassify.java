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
import com.tixqik.object.UserBuilder;


		public class TicketClassify {
			protected File file;  
		    protected OutputStream os;  
		    protected Workbook book = null;  
		    public TicketClassify() {  
		        super();  
		}
		    public TicketClassify(File file) throws IOException, IllegalFormatException {
		    	
		   	 super();  
		        this.file = file;  
		        
		        os = new FileOutputStream(file);  
		        book = new HSSFWorkbook();  
		        Sheet sheet1 = book.createSheet("Sports");
		        Sheet sheet2 = book.createSheet("Concert");
		        Sheet sheet3 = book.createSheet("Drama");
		        
		          
		        String[] title = {"Event","Location", "Organizer","Date","Time","Price","Type"};  
		        Row titleRow1 = sheet1.createRow(0);
		        Row titleRow2 = sheet2.createRow(0);
		        Row titleRow3 = sheet3.createRow(0);
		        for(int i = 0; i < title.length; i++) {  
		            Cell cell = titleRow1.createCell(i + 1);  
		            cell.setCellValue(title[i]);  
		        } 
		       for(int i = 0; i < title.length; i++) {  
		          Cell cell = titleRow2.createCell(i + 1);  
		            cell.setCellValue(title[i]);  
		        }  
		        for(int i = 0; i < title.length; i++) {  
		            Cell cell = titleRow3.createCell(i + 1);  
		            cell.setCellValue(title[i]);  
		        }  
		    }  		      			      
		    public void Write(Collection<Ticket> ticket) throws IOException {  
		        for(Ticket u : ticket) {  
		            this.Write(u);  
		        }  
		    }  
		      
		    public void Write(Ticket... ticket) throws IOException {  
		        for(Ticket u : ticket) {  
		            this.Write(u);  
		        }  
		    }  
		      
		    public void Extract() throws IOException {  
		        book.write(os);  
		        os.close();  
		    }  
		   }  


