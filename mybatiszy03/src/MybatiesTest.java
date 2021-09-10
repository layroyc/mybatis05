import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MybatiesTest {
    private SqlSession sqlSession;
    @Before //@Test注解之前，执行的方法，提取重复的方法
    public void before() throws Exception {
        //加载并读取xml
        String path = "SqlMapConfig.xml";
        InputStream is = Resources.getResourceAsStream(path);
        //sql  连接的工厂类
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        sqlSession = sqlSessionFactory.openSession();
        System.out.println("sqlSession = " + sqlSession);//sqlSession = org.apache.ibatis.session.defaults.DefaultSqlSession@5ce81285


    }

    //动态全查
    @Test
    public void test01(){
        Map map = new HashMap();
        map.put("cname","郑州");
        List<Map> mapList = sqlSession.selectList("com.hp.dao.CityDAO.dongTaiCantonalSelectCity", map);
        for (Map map1 : mapList) {
            System.out.println("map1 = " + map1);
        }
        sqlSession.close();

    }

}
