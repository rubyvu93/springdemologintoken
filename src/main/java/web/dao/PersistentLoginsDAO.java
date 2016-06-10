package web.dao;

import java.util.List;
import web.entities.PersistentLogins;

public interface PersistentLoginsDAO {

	public PersistentLogins getByToken(String token);
	
	public List<PersistentLogins> findAll();
	
	public void update(PersistentLogins persistentLogins);
}
