package com.project.registration;

public class Select {

	public static void main(String[] args) {
		RegistrationDAO regDAO = DAOFactory.getRegisterDAO();
		
		Registration reg1=regDAO.getCustomerByCid(1);
		System.out.print(reg1);
	}
}