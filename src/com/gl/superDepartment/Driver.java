package com.gl.superDepartment;
import java.util.Scanner;

import com.gl.AdminDepartment.Admin;
import com.gl.HrDepartment.HrDepartment;
import com.gl.TechDepartment.TechDepartment;
public class Driver {

	public static void main(String[] args) {
		
		Admin ad1=new Admin();
		 System.out.println(ad1.departmentName());
		 System.out.println(ad1.getTodaysWork());
		 System.out.println(ad1.getWorkDeadline());
		 System.out.println(ad1.isTodayAHoliday());
		 System.out.println("==========================================================================");
		 
		 
		 HrDepartment hr=new HrDepartment();
		 System.out.println(hr.departmentName());
		 System.out.println(hr.doActivity());
		 System.out.println(hr.getTodaysWork());
		 System.out.println(hr.getWorkDeadline());
		 System.out.println(hr.isTodayAHoliday()); 
		 System.out.println("==========================================================================");
		 
		 
		 
		TechDepartment tech=new TechDepartment();
		 System.out.println(tech.departmentName());
		 System.out.println(tech.getTodaysWork());
		 System.out.println(tech.getWorkDeadline());
		 System.out.println(tech.getTechStackInformation());
		 System.out.println(tech.isTodayAHoliday());
		
//		System.out.println("Enter any Department from the following");
//		System.out.println("1. Admin Deaprtment");
//		System.out.println("2. Hr Department");
//		System.out.println("3. Tech Department");
//		Scanner sc=new Scanner(System.in);
//		int No=sc.nextInt();
		
		

		
		
		
		
	}
}
