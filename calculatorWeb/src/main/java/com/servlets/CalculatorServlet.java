package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.tempuri.Calculator;

import com.operations.CalculatorModel;

/**
 * Servlet implementation class calculatorServlet
 */
@WebServlet(name = "calculateServlet", urlPatterns = { "/calculateServlet" })
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final CalculatorModel calculatorModel = new CalculatorModel(new Calculator().getCalculatorSoap12());
    private static final Logger _logger = LogManager.getLogger(CalculatorServlet.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorServlet() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
		
		PrintWriter out = response.getWriter();
	
		
		Integer number1 = Integer.parseInt(request.getParameter("number1"));
		Integer number2 = Integer.parseInt(request.getParameter("number2"));
		String operation = request.getParameter("operation");
		
		_logger.debug("Number 1 = " + number1 + " Number 2 = " + number2 + " Operation = " + operation);
		if(number1 == null || number2 == null || operation == null )
		{
			out.println("You forgot to enter a number or select an operation");
			_logger.debug("You forgot to enter a number or select an operation");
		}
		else if (operation == "Divide" && number2 == 0)  
		{
			out.print("Tanýmsýz");
			_logger.debug("0 ' a bölünemez !");
		}
		else 
		{
			out.print("Result = " + calculatorModel.calculate(operation, number1, number2));
			_logger.debug("Result = " + calculatorModel.calculate(operation, number1, number2));
			
		}
		_logger.debug("Hesaplama tamamlandý");
		
		
		}
		catch (Exception e) {
			_logger.error(e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doGet(request, response);
		} catch (Exception e) {
			 e.getMessage();
		}
		
	}

}
