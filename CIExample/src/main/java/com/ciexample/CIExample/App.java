package com.ciexample.CIExample;

/**
 * Hello world!
 *
 */
public class App 
{
    public String sayHello()
    {
    	return "Hello";
    }
    public String sayHello(String name)
    {
    	if(name==null)
    		return "Hello";
    	return "Hello"+ name;
    }
}
