package com.xmg;

public interface EncryptUtilApi {

	//------MD5-------//
    String MD5(String res);//Ҫ���ܵ��ַ���
    String MD5(String res,String key);//Ҫ���ܵ��ַ���������
 
    //------SHA1-------//
    String SHA1(String res);//Ҫ���ܵ��ַ���
    String SHA1(String res,String key);//Ҫ���ܵ��ַ���������
    
    //=====�����û�н��뷽��====================================
    
    //------DES-------//
    String DESencode(String res,String key);//���ܣ�Ҫ���ܵ��ַ���������
    String DESdecode(String res,String key);//���ܣ����ܺ���ַ���������
 
    //------AES-------//
    String AESencode(String res,String key);//���ܣ�Ҫ���ܵ��ַ���������
    String AESdecode(String res,String key);//���ܣ����ܺ���ַ���������
     
    //------������-----//
    String XORencode(String res,String key);//���ܣ�Ҫ���ܵ��ַ���������
    String XORdecode(String res,String key);//���ܣ����ܺ���ַ���������
    int XOR(int res,String key);//ִ��һ�Σ����ܣ�Ҫ���ܵ��ַ���������  �� ��ִ��һ�Σ����ܣ����ܺ���ַ���������
    
    //------Base64-----//
    String Base64Encode(String res);//���ܣ�Ҫ���ܵ��ַ���
    String Base64Decode(String res);//���ܣ����ܺ���ַ���
}
