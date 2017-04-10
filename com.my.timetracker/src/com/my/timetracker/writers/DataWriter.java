package com.my.timetracker.writers;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.my.timetracker.timetracker.Task;
import com.my.timetracker.timetracker.User;
import org.apache.poi.xssf.usermodel.*;

public class DataWriter {
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
	 
	    cell = row.createCell(4);
	    cell.setCellValue(task.getStartTime());
	 
	    cell = row.createCell(5);
	    cell.setCellValue(task.getEndsTime());

	}
}
