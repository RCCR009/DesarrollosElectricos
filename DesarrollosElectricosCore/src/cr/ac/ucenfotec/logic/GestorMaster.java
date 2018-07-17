package cr.ac.ucenfotec.logic;

import java.util.ArrayList;

public interface GestorMaster {
	
	public void create(Object obj);
	public ArrayList<Object> retriveAll(Object obj);
	public Object retrive(Object obj);
	public void update(Object obj);
	public void delete(Object obj);

}
