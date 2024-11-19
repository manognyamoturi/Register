package com.project.registration;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Update {

	public static void main(String[] args) {
		RegistrationDAO regDAO = DAOFactory.getRegisterDAO();

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

		try {

			Date dob = formatter.parse("2002-10-25");

			Registration reg = new Registration(2, "manu", "manu@mail.com", dob, 99999L);
			regDAO.updateCustomer(reg);

			System.out.println("Updation successful!");

		} catch (ParseException e) {
			System.err.println("Invalid date format. Please use yyyy-MM-dd.");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("An error occurred during registration.");
			e.printStackTrace();
		}
	}
}