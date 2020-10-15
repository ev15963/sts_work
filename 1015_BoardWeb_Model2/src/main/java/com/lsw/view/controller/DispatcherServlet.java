package com.lsw.view.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lsw.biz.user.UserVO;
import com.lsw.biz.user.impl.UserDAO;

/**
 * Servlet implementation class DispatcherServlet
 */
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DispatcherServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//1. 클라이언트의 요청 path 정보를 추출
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"));
		System.out.println(path);
		
		//2. 클라이언트의 요청 path에 따라 적절히 분기처리 한다.
		if(path.equals("/login.do")) {
			System.out.println("로그인처리");
			//1. 사용자 입력 정보 호출
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			
			//2. DB 연동 처리
			UserVO vo = new UserVO();
			vo.setId(id);
			vo.setPassword(password);
			
			UserDAO userDAO = new UserDAO();
			UserVO user = userDAO.getUser(vo);
			
			//3. 화면 네비게이션
			if(user != null) {
				response.sendRedirect("getBoardList.jsp");
			} else {
				response.sendRedirect("login.jsp");
			}
		} else if(path.equals("/logout.do")) {
			System.out.println("로그아웃처리");
		} else if(path.equals("/loginBoard.do")) {
			System.out.println("글등록처리");
		} else if(path.equals("/updateBoard.do")) {
			System.out.println("글수정처리");
		} else if(path.equals("/deleteBoard.do")) {
			System.out.println("글삭제처리");
		} else if(path.equals("/getBoard.do")) {
			System.out.println("글상세조회처리");
		} else if(path.equals("/getBoardList.do")) {
			System.out.println("글목록검색처리");
		}
	}
}
