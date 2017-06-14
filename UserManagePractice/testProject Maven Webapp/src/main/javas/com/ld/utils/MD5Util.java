package com.ld.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.bouncycastle.util.encoders.Hex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MD5Util {
	private static final Logger logger = LoggerFactory.getLogger(MD5Util.class);
	
	public static String getMD5(String origin){
		try{
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			byte[] MD5Bytes = messageDigest.digest(origin.getBytes());
			String str = Hex.toHexString(MD5Bytes);
			return str;
		}
		catch(NoSuchAlgorithmException e){
			logger.info("MD5Util-getMD5",e);
		}
		return null;
	}
}
