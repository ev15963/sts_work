package com.lsw.view.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lsw.biz.board.BoardVO;
import com.lsw.biz.board.impl.BoardDAO;
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 1. 클라이언트의 요청 path 정보를 추출
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"));
		System.out.println(path);

		// 2. 클라이언트의 요청 path에 따라 적절히 분기처리 한다.
		if (path.equals("/login.do")) {
			System.out.println("로그인처리");
			
			
			// 1. 사용자 입력 정보 호출
			String id = request.getParameter("id");
			String password = request.getParameter("password");

			// 2. DB 연동 처리
			UserVO vo = new UserVO();
			vo.setId(id);
			vo.setPassword(password);

			UserDAO userDAO = new UserDAO();
			UserVO user = userDAO.getUser(vo);

			// 3. 화면 네비게이션
			if (user != null) {
				response.sendRedirect("getBoardList.do"); //getBoardList.jsp -> getBoardList.do
			} else {
				response.sendRedirect("login.jsp");
			}
		} else if (path.equals("/logout.do")) {
			System.out.println("로그아웃처리");
			
			
			//logout_proc.jsp
			//1. 브라우져와 연결된 세션 객체를 강제 종료 한다.
			HttpSession session = request.getSession();
			session.invalidate();

			//2. 세션 종료후, 메인 화면으로 이동한다.
			response.sendRedirect("login.jsp");
			
			
			
		} else if (path.equals("/insertBoard.do")) { // loginBoard.do -> insertBoard.do
			System.out.println("글등록처리");
			
			//글 등록 기능 구현
			
			//insertBoard_proc.jsp
			
			//1. 사용자 입력 정보 추출
			request.setCharacterEncoding("UTF-8");
			String title=request.getParameter("title");
			String writer=request.getParameter("writer");
			String content=request.getParameter("content");

			//2. DB 연동 처리
			BoardVO vo = new BoardVO();
			vo.setTitle(title);
			vo.setWriter(writer);
			vo.setContent(content);

			BoardDAO bDAO = new BoardDAO();
			bDAO.insertBoard(vo);

			//3. 화면 네비게이션
			response.sendRedirect("getBoardList.do"); //getBoardList.jsp -> getBoardList.do
			
		} else if (path.equals("/updateBoard.do")) {
			System.out.println("글수정처리");
			
			//updateBoard_proc.jsp
			//1. 사용자 입력 정보 추출
			request.setCharacterEncoding("UTF-8");
			String title = request.getParameter("title");
			//작성자 고정
			String content = request.getParameter("content");
			String seq = request.getParameter("seq");
			
			//2. DB 연동 처리
			BoardVO vo = new BoardVO();
			vo.setTitle(title);
			vo.setContent(content);
			vo.setSeq(Integer.parseInt(seq));
			
			BoardDAO boardDAO = new BoardDAO();
			boardDAO.updateBoard(vo);
			
			//3. 화면 네이게이션
			response.sendRedirect("getBoardList.do"); //getBoardList.jsp -> getBoardList.do
			
		} else if (path.equals("/deleteBoard.do")) {
			System.out.println("글삭제처리");
			
			//deleteBoard_proc.jsp
			
			//1. 사용자 입력 정보 추출
			String seq = request.getParameter("seq");


			//2. DB 연동 처리
			BoardVO vo = new BoardVO();
			vo.setSeq(Integer.parseInt(seq));

			BoardDAO boardDAO = new BoardDAO();
			boardDAO.deleteBoard(vo);

			//3. 화면 네비게이션
			response.sendRedirect("getBoardList.do"); //getBoardList.jsp -> getBoardList.do
			
		} else if (path.equals("/getBoard.do")) {
			System.out.println("글상세조회처리");
			
			//getBoard.jsp 내용 가져오기
			
			//1. 검색할 게시글 번호 추출
			String seq = request.getParameter("seq");
//		 	System.out.print(seq);

			//2. DB 연동 처리
			BoardVO vo = new BoardVO();
			vo.setSeq(Integer.parseInt(seq));

			BoardDAO bDAO = new BoardDAO();
			BoardVO board = bDAO.getBoard(vo);
			
			//3. 검색결과 세션에 저장하고 상세 화면으로 이동
			HttpSession session = request.getSession();
			session.setAttribute("board", board);
			response.sendRedirect("getBoard.jsp");
			
			
		} else if (path.equals("/getBoardList.do")) {
			System.out.println("글목록검색처리");
			
			//1. 사용자 입력 정보 추출(검색기능은 나중에 구현)
			//2. DB 연동 처리
			BoardVO vo = new BoardVO();
			BoardDAO boardDAO = new BoardDAO();
			List<BoardVO> boardList = boardDAO.getBoardList(vo);

			//3. 검색결과를 세션에 저장하고 목록 화면으로 이동
			HttpSession session = request.getSession();
			session.setAttribute("boardList", boardList);
			response.sendRedirect("getBoardList.jsp");
		}
	}
}
