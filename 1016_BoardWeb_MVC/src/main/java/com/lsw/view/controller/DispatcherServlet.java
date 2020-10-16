package com.lsw.view.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherServlet
 */
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HandlerMapping handlerMapping;
	private ViewResolver viewResolver;

	public void init() throws ServletException {
		handlerMapping = new HandlerMapping();
		viewResolver = new ViewResolver();
		viewResolver.setPrefix("./");
		viewResolver.setSuffix(".jsp");
	}

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

		// 1. Ŭ���̾�Ʈ�� ��û path ������ ����
		String uri = request.getRequestURI();				//"http://localhost:~~/~~.do"
		String path = uri.substring(uri.lastIndexOf("/"));	// "/~~.do"
		System.out.println(path);

		// 2. HandlerMapping�� ���� path�� �ش��ϴ� Controller �˻�
		Controller ctrl = handlerMapping.getController(path);

		// 3. �˻��� Controller�� ����
		String viewName = ctrl.handleRequest(request, response);

		// 4. viewResolver�� ���� viewName�� �ش��ϴ� ȭ���� �˻�
		String view = null;
		if (!viewName.contains(".do")) {
			view = viewResolver.getView(viewName);	//���ϸ��� ��� "./���ϸ�.jsp"
		} else {
			view = viewName; //���ϸ��� �ƴ� ~~.do �� ��� "~~~.do"
		}
		
		//5. �˻��� ȭ������ �̵�
		response.sendRedirect(view);
		//���ϸ��� ��� �ش� �������� �̵�. ~~ do�� ��� �ٽ� ��û..
	}
}