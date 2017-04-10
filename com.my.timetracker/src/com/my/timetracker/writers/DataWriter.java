package com.my.timetracker.writers;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import com.my.timetracker.timetracker.Task;
import com.my.timetracker.timetracker.User;
import org.apache.poi.xssf.usermodel.*;

public class DataWriter {
	    SimpleDateFormat dateFormat = 
	    	      new SimpleDateFormat ("dd/MM/yyyy");
	    SimpleDateFormat timeFormat = 
	    	      new SimpleDateFormat ("hh:mm:ss a");
	public boolean writeToFile(User user, String path){
		
		XSSFWorkbook workbook = new XSSFWorkbook();
	    XSSFSheet sheet = workbook.createSheet();
	 
	    int rowCount = 0;
	 
	    for (Task task : user.getTasks()) {
	        XSSFRow row = sheet.createRow(++rowCount);
	        writeTask(task, row);
	    }
	 
	    try (FileOutputStream outputStream = new FileOutputStream(path)) {
	        workbook.write(outputStream);
	        workbook.close();
	        return true;
	    } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	private void writeTask(Task task, XSSFRow row) {
		XSSFCell cell = row.createCell(1);
	    cell.setCellValue(task.getDescription());

	    cell = row.createCell(2);
	    cell.setCellValue(task.getTask());
	    
	    cell = row.createCell(4);
	    cell.setCellValue(dateFormat.format(task.getStartTime()));
	 
	    cell = row.createCell(5);
	    cell.setCellValue(timeFormat.format(task.getStartTime()));
	 
	    cell = row.createCell(6);
	    cell.setCellValue(dateFormat.format(task.getEndsTime()));
	 
	    cell = row.createCell(7);
	    cell.setCellValue(timeFormat.format(task.getEndsTime()));
	    
	    System.out.println("tasks:"+task.getDescription());
	}
}
