package com.aartek.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DisplayRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	public List<Object> showDisplayRepo()
	{
		System.out.println("inside repository");
		SessionFactory sessionFactory=hibernateTemplate.getSessionFactory();
		Session session=sessionFactory.openSession();
		Query query = session.createSQLQuery("select * from display where id='id'");
				List<Object> result = query.list();
				/*Iterator<Object> it = result.iterator();
				while (it.hasNext()) {
					Object dt = (Object) it.next();
					System.out.println(dt);
					System.out.println(result.get(0));
				}*/
			
		return result;
		
	}
}
