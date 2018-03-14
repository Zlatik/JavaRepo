package services;
import models.User;

import java.util.List;


import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("UserService")
@Transactional
public class UserService {

	protected static Logger logger = Logger.getLogger("service");
	
	@Resource(name="SessionFactory")
	private SessionFactory sessionfactory;
	
	@SuppressWarnings("unchecked")
	public List<User> getAll(){
		logger.debug("retrivieng all users");
		Session session = sessionfactory.getCurrentSession();
		Query query = session.createQuery("FROM USER");
		return query.list();
	}
	
	public User get(long id) {
		Session session = sessionfactory.getCurrentSession();
		  User user = (User) session.get(User.class, id);
		  return user;
	}
	public void add(User user) {
		  logger.debug("Adding new user");
		  Session session = sessionfactory.getCurrentSession();
		  session.save(user);
		  
		 }
	public void edit(User user) {
		 logger.debug("Editing existing user");
		  Session session = sessionfactory.getCurrentSession();
		  User existingUser = (User) session.get(User.class, user.getId());
		  existingUser.setUsername(existingUser.getUsername());
		  existingUser.setPassword(existingUser.getPassword());
		  existingUser.setAge(existingUser.getAge());
		  session.save(existingUser);
	}
	public void delete(long id) {
		Session session = sessionfactory.getCurrentSession();
		User existingUser = (User) session.get(User.class,id);
		session.delete(existingUser);
	}
	
}
