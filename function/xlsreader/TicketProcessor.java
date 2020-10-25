package com.tixqik.function.xlsreader;

import java.util.Vector;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;

import com.tixqik.function.fixed.RowProcessor;
import com.tixqik.object.Ticket;

public class TicketProcessor implements RowProcessor
{
	private static final short COLUMN_EVENT = 1;
	private static final short COLUMN_LOCATION = 2;
	private static final short COLUMN_ORGANIZER= 3;
	private static final short COLUMN_DATE = 4;
	private static final short COLUMN_TIME = 5;
	private static final short COLUMN_PRICE = 6;
	private static final short COLUMN_TYPE = 7;
	
	private static TicketProcessor thisProcessor;
	
	private TicketProcessor()
	{
		
	}
	
	public static RowProcessor getInstance()
	{
		if(thisProcessor == null)
		{
			thisProcessor = new TicketProcessor();
		}
		return thisProcessor;
	}
	public Vector process(HSSFSheet sheet) throws Exception
	{
		if(sheet != null)
		{
			   int first = sheet.getFirstRowNum();
			   int last = sheet.getLastRowNum();
			   HSSFRow row = null;
			   Vector itemContainer = new Vector ();
			   
			   Ticket item = null; 
			   
			   first += 1; 
			   
			   for(int i= first; i<=last; i++)
			   {
				   row = sheet.getRow(i);
				   if(row != null && row.getCell(COLUMN_EVENT) != null)
				   {
					   item = new Ticket();
					   item.setEvent(row.getCell(COLUMN_EVENT).getRichStringCellValue().getString());
					   item.setLocation(row.getCell(COLUMN_LOCATION).getRichStringCellValue().getString());
					   item.setOrganizer(row.getCell(COLUMN_ORGANIZER).getRichStringCellValue().getString());
					   item.setDate(row.getCell(COLUMN_DATE).getRichStringCellValue().getString());
					   item.setTime(row.getCell(COLUMN_TIME).getRichStringCellValue().getString());
					   item.setPrice(row.getCell(COLUMN_PRICE).getRichStringCellValue().getString());
					   item.setType(row.getCell(COLUMN_TYPE).getRichStringCellValue().getString());
					   itemContainer.add(item);
				   }
			   }
			   return itemContainer;
		}
		return null;
	}
}
