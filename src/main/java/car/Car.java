package car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

public class Car extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	String carName=req.getParameter("carName");
	
	PrintWriter printWriter=res.getWriter();
	printWriter.print("Yes your car Name is :::"+carName);
		
	}

}
