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
import model.dto.CategoryDto;
import model.dto.CreateNewsDto;
import model.dto.NewsDto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;

/**
 * Servlet implementation class createNewsController
 */
public class createNewsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public createNewsController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/Views/Pages/createNews.jsp");
		try {			
			CategoryBO categoryBO = new CategoryBO();
			ArrayList<Category> listCategories = categoryBO.getAllCategories();
			ArrayList<CategoryDto> listCategoriesDto = new ArrayList<CategoryDto>();
			for (Category category :listCategories)
	        {
				CategoryDto categoryDto = AutoMapperEntityToDto.MapperCategories(category);
				listCategoriesDto.add(categoryDto);
	        }
			request.setAttribute("listCategoriesDto", listCategoriesDto);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.print(request.getParameter("test"));
		int categoryId = Integer.parseInt(request.getParameter("category"));
		String title = request.getParameter("newsTitle");
		String slug = request.getParameter("newsSlug");
		String writer = request.getParameter("writer");
		String thumb = request.getParameter("thumbNews").split(",")[1];
		byte[] thumbConvert = Base64.getDecoder().decode(new String(thumb).getBytes("UTF-8"));
		String cover = request.getParameter("coverNews").split(",")[1];
		byte[] coverConvert = Base64.getDecoder().decode(new String(cover).getBytes("UTF-8"));
		String overviewContent = request.getParameter("overviewContent");
		String content = request.getParameter("content");
		System.out.print(coverConvert);
		
		boolean isActive = Boolean.parseBoolean(request.getParameter("isActive"));
		
		NewsBO newsBO = new NewsBO();
		CreateNewsDto createNewsDto = new CreateNewsDto(categoryId, slug, title, writer, thumbConvert, coverConvert, overviewContent, content, isActive);
		//News news = AutoMapperEntityToDto.MapperCreateNews(createNewsDto);
		News news = new News(categoryId, slug, title, writer, thumbConvert, coverConvert, overviewContent, content, isActive);
		try {
			newsBO.createNews(news);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e);
		}
		//RequestDispatcher rd = getServletContext().getRequestDispatcher("/Views/Pages/DashBoard.jsp");
		//rd.forward(request, response); 
	}

}
