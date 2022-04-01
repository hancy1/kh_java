package com.uni.ajax;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.uni.model.vo.User;

/**
 * Servlet implementation class JqAjaxServlet7
 */
@WebServlet("/jqTest7.do")
public class JqAjaxServlet7 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JqAjaxServlet7() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<User> list = new ArrayList<>();
		
		list.add(new User(1, "유재석", 20, '남'));
		list.add(new User(2, "한지민", 30, '여'));
		list.add(new User(3, "배수지", 12, '여'));
		list.add(new User(4, "송지효", 25, '여'));
		list.add(new User(5, "김종국", 50, '남'));
		
		//https://mvnrepository.com/artifact/com.google.code.gson/gson/2.8.5 gson사용 위해 jar다운
		
		response.setContentType("application/json; charset=UTF-8");
		//가져갈 값과 스트림 작성
		new Gson().toJson(list, response.getWriter());
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
