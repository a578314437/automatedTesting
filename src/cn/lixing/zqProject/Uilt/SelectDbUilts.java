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
	 * 查询数据
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
			System.out.println(sql);
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
	/**
	 * 获取对应表的行数
	 * @param TableName
	 * @param colName
	 * @return 返回行数
	 */
	public static int getTableCountNum(String TableName,Object COMPANY_NAME) {
		Connection connection;
		PreparedStatement pmt=null;
		ResultSet rs=null;
		int colMax=0;
		String sql;
		connection=getConnection();
		try {
			if(COMPANY_NAME==null) {
				sql="SELECT COUNT(*) FROM "+TableName+"";
			}else {
				sql="select count(*) from TB_CACHE_COMPANY_INFO a INNER JOIN TB_ARTICLE_COMPANY b ON a.COMPANY_CODE=b.COMPANY_CODE WHERE COMPANY_NAME LIKE '%"+COMPANY_NAME+"%'";
			}
			
			pmt=connection.prepareStatement(sql);
			rs=pmt.executeQuery();
			while(rs.next()) {
				colMax=rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return colMax;
	}
	/**
	 * 删除数据
	 * @param TableName
	 * @param colName
	 */
	public static void deleteData(String TableName,String colName) {
		Connection connection;
		PreparedStatement pmt=null;
		String sql=null;
		connection=getConnection();
		try {
			if(colName==null) {
				sql="DELETE "+TableName;
			}
			sql="DELETE "+TableName+" WHERE "+colName+"=(select * FROM(SELECT "+colName+" FROM "+TableName+" ORDER BY "+colName+" DESC) WHERE ROWNUM=1)";
			pmt=connection.prepareStatement(sql);
			pmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("数据清除成功！！");
	}
	public static void main(String[] args) {
//		List<Object>list=select("TB_KEY_PERSON_INFO", new String[]{"PERSON_NAME","KEY_PHONE"},"CREATE_TIME");
//		for(Object obj:list) {
//			System.out.println(obj);
//		}
//		System.out.println(getTableCountNum("TB_ARTICLE_COMPANY", "霖"));
		deleteData("TB_KEY_PERSON_INFO","id");
	}
}
