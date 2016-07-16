package com.flp.ems.dao;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.flp.ems.domain.Employee;
import com.flp.ems.service.EmployeeServiceImpl;

public class EmployeeDaoImplForList implements IemployeeDao{

	static ArrayList<Employee> arraylist=new ArrayList<Employee>();
	@Override
	public void AddEmployee(Employee e) {
		arraylist.add(e);
		
	}

	@Override
	public void ModifyEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RemoveEmployee() {
		int index=0;
		
		
		arraylist.remove(index);
	}

	@Override
	public void SearchEmployee(String search) {
		System.out.println("searching employee...");
		
		Employee emp=null;
		for(Employee e:arraylist){
			if(e.equals(search))
				emp=e;
			
		if(emp!=null)
		System.out.println(emp);
		}		}
	

	@Override
	public void getAllEmployee() {
		
	}
	
	
	
	}

