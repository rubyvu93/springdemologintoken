package web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.entities.Users;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	@Override
	public Users getByUserName(String username) {
		return userDAO.getByUserName(username);
	}

	@Override
	public List<Users> findAll() {
		return userDAO.findAll();
	}

	@Override
	public void update(Users users) {
		userDAO.update(users);
	}
	
}
