package com.xmg;

public interface EncryptUtilApi {

	//------MD5-------//
    String MD5(String res);//要加密的字符串
    String MD5(String res,String key);//要加密的字符串和密码
 
    //------SHA1-------//
    String SHA1(String res);//要加密的字符串
    String SHA1(String res,String key);//要加密的字符串和密码
    
    //=====上面的没有解码方法====================================
    
    //------DES-------//
    String DESencode(String res,String key);//加密：要加密的字符串和密码
    String DESdecode(String res,String key);//解密：加密后的字符串和密码
 
    //------AES-------//
    String AESencode(String res,String key);//加密：要加密的字符串和密码
    String AESdecode(String res,String key);//解密：加密后的字符串和密码
     
    //------异或加密-----//
    String XORencode(String res,String key);//加密：要加密的字符串和密码
    String XORdecode(String res,String key);//解密：加密后的字符串和密码
    int XOR(int res,String key);//执行一次：加密：要加密的字符串和密码  ； 再执行一次：解密：加密后的字符串和密码
    
    //------Base64-----//
    String Base64Encode(String res);//加密：要加密的字符串
    String Base64Decode(String res);//解密：加密后的字符串
}
