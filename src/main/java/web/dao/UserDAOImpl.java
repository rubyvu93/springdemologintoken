package web.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.entities.Users;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Users getByUserName(String username) {
		Query query = sessionFactory
				.getCurrentSession()
				.createQuery("from Users where username = :username");
		query.setString("username", username);
		return (Users) query.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Users> findAll() {
		return sessionFactory.getCurrentSession()
				.createQuery("from Users")
				.list();
	}

	@Override
	public void update(Users users) {
		sessionFactory.getCurrentSession().update(users);
	}

}
