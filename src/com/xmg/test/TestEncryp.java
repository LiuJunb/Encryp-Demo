package com.xmg.test;

import com.xmg.Base64;
import com.xmg.EncryptUtil;

public class TestEncryp {

	public static void main(String[] args) {
		
			String res = "测试test";
        	String key = "秘钥key";
        	String mw = "密文，临时用的";
        	
        	String version="030102";
        	String time="1469870194781";
        	String method="loadProductHome";
        	String des="829e5d33183ec0392e0561895bc4b8ba";
        	
        	
//	        System.out.println("--SHA1--");
//	        System.out.println(EncryptUtil.getInstance().MD5("18312016879"));
        	
//		  	String res = "测试test";
//	        String key = "秘钥key";
//	        String mw = "密文，临时用的";
        	
//	        System.out.println("--MD5--");
//	        System.out.println(EncryptUtil.getInstance().MD5(res));
//	        System.out.println(EncryptUtil.getInstance().MD5(res,key));
        	
//	        System.out.println("--SHA1--");
//	        System.out.println(EncryptUtil.getInstance().SHA1(res));
//	        System.out.println(EncryptUtil.getInstance().SHA1(res,key));
        	
//	        System.out.println("--DES--");
//	        mw = EncryptUtil.getInstance().DESencode(res,key);
//	        System.out.println(mw);
//	        System.out.println(EncryptUtil.getInstance().DESdecode(mw, key));
        	
//	        System.out.println("--AES--");
//	        mw = EncryptUtil.getInstance().AESencode(res,key);
//	        System.out.println(mw);
//	        System.out.println(EncryptUtil.getInstance().AESdecode(mw, key));
//	 
//	        System.out.println("--异或加密--");
//	        mw = EncryptUtil.getInstance().XORencode(res, key);
//	        System.out.println(mw);
//	        System.out.println(EncryptUtil.getInstance().XORdecode(mw, key));
        	
//	        int i = 12345;
//	        int ii = EncryptUtil.getInstance().XOR(i, key);//加密：要加密的字符串和密码
//	        int iii = EncryptUtil.getInstance().XOR(ii, key);//解密：加密后的字符窜和密码
//	        System.out.println(String.format(i+": i异或一次：%s；  ii异或两次：%s",ii,iii));
        	
//	        System.out.println("--Base64--");
//	        mw = EncryptUtil.getInstance().Base64Encode(res);
//	        System.out.println(mw);
//	        System.out.println(EncryptUtil.getInstance().Base64Decode(mw));
        	
	}

}
