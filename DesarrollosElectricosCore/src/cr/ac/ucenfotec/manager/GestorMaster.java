package cr.ac.ucenfotec.manager;

import java.util.ArrayList;

import DataAccess.MongoDbTransaction;

public abstract class GestorMaster {
	protected MongoDbTransaction transaction;
	
	public abstract void create(Object obj);
	public abstract ArrayList<Object> retriveAll(Object obj);
	public abstract Object retrive(Object obj);
	public abstract void update(Object obj);
	public abstract void delete(Object obj);

}
