package test.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnectUtil {	//오라클 연결이 필요할 때 사용될 클래스
	
	//연결
	public static Connection connect() {	//주석은 JDBCConnectTest.java를 참고
		
		String url = "jdbc:oracle:thin:@//localhost:1521/xe";	
		
		String user = "idev";
		String password = "1234";
		String driver = "oracle.jdbc.driver.OracleDriver";	
		Connection conn=null;
		try {
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url, user, password);
			if(conn==null)
				System.out.println("데이터베이스 서버에 연결되지 못했습니다.");
			
			System.out.println("연결상태 확인:" + conn);
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 로드 오류: "+e.getMessage());
		} catch (SQLException e2) {
			System.out.println("연결 URL, 사용자 계정 정보 오류:"+e2.getMessage());
		}
		
		return conn;
		
	}//connect end
	
	//연결 종료
	public static void close(Connection conn) {
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("데이터베이스 연결종료 실패"+e.getMessage());
			}
		}
		
	}
}
