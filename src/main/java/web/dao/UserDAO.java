package web.dao;

import java.util.List;
import web.entities.Users;

public interface UserDAO {

	public Users getByUserName(String username);
	
	public List<Users> findAll();
	
	public void update(Users users);
}
