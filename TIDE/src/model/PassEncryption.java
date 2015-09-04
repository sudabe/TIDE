package model;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PassEncryption {
	
	public static String hashPass(String password) throws NoSuchAlgorithmException{
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(password.getBytes());
		byte[] b =md.digest();
		StringBuffer sb = new StringBuffer();
		for(byte b1 : b){
			sb.append(Integer.toHexString(b1 & 0xff).toString());
		}
		
		//System.out.println(sb.toString());
		return sb.toString();
		
	}
	
	/*public static void main(String[] args){
		String password = "admin";
		System.out.println(password);
		//System.out.println("4a9bd883fd4555afdeb9234d4ea5f261");
		try{
		System.out.println(hashPass(password));
		}
		catch(NoSuchAlgorithmException e){};
		
	}*/

}
