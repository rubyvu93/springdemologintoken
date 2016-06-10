package web.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.PersistentLoginsDAO;
import web.entities.PersistentLogins;

@Service("persistentLoginsService")
@Transactional
public class PersistentLoginsServiceImpl implements PersistentLoginsService {

	@Autowired
	private PersistentLoginsDAO persistentLoginsDAO;

	@Override
	public PersistentLogins getByToken(String token) {
		return persistentLoginsDAO.getByToken(token);
	}

	@Override
	public List<PersistentLogins> findAll() {
		return persistentLoginsDAO.findAll();
	}

	@Override
	public void update(PersistentLogins persistentLogins) {
		persistentLoginsDAO.update(persistentLogins);
	}

	
}
