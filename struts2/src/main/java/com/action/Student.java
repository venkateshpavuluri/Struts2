/**
 * 
 */
package com.action;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.util.SubsetIteratorFilter.Decider;

import com.opensymphony.xwork2.ActionSupport;
/**
 * @author venkateshp
 *
 */
public class Student extends ActionSupport {
	private String name;
	private String rollNo;
	public List students;
	public List<String> studentNames;
	public List<Student> listOfstudents;
	
	/**
	 * @return the students
	 */
	public List getStudents() {
		return students;
	}
	/**
	 * @param students the students to set
	 */
	public void setStudents(List students) {
		this.students = students;
	}
	private int count=0;
public	Student()
	{
		
	}
	Student(String name,String rollNo)
	{
		this.name=name;
		this.rollNo=rollNo;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the rollNo
	 */
	public String getRollNo() {
		return rollNo;
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
public String execute()
{
	students=new ArrayList();
	studentNames=new ArrayList<String>();
	listOfstudents=new ArrayList<Student>();
	students.add(new Student("Venky","59"));
	students.add(new Student("Nani","29"));
	students.add(new Student("Ravi","39"));
	students.add(new Student("pallavi","69"));
	studentNames.add("Venky");
	studentNames.add("Nani");
	listOfstudents.add(new Student("Gouthami","90"));
	listOfstudents.add(new Student("Sapthami","80"));
	return SUCCESS;
}
public Decider getStudentsDecider()
{
	return new Decider()
	{
	
		  public boolean decide(Object element) throws Exception {
			  System.out.println("venky");
	            Student employee = (Student)element;
	            return employee.getName().equals("Venky");
	         }
	};
}
}

	


