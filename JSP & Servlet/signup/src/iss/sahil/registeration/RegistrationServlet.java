package iss.sahil.registeration;

import java.io.*;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/registration")//same as action of registeration jsp form 
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//to get details entered by user check for name of tags in the registeration.jsp file
		String uname=request.getParameter("name");
		String uemail=request.getParameter("email");
		String upwd=request.getParameter("pass");
		String umob=request.getParameter("contact");
		RequestDispatcher dispatcher=null;
		Connection con=null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
			PreparedStatement pst=con.prepareStatement("Insert into users(uname,upwd,uemail,umob) values(?,?,?,?)");
			pst.setString(1,uname);
			pst.setString(2,upwd);
			pst.setString(3,uemail);
			pst.setString(4,umob);
			
			int rowCount=pst.executeUpdate();
			dispatcher=request.getRequestDispatcher("registration.jsp");
			if(rowCount>0)
			{
				request.setAttribute("status","success");
			
			}
			else{
				request.setAttribute("status","not succesfull");
				
			}
			dispatcher.forward(request,response);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
			con.close();
			}
			catch (Exception e){
				e.printStackTrace();
			}
		}
	}

}
