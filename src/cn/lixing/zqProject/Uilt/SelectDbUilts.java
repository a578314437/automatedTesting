package cn.lixing.zqProject.Uilt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static cn.lixing.zqProject.Uilt.PropertiesFileUilt.*;
public class SelectDbUilts {
	public static Connection getConnection() {
		Connection connection=null;
		try {
			Class.forName(getData("device", "\\configFile\\jdbc"));
			connection=DriverManager.getConnection(
					getData("url", "\\configFile\\jdbc"), 
					getData("username", "\\configFile\\jdbc"), 
					getData("password", "\\configFile\\jdbc"));
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	/**
	 * ²éÑ¯Êý¾Ý
	 * @param TableName
	 * @return
	 */
	public static List<Object> select(String TableName,String[]colValues,String id) {
		Connection connection;
		String sql;
		String colValueStr;
		PreparedStatement pmt;
		ResultSet result;
		List<Object>rowListDatas=new ArrayList<>();
		List<List<Object>> listArr=null;
		List<String>colValueslist=new ArrayList<>();
		ResultSetMetaData meta=null;
		int colNum=0;
		connection=getConnection();
		for(String colValue:colValues) {
			colValueslist.add(colValue);
		}
		try {
			colValueStr=colValueslist.toString().replace("[", "").replace("]", "");
			sql="select * FROM(SELECT "+colValueStr+" FROM "+TableName+" ORDER BY "+id+" DESC) WHERE ROWNUM<=1";
			pmt=connection.prepareStatement(sql);
			result=pmt.executeQuery();
			meta = result.getMetaData();
			colNum=meta.getColumnCount();
			while(result.next()) {
			for(int i=0;i<meta.getColumnCount();i++) {
				Object colVaules=result.getObject(i+1);
				rowListDatas.add(colVaules);
			}
			}
			listArr = new ArrayList<>();      
	        int arrSize = rowListDatas.size()%colNum==0?rowListDatas.size()/colNum:rowListDatas.size()/colNum+1;      
	        for(int i=0;i<arrSize;i++) {      
	        	List<Object>rowListData=new ArrayList<>();      
	            for(int j=i*colNum;j<=colNum*(i+1)-1;j++) {      
	                if(j<=rowListDatas.size()-1) {      
	                	rowListData.add(rowListDatas.get(j));      
	                }      
	            }      
	            listArr.add(rowListData);
	        }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return listArr.get(0);
	}
//	public static void main(String[] args) {	
//		String[] ass=new String[] {"TITLE","dbms_lob.substr(CONTENT)"};
//		System.out.println(select("TB_DEVICE_EDU",ass));
//	}
}
