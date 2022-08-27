package com.app.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.app.dto.UserRequest;
import com.app.model.User;

import com.app.util.HibernateUtil;

public class UserDaoImpl implements USerDao{

	public int register(User user) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		try {
			
			session = HibernateUtil.getSession();
			tx = session.beginTransaction();
			session.save(user);
			tx.commit();

			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	public User login(UserRequest user) {
		Session session = null;
		Transaction tx = null;
		User usResponse=new User();
		try {
			SessionFactory factory= factory=new Configuration()
                    .configure("hibernate-cfg-ott.xml")
		            .buildSessionFactory();
			session = factory.openSession();
		
			tx = session.beginTransaction();
			Query<User> query = session.createQuery(
					"From User where uemail='" + user.getEmail() + "' and password='" + user.getPassword() + "'");
			usResponse = query.list().get(0);
			session.close();
			
			return usResponse;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		}

	public List<User> listOfUsers() {
		// TODO Auto-generated method stub
		SessionFactory factory= factory=new Configuration()
                .configure("hibernate-cfg-ott.xml")
	            .buildSessionFactory();
	Session	session = factory.openSession();
	Transaction tx =session.beginTransaction();
		Query query=session.createQuery("From User  ");
		
		return query.list();
	}
	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		SessionFactory factory= factory=new Configuration()
                .configure("hibernate-cfg-ott.xml")
	            .buildSessionFactory();
	Session	session = factory.openSession();
	Transaction tx =session.beginTransaction();
		Query query=session.createQuery("From User u where u.id=:id");
		query.setParameter("id", id);
		List<User> user=query.list();
		return user.get(0);
	}

}
