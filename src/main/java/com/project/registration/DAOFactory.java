package com.project.registration;

public class DAOFactory {
	static RegistrationDAO registerDAO; 
	static { 
	 registerDAO =new RegistrationDAOImpl(); 
	} 
	public static RegistrationDAO getRegisterDAO() { 
	 return registerDAO; 
	}

}
