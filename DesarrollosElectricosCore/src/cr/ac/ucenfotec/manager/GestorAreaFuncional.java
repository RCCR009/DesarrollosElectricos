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
		String value;
		AreaFuncional areaFuncional = (AreaFuncional)obj;
		try {
			nameValue = "id";	
			value = areaFuncional.getId();
			return transaction.RetriveDocument(obj, "areasfuncionales",nameValue,value);
		}catch(Exception e) {
			throw e;
		}
	}

	@Override
	public void update(Object obj) {
		String idName;
		String areaIdValue;
		AreaFuncional aF = (AreaFuncional)obj;
		try {
			idName = "id";
			areaIdValue = aF.getId(); 
			
			transaction.UpdateDocument(obj,"areasfuncionales",idName,areaIdValue);
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
