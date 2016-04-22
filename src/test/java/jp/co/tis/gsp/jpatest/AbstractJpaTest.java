package jp.co.tis.gsp.jpatest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.HibernateException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public abstract class AbstractJpaTest {

	private static EntityManagerFactory entityManagerFactory;
	protected static EntityManager entityManager;
	protected static EntityTransaction tran;

	@BeforeClass
	public static void initEntityManager() throws HibernateException {

		// invokerプラグインでキック
		// surefireプラグインで「GSP_DB」をセット
		String db = System.getProperty("GSP_DB");
		
		db = "h2";

		entityManagerFactory = Persistence.createEntityManagerFactory("persistence-" + db);
		entityManager = entityManagerFactory.createEntityManager();
	}

	@AfterClass
	public static void closeEntityManager() {
		entityManager.close();
		entityManagerFactory.close();
	}

	@Before
	public void setUp() {
		tran = entityManager.getTransaction();
		tran.begin();
	}

	@After
	public void after() {
		tran.rollback();
	}
}
