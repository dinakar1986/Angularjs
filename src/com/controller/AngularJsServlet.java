package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.rafi.db.Connector;

import com.google.gson.Gson;
import com.model.PersonData;

public class AngularJsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AngularJsServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PersonData personData = new PersonData('1', "Hello", "test");
		personData.setFirstName("Mohaideen");
		personData.setLastName("Jamil");

		String json = new Gson().toJson(personData);
		response.setContentType("application/json");
		response.getWriter().write(json);
		
		String gender = null;
		String phonenum = null;
		String password = null;
		String emaiId = null;
		String userName = null;
		try {
			Connector.insertUser(userName,password, emaiId,phonenum,gender);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
