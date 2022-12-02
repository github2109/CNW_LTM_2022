package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.bean.Category;
import model.bean.News;
import model.bo.CategoryBO;
import model.bo.NewsBO;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.sql.SQLException;
import java.util.ArrayList;



public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/Views/Pages/Home.jsp");
        //byte[] fileContent = Files.readAllBytes(fi.toPath());
        NewsBO newsBO = new NewsBO();
        CategoryBO categoryBO = new CategoryBO();
        try {
			ArrayList<Category> listCategories = categoryBO.getAllCategories();
			request.setAttribute("listCategories", listCategories);
			for(int i = 0;i<listCategories.size();i++) {
				request.setAttribute("listNewsMostRecentByCategoryId="+listCategories.get(i).getCategoryId(), newsBO.getNewsMostRecentByCategoryId(listCategories.get(i).getCategoryId()));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rd.forward(request, response); 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
