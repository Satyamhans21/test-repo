package util;

import java.sql.Connection;

public class DBUtil {
	

	public static Connection getDBConn()
	{
		Connection connection = null;
		String propstr=DBPropertyUtil.getPropertyString("C://Users//satya//eclipse-workspace//Hexaware-Assignment-CaseStudy//Assignment//Banking-System//src//database.properties");
		connection=DBConnUtil.getConnection(propstr);
		return connection;
	}
}
