package cn.lixing.zqProject.Uilt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static cn.lixing.zqProject.Uilt.CloseFileUilt.*;
public class CsvDataUilt {
	public static Object[][] getCsvData(String fileName){
		String RootPath=System.getProperty("user.dir");
		BufferedReader reader=null;
		String lineData=null;
		String[] lineDataArray=null;
		List<String[]> lineDataList=new ArrayList<>();
		Object[][] testDatas=null;
		try {
			reader=new BufferedReader(new FileReader(RootPath+"//TestDataFile//"+fileName+".csv"));
			reader.readLine();//ºöÂÔµÚÒ»ÐÐ
			
			while((lineData=reader.readLine())!=null) {
				lineDataArray=lineData.split(",");
				lineDataList.add(lineDataArray);
				System.out.println(Arrays.asList(lineDataArray));
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
		Object[][] objs=getCsvData("AddKeyPersonManageData");
		System.out.println(objs[0][0]);
		System.out.println(objs[0][1]);
		System.out.println(objs[0][2]);
		
		
	}
}
