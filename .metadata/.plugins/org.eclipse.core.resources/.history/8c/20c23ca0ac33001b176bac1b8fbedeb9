import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlMapConfig {
	public static SqlSessionFactory sqlSession;

	static {
		String resource = "Configuration.xml";

		try {

			Reader reader = Resources.getResourceAsReader(resource);
			sqlSession = new SqlSessionFactoryBuilder().build(reader);
			reader.close();

			// sqlMapperInter 연결
			Class[] mapper = { SqlMapperInter.class };

			// Mapper 등록
			for (Class m : mapper) {
				sqlSession.getConfiguration().addMapper(m);
			}

		} catch (Exception e) {
			System.out.println("SqlMapConfig err :" + e);
		}
	}

	public static SqlSessionFactory getSession() {
		return sqlSession;
	}
}
