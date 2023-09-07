package com.utils;

import java.nio.charset.StandardCharsets;

import org.apache.commons.codec.binary.Base64;

public class EncryptionUtils {

	public EncryptionUtils() {

		throw new IllegalStateException("Encryption Utility Class");
	}

	public String encode(String str) {
		
		byte[] encoded = Base64.encodeBase64(str.getBytes());
		
		return new String(encoded);
		
	}
	
	public static String decode(String str) {
		
		byte[] decoded=Base64.decodeBase64(str.getBytes());
		String s = new String(decoded, StandardCharsets.UTF_8);
		return s;
		
	}
	
}
