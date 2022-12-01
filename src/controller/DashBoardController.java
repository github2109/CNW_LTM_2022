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
import model.dto.AutoMapperEntityToDto;
import model.dto.NewsDto;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Servlet implementation class DashBoardController
 */
public class DashBoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NewsBO newsBO = new NewsBO();
        ArrayList<News> newsArrayList = newsBO.getAllNews();
        ArrayList<NewsDto> newDtoList = new ArrayList<NewsDto>();
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/Views/Pages/DashBoard.jsp");
        for (News news :newsArrayList)
        {
        	NewsDto newsDto = AutoMapperEntityToDto.MapperNews(news);
        	newDtoList.add(newsDto);
        }
        CategoryBO categoryBO = new CategoryBO();
        try {
        	request.setAttribute("newDtoList", newDtoList);
			ArrayList<Category> listCategories = categoryBO.getAllCategories();
			request.setAttribute("listCategories", listCategories);
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
