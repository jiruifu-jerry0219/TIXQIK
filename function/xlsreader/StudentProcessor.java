package com.tixqik.function.xlsreader;

import java.util.Vector;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;

import com.tixqik.function.fixed.RowProcessor;
import com.tixqik.object.StudentGame;

public class StudentProcessor implements RowProcessor 
{
	private static final short COLUMN_TIME = 1;
	private static final short COLUMN_DATE = 2;
	private static final short COLUMN_LOCATION=3;
	private static final short COLUMN_NAME = 4;
	private static final short COLUMN_TYPE = 5;
	private static final short COLUMN_CAPACITY = 6;
	
private static StudentProcessor thisProcessor;
	
	private StudentProcessor()
	{
		
	}
	public static RowProcessor getInstance()
	{
		if(thisProcessor == null)
		{
			thisProcessor = new StudentProcessor();
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
			   
			   StudentGame item = null; 
			   
			   first += 1; 
			   
			   for(int i= first; i<=last; i++)
			   {
				   row = sheet.getRow(i);
				   if(row != null && row.getCell(COLUMN_TIME) != null)
				   {
					   item = new StudentGame();
					   item.setTime(row.getCell(COLUMN_TIME).getRichStringCellValue().getString());
					   item.setDate(row.getCell(COLUMN_DATE).getRichStringCellValue().getString());
					   item.setLocation(row.getCell(COLUMN_LOCATION).getRichStringCellValue().getString());
					   item.setName(row.getCell(COLUMN_NAME).getRichStringCellValue().getString());
					   item.setType(row.getCell(COLUMN_TYPE).getRichStringCellValue().getString());
					   item.setCapacity(row.getCell(COLUMN_CAPACITY).getRichStringCellValue().getString());
					   itemContainer.add(item);
				   }
			   }
			   return itemContainer;
		}
		return null;
	}

	

}
