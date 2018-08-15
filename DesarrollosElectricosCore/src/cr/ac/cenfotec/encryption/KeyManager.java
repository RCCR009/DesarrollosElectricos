package cr.ac.cenfotec.encryption;

import DataAccess.MongoDbTransaction;
import cr.ac.ucenfotec.entities.EncryptionKey;

public class KeyManager {
	
	private MongoDbTransaction transaction;
	
	public KeyManager(){
		this.transaction = MongoDbTransaction.GetInstance();
	}
	
	public void createKey(String name, int keySize) throws Exception {
		byte [] key = generatedSequenceOfBytes(keySize);
		EncryptionKey encryptationKey = 
				new EncryptionKey(name,key,keySize);
		try {
			transaction.InsertDocuement(encryptationKey, "encryptionKey");	
		}catch(Exception e) {
			throw e;
		}	
	}
	
	public byte[] fetchKey(String keyName) {
		String nameValue;
		EncryptionKey encryptationKey = new EncryptionKey();
		try {
			nameValue = "name";
			encryptationKey = (EncryptionKey) transaction.
					RetriveDocument(encryptationKey,"encryptionKey",nameValue,keyName);	
			return encryptationKey.getKey();
		}catch(NullPointerException e) {
			byte[] b = new byte[0];
			return b;
		}
	}
	
	public void delete(Object obj) {
		try {
			transaction.DeleteDocument(obj, "encryptionKey");
		}catch(Exception e) {
			throw e;
		}
	}
	
	private byte[] generatedSequenceOfBytes(int keySize) throws Exception {
		StringBuilder randomkey = new StringBuilder();
		for (int i = 0;i < keySize;i++){
			randomkey.append(Integer.parseInt(Double.toString((Math.random()+0.1)*1000).substring(0,2)));
		}
		return randomkey.toString().getBytes("UTF-8");
	}
	

}
