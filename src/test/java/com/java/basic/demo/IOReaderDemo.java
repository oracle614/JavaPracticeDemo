package com.java.basic.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *
 * @ClassName:Demo9.java
 * @author   : Administrator
 * @date     : 2019年3月25日 下午4:29:47
 * 
 */
public class IOReaderDemo {

public static void main(String [] args){


	String code="123456";
	try{
	File file = new File("D:\\citycode.csv");
	if (!file.exists())
	{ 
	file.createNewFile();
	}  
	BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath()), "UTF-8"));
	String str="";
	boolean isExist=false; 
	while ((str=bufferedReader.readLine())!=null)
	{ 
	if (str.trim().equals(code))
	{
	isExist=true;
	break;
	}
	}
	bufferedReader.close(); 
	if (!isExist)
	{
	FileOutputStream fos = new FileOutputStream(file.getAbsoluteFile(),false);//true表示在文件末尾追加
	       fos.write(code.getBytes());  
	       fos.write("\n".getBytes());  
	       fos.close();
	}
	}
	catch(IOException e)
	{
	e.printStackTrace();
	}
}

}
