package web.dao;

import web.entities.PersistentLogins;
import java.util.List;
import org.hibernate.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Repository("persistentLoginsDAO")
public class PersistentLoginsDAOImpl implements PersistentLoginsDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public PersistentLogins getByToken(String token) {
		Query query = sessionFactory
				.getCurrentSession()
				.createQuery("from PersistentLogins where token = :token");
		query.setString("token", token);
		return (PersistentLogins) query.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PersistentLogins> findAll() {
		return sessionFactory.getCurrentSession()
				.createQuery("from PersistentLogins")
				.list();
	}

	@Override
	public void update(PersistentLogins persistentLogins) {
		sessionFactory.getCurrentSession().update(persistentLogins);
	}

}
