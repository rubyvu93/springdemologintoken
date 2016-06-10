package web.service;

import java.util.List;

import web.entities.Users;

public interface UserService {
	public Users getByUserName(String username);
	
	public List<Users> findAll();
	
	public void update(Users users);
}
