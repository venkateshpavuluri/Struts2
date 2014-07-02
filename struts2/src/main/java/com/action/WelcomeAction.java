/**
 * 
 */
package com.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author venkateshp
 *
 */
public class WelcomeAction extends ActionSupport {
	private String username;
	private String password;
	
	List<Student> list=new ArrayList<Student>();
	
	

	/**
	 * @return the list
	 */
	public List<Student> getList() {
		return list;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(List<Student> list) {
		this.list = list;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute()
	{
	Student student=new Student();
	student.setName("Venky");
	student.setRollNo("890");
	Student student1=new Student();
	student1.setName("Venky");
	student1.setRollNo("890");
	list.add(student);
	list.add(student1);
		return SUCCESS;
	}
	
	public WelcomeAction()
	{
		
	}
	public String display()
	{
		return NONE;
	}
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");  
		sb.substring(1,4); 
		System.out.println(sb.substring(1,4) );//prints HJavalo 
	}

}
