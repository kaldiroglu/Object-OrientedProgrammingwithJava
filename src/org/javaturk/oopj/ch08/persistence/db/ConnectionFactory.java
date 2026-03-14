
package org.javaturk.oopj.ch08.persistence.db;

public class ConnectionFactory {

	public DBConnection getConnection() {
		return new DBConnection();
	}
}
