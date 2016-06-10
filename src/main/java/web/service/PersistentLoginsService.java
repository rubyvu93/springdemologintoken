package web.service;

import java.util.List;
import web.entities.PersistentLogins;

public interface PersistentLoginsService {
	public PersistentLogins getByToken(String token);
	
	public List<PersistentLogins> findAll();
	
	public void update(PersistentLogins persistentLogins);
}
