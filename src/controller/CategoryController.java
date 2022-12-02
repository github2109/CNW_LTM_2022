package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.bean.Category;
import model.bo.CategoryBO;
import model.bo.NewsBO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class CategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NewsBO newsBO = new NewsBO();
        CategoryBO categoryBO = new CategoryBO();
        try {
			ArrayList<Category> listCategories = categoryBO.getAllCategories();
			request.setAttribute("listCategories", listCategories);
			for(int i = 0;i<listCategories.size();i++) {
				request.setAttribute("listNewsByCategoryId="+listCategories.get(i).getCategoryId(), newsBO.getNewsByCategoryId(listCategories.get(i).getCategoryId()));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/Views/Pages/Category.jsp");
		rd.forward(request, response); 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
