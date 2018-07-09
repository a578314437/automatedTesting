package cn.lixing.zqProject.Uilt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static cn.lixing.zqProject.Uilt.CloseFileUilt.*;
public class CsvDataUilt {
	public static Object[][] getCsvData(String file){
		BufferedReader reader=null;
		String lineData=null;
		String[] lineDataArray=null;
		List<String[]> lineDataList=new ArrayList<>();
		Object[][] testDatas=null;
		try {
			reader=new BufferedReader(new FileReader(file));
			reader.readLine();//ºöÂÔµÚÒ»ÐÐ
			
			while((lineData=reader.readLine())!=null) {
				lineDataArray=lineData.split(",");
				lineDataList.add(lineDataArray);
			}
			int lineDataArraylen=lineDataArray.length;
			int lineDataListLen=lineDataList.size();
			testDatas=new Object[lineDataListLen][lineDataArraylen];
			for(int i=0;i<lineDataListLen;i++) {
				for(int j=0;j<lineDataArraylen;j++) {
					testDatas[i][j]=lineDataList.get(i)[j];
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			close(reader);
			e.printStackTrace();
		}
		return testDatas;
	}
	public static void main(String[] args) {
		Object[][] objs=getCsvData("D:\\zqProject\\zqProject\\TestDataFile\\insertDeviceDataFile.csv");
		System.out.println(objs[0][0]);
		
		
	}
}
