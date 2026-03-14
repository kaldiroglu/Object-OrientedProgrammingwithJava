
package org.javaturk.oopj.ch08.persistence.dao;

import org.javaturk.oopj.ch08.persistence.db.ConnectionFactory;
import org.javaturk.oopj.ch08.persistence.db.DBConnection;
import org.javaturk.oopj.ch08.persistence.domain.Entity;

public abstract class AbstractDao {
	protected DBConnection db;
	
	public AbstractDao(){
		ConnectionFactory factory = new ConnectionFactory();
		db = factory.getConnection();
	}
	
	public abstract void save(Entity e);
	
	public abstract void update(Entity e);
	
	public abstract Entity retrieve(Class clazz, int id);
}
