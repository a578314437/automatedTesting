package cn.lixing.zqProject.Uilt;

import java.util.Random;

public class CollectionsSortUilts {
	public static char getRandomChar(){
		String str = "0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		Random r = new Random(System.currentTimeMillis());
		char ch = str.charAt(r.nextInt(62));
		return ch;
	}
	public static String getRandomString(int length){
		StringBuffer str = new StringBuffer();
		while(length > 0){
			char ch = getRandomChar();
			str.append(ch);
			length--;
		}
		return str.toString();
	}
	
}
