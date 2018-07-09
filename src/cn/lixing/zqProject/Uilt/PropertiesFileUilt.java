package cn.lixing.zqProject.Uilt;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static cn.lixing.zqProject.Uilt.CloseFileUilt.*;
public class PropertiesFileUilt {
	public static String getData(String keyNanem,String fileName) {
		String classPath=System.getProperty("user.dir");
		Properties ps=new Properties();
		BufferedInputStream in=null;
		try {
			in=new BufferedInputStream(
					new FileInputStream(classPath+fileName+".properties"));
			ps.load(in);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		close(in);
		return ps.getProperty(keyNanem);
	}
}
