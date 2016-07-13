package com.urja.auth;

import java.security.spec.KeySpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import org.apache.commons.codec.binary.Base64;
/**
 * 
 * @author Hemendra
 * Jul 13, 2016
 * 11:51:14 AM
 * ref: http://stackoverflow.com/questions/10303767/encrypt-and-decrypt-in-java
 * 
 */
public class LoginAuthentication {
	private static final String UNICODE_FORMAT = "UTF8";
	public static final String DESEDE_ENCRYPTION_SCHEME = "DESede";
	private KeySpec ks;
	private SecretKeyFactory skf;
	private static Cipher cipher;
	byte[] arrayBytes;
	private String myEncryptionKey;
	private String myEncryptionScheme;
	private static SecretKey key;

	/**
	 * myEncryptionKey: Encryption Key "It should not be changed in future."
	 * @throws Exception
	 */
	public LoginAuthentication() throws Exception {
		myEncryptionKey = "UrjaLaundryServiceAProductOfUrja&Partners@957612";
		myEncryptionScheme = DESEDE_ENCRYPTION_SCHEME;
		arrayBytes = myEncryptionKey.getBytes(UNICODE_FORMAT);
		ks = new DESedeKeySpec(arrayBytes);
		skf = SecretKeyFactory.getInstance(myEncryptionScheme);
		cipher = Cipher.getInstance(myEncryptionScheme);
		key = skf.generateSecret(ks);
	}

	/**
	 * Encrypts the String text
	 * @param unencryptedString
	 * @return
	 */
	public static String encrypt(String unencryptedString) {
		String encryptedString = null;
		try {
			cipher.init(Cipher.ENCRYPT_MODE, key);
			byte[] plainText = unencryptedString.getBytes(UNICODE_FORMAT);
			byte[] encryptedText = cipher.doFinal(plainText);
			encryptedString = new String(Base64.encodeBase64(encryptedText));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return encryptedString;
	}

	/**
	 * Decrypts the String
	 * @param encryptedString
	 * @return
	 */
	public static String decrypt(String encryptedString) {
		String decryptedText = null;
		try {
			cipher.init(Cipher.DECRYPT_MODE, key);
			byte[] encryptedText = Base64.decodeBase64(encryptedString);
			byte[] plainText = cipher.doFinal(encryptedText);
			decryptedText = new String(plainText);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return decryptedText;
	}
}
