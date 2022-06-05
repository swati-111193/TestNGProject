package TestFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatafromExcel {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\swatigarg02\\Desktop\\Training PPts\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		String title = sh.getRow(1).getCell(0).getStringCellValue();
		System.out.println(title);
		Map<String, String> data = new HashMap<String, String>();
		data.put(sh.getRow(1).getCell(0).getStringCellValue(), sh.getRow(1).getCell(1).getStringCellValue());
		data.put(sh.getRow(2).getCell(0).getStringCellValue(), sh.getRow(2).getCell(1).getStringCellValue());
		System.out.println(data);
		

	}

}
