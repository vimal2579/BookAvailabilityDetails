package com.phoenix.servlets;

import com.phoenix.services.GetBookService;
import com.phoenix.models.GetBookAuthor;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

/**
 * Servlet implementation class GetBooks
 */
@WebServlet("/getBooks")
public class GetBooks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetBooks() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String bookAuthor = request.getParameter("Author");
		GetBookService bookService = new GetBookService();
		
		GetBookAuthor ba = GetBookAuthor.valueOf(bookAuthor);
		List<String> bookAuthors = bookService.getAvailableBooks(ba);
		request.setAttribute("author", bookAuthor);
        request.setAttribute("books", bookAuthors);
		
		RequestDispatcher view = request.getRequestDispatcher("/viewbookdetails.jsp");
        view.forward(request, response);
	}

}
