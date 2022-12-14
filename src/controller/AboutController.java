package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.bean.About;
import model.bean.Member;
import model.bo.AboutBO;
import model.bo.MemberBO;

import java.io.IOException;
import java.util.ArrayList;

public class AboutController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AboutBO aboutBO = new AboutBO();
		About about = aboutBO.getAbout();
		request.setAttribute("about", about);
		MemberBO memberBO = new MemberBO();
		ArrayList<Member> listMembers = memberBO.getAllMember();
		request.setAttribute("listMembers", listMembers);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/Views/Pages/About.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
