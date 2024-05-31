package org.hotel.config;
import java.sql.*;

public class DBHelper {
	protected DBConfig db=DBConfig.getDBInstance();
	protected Connection conn=DBConfig.getConnection();
	protected PreparedStatement pstmt=DBConfig.getPreparedStatement();
	protected ResultSet res=DBConfig.getResultSet();
}
