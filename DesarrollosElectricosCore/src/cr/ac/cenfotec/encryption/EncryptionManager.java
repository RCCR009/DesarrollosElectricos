package cr.ac.cenfotec.encryption;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class EncryptionManager {
	
	private final int KEYSIZE;
	private KeyManager keyManager;
	
	public EncryptionManager() {
		this.KEYSIZE = 8;
		this.keyManager = new KeyManager();
	}

	public String encryptMessage(String message, String keyName, AlgorithmName algorithm) throws Exception {
		byte[] key = haveKey(keyName);
		Cipher cipher = Cipher.getInstance(algorithm.toString());
		SecretKeySpec k = new SecretKeySpec(key, algorithm.toString());
		cipher.init(Cipher.ENCRYPT_MODE, k);
		byte[] encryptedData = cipher.doFinal(message.getBytes(StandardCharsets.UTF_8));
	    Encoder oneEncoder = Base64.getEncoder();
	    encryptedData = oneEncoder.encode(encryptedData);
		return new String(encryptedData, StandardCharsets.UTF_8);
	}
	
	public String decryptMessage(String encryptedMessage, String keyName, AlgorithmName algorithm) throws Exception {
		byte[] key = haveKey(keyName);
		Cipher cipher = Cipher.getInstance(algorithm.toString());
		SecretKeySpec k = new SecretKeySpec(key,algorithm.toString());
		cipher.init(Cipher.DECRYPT_MODE, k);
		Decoder oneDecoder = Base64.getDecoder();
		byte[] DecryptedData = oneDecoder.decode(encryptedMessage);
		DecryptedData = cipher.doFinal(DecryptedData);
		String message = new String(DecryptedData, StandardCharsets.UTF_8);
		return message;
	}
	
	private byte[] haveKey(String keyName) throws Exception {

		if(keyManager.fetchKey(keyName).length == 0) {
			keyManager.createKey(keyName, KEYSIZE);
		}		
		return keyManager.fetchKey(keyName);
	}

}
