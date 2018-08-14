package cr.ac.ucenfotec.logic.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cr.ac.cenfotec.encryption.AlgorithmName;
import cr.ac.cenfotec.encryption.EncryptionManager;

public class EncryptionTest {

	@Test
	public void test() throws Exception {
		EncryptionManager encryption = new EncryptionManager();
		String encryptedMessage = encryption.encryptMessage
				("helloWorld", "symmetric", AlgorithmName.AES);
		
		String decryptedMessage = encryption.decryptMessage
				(encryptedMessage, "symmetric", AlgorithmName.AES);
		assertEquals("helloWorld",decryptedMessage);
	}

}
