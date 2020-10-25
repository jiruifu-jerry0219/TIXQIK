package com.tixqik.function.xlsreader;

import java.util.Vector;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;

import com.tixqik.function.fixed.RowProcessor;
import com.tixqik.object.Message;
import com.tixqik.object.StudentGame;

public class MessageProcessor implements RowProcessor 
{
	private static final short COLUMN_TITLE = 1;
	private static final short COLUMN_EMAIL = 2;
	private static final short COLUMN_CONTENT=3;
	
	private static MessageProcessor thisProcessor;
	
	private MessageProcessor()
	{
		
	}
	public static RowProcessor getInstance()
	{
		if(thisProcessor == null)
		{
			thisProcessor = new MessageProcessor();
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
			   
			   Message item = null; 
			   
			   first += 1; 
			   
			   for(int i= first; i<=last; i++)
			   {
				   row = sheet.getRow(i);
				   if(row != null && row.getCell(COLUMN_TITLE) != null)
				   {
					   item = new Message();
					   item.setTitle(row.getCell(COLUMN_TITLE).getRichStringCellValue().getString());
					   item.setEmail(row.getCell(COLUMN_EMAIL).getRichStringCellValue().getString());
					   item.setContent(row.getCell(COLUMN_CONTENT).getRichStringCellValue().getString());
					   itemContainer.add(item);
				   }
			   }
			   return itemContainer;
		}
		return null;
	}

}
