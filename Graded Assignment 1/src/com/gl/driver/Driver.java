package com.gl.driver;

import com.gl.departmentservice.AdminDepartment;
import com.gl.departmentservice.HRDepartment;
import com.gl.departmentservice.SuperDepartment;
import com.gl.departmentservice.TechDepartment;

public class Driver 
{
   public static void main(String[] args) 
   
	   {
	  
	   AdminDepartment am=new AdminDepartment();
	   
	   System.out.println(am.departmentName());
	   System.out.println(am.getTodayWork());
	   System.out.println(am.getWorkdeadLine());
	   System.out.println(am.isTodayAholiday());
	   
	   TechDepartment  tech=new TechDepartment ();
	   
	   System.out.println(tech.getTodayWork());
	   System.out.println(tech.getWorkdeadLine());
	  // System.out.println(tech.completedbyEod());
	   System.out.println(tech.isTodayAholiday());
	   
	   
	   HRDepartment hr=new HRDepartment ();
	   
	  //System.out.println(hr.HrDepartMent());
	  System.out.println(hr.departmentName());
	  System.out.println(hr.isTodayAholiday());
	  //System.out.println(hr.team Lunch());
	   }

	   }
	   

