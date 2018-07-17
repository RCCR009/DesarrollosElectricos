package cr.ac.ucenfotec.logic;

import java.util.ArrayList;
import DataAccess.MongoDbTransaction;
import cr.ac.ucenfotec.entities.AreaFuncional;

public class GestorAreaFuncional implements GestorMaster{
	
	MongoDbTransaction transaction;
	
	public GestorAreaFuncional(){
		this.transaction = new MongoDbTransaction();
	}
	
	@Override
	public void create(Object obj) {
		try {
			transaction.InsertDocuement(obj, "areasfuncionales");	
		}catch(Exception e) {
			throw e;
		}
	}
	
	@Override
	public ArrayList<Object> retriveAll(Object obj) {
		try {
			return transaction.GetData(obj, "areasfuncionales");		 
		}catch(Exception e) {
			throw e;
		}
	}
	
	@Override
	public Object retrive(Object obj) {
		try {
			return transaction.RetriveDocument(obj, "areasfuncionales");
		}catch(Exception e) {
			throw e;
		}
	}
	
	@Override
	public void update(Object obj) {
		try {
			AreaFuncional areaFuncional = new AreaFuncional();
			AreaFuncional af = (AreaFuncional)obj;
			areaFuncional.setId(af.getId()); 
			
			transaction.UpdateDocument(obj, "areasfuncionales","id",areaFuncional);
		}catch(Exception e) {
			throw e;
		}	
	}
	
	@Override
	public void delete(Object obj) {
		try {
			transaction.DeleteDocument(obj, "areasfuncionales");
		}catch(Exception e) {
			throw e;
		}
	}

}
