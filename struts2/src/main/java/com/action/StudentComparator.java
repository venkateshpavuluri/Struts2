/**
 * 
 */
package com.action;

import java.util.Comparator;

/**
 * @author venkateshp
 *
 */
public class StudentComparator implements Comparator {

/*	public int compare(Student student,Student student2) {
		// TODO Auto-generated method stub
		return student.getName().compareTo(student2.getName());
	}*/

	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student student=(Student)o1;
		Student student1=(Student)o2;
		return student.getRollNo().compareTo(student1.getRollNo());
	}

}
