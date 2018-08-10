package cr.ac.ucenfotec.manager;

import java.util.ArrayList;
import DataAccess.MongoDbTransaction;
import cr.ac.ucenfotec.entities.AreaFuncional;

public class GestorAreaFuncional extends GestorMaster{

	
	public GestorAreaFuncional(){
		transaction = MongoDbTransaction.GetInstance();
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
		String nameValue;
		try {
			nameValue = "id";		
			return transaction.RetriveDocument(nameValue, obj, "areasfuncionales");
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
