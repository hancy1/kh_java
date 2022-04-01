package com.uni.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.uni.model.vo.User;

/**
 * Servlet implementation class JqAjaxServlet4
 */
@WebServlet("/jqTest4.do")
public class JqAjaxServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JqAjaxServlet4() {
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
		
		int input = Integer.parseInt(request.getParameter("input"));
		//https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple/1.1.1 '번들 다운로드하고 lib폴더에 붙여넣기'
		
		User findUser = null;
		JSONObject jsonUser = null;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getNo() == input) {
				findUser = list.get(i);
				
				jsonUser = new JSONObject();
				jsonUser.put("no", findUser.getNo());
				jsonUser.put("name", findUser.getName());
				jsonUser.put("age", findUser.getAge());
				jsonUser.put("gender", findUser.getGender()+""); //char는 json에서 사용할 수 없어서 ""를 붙여 스트링형으로 바꿈
			}
		}
		//문자타입과 인코딩을 전달해줘야한다.
		response.setContentType("application/json; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		System.out.println("jsonUser : " + jsonUser);
		//System.out.println("jsonUser.toJSONString() : " + jsonUser.toJSONString()); //null값이면 에러발생
		//System.out.println("jsonUser.toString() : " + jsonUser.toString());
		
		out.print(jsonUser);
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
