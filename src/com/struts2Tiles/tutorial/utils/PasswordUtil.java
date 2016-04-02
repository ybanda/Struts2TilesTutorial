package com.struts2Tiles.tutorial.utils;

import java.util.Random;

public class PasswordUtil {
	    private static final char[] symbols = new char[67]; 
	    private static final int length = 15;
	    static 
	    {      
	    	for (int i = 0; i < 10; ++i)
	    		symbols[i] = (char) ('0' + i);
	    	for (int i = 10; i < 36; ++i)
	    		symbols[i] = (char) ('a' + i - 10);
	    	for (int i = 36; i < 40; ++i)
	    		symbols[i] = (char) ('#' + i - 36);
	    	for (int i = 40; i < 67; ++i)
	    		symbols[i] = (char) ('@' + i - 40);
	    	
	    }      
	    private final Random random = new Random();      
	    private final char[] buf;      
	    public PasswordUtil()    
	    {      
	    	if (length < 1)        
	    		throw new IllegalArgumentException("length < 1: " + length);      
	    	buf = new char[length];    
	    }      
	    public String randomPassword()    
	    {      
	    	for (int i = 0; i < buf.length; ++i)         
	    		buf[i] = symbols[random.nextInt(symbols.length)];      
	    	
	    	return new String(buf);
	    	
	    }
	    public static void main(String[] args){
	    	String rand = null;
	    	PasswordUtil pu = new PasswordUtil();
	    	for(int i = 0;i<50;i++){
	    		rand = pu.randomPassword();
	    		System.out.println("Random Number : "+i+" : "+rand);
	    	}
	    }
	    
}