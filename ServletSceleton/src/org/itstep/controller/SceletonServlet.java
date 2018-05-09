package org.itstep.controller;

import java.io.IOException;

import javax.jws.WebMethod;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.itstep.service.SceletonService;

/**
 * @author Alex Ignatenko
 */
@SuppressWarnings("serial")
@WebServlet("/reverse")
public class SceletonServlet extends HttpServlet {
	
	
	
	SceletonService serv = new SceletonService();
	/**
	 * method GET
	 * parameters required
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String text = request.getParameter("text");
		String reversedText = serv.reverseText(text);
		session.setAttribute("reversedText", reversedText);
		session.setAttribute("method", " - GET");
		response.sendRedirect("/ServletSceleton/jsp/redirect.jsp");
	}

	/**
	 * method POST
	 * parameters required
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String text = request.getParameter("text");
		String reversedText = serv.reverseText(text);
		session.setAttribute("reversedText", reversedText);
		session.setAttribute("method", " - POST");
		response.sendRedirect("/ServletSceleton/jsp/redirect.jsp");
	}

	/**
	 * method PUT
	 * parameters required
	 */
	@WebMethod(operationName = "/put")
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String text = request.getParameter("text");
		String reversedText = serv.reverseText(text);
		session.setAttribute("reversedText", reversedText);
		session.setAttribute("method", " - PUT");
		response.sendRedirect("/ServletSceleton/jsp/redirect.jsp");
	}

	/**
	 * method DELETE
	 * parameters required
	 */
	@WebMethod(operationName = "/delete")
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String text = request.getParameter("text");
		String reversedText = serv.reverseText(text);
		session.setAttribute("reversedText", reversedText);
		session.setAttribute("method", " - DELETE");
		response.sendRedirect("/ServletSceleton/jsp/redirect.jsp");
	}

}
