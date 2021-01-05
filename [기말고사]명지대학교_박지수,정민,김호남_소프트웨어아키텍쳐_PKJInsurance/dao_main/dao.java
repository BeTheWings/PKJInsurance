package dao_main;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class dao {

	private SqlSessionFactory sqlSessionFactory;

	public void connect() throws Exception {
		try {
			Reader reader = Resources.getResourceAsReader("context.xml");
			if (sqlSessionFactory == null) {
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public SqlSession getSqlSession() {
		return sqlSessionFactory.openSession();
	}

}