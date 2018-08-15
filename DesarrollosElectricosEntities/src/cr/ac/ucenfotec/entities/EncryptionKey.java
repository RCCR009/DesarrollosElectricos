package cr.ac.ucenfotec.entities;

import java.util.Arrays;

public class EncryptionKey {
	private String name;
	private byte[] key;
	private int keySize;
	
	public EncryptionKey() {
		
	}

	public EncryptionKey(String name, byte[] key, int keySize) {
		super();
		this.name = name;
		this.key = key;
		this.keySize = keySize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getKey() {
		return key;
	}

	public void setKey(byte[] key) {
		this.key = key;
	}

	public int getKeySize() {
		return keySize;
	}

	public void setKeySize(int keySize) {
		this.keySize = keySize;
	}

	@Override
	public String toString() {
		return "EncryptionKey [name=" + name + ", key=" + Arrays.toString(key) + ", keySize=" + keySize + "]";
	}
	
}
