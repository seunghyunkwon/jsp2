package test.util;

import org.apache.ibatis.session.SqlSessionFactory;

import mybatis.SqlSessionBean;

public class SqlSessionFactoryTest {

	public static void main(String[] args) {
		
	SqlSessionFactory factory=
			SqlSessionBean.getSessionFactory();
		System.out.println(factory);
	}
}
