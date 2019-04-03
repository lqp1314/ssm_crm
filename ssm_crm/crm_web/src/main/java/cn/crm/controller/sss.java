package cn.crm.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class sss
 */
public class sss extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sss() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	  /*
	   * 返回用于发出此请求的方案的名称，例如http、https或ftp。不同的方案有不同的规则来构造url，
	   * 如RFC 1738中所述。
	   */
		request.getScheme(); //http  ftp  https 
		/*
		 * 返回发送请求的服务器的主机名。它是Hostheader值(如果有的话)中“:”
		 * 前面部分的值，或者解析后的服务器名称或服务器IPaddress的值。
		 * IP地址的主机名 或 域名
		 */
		request.getServerName();
		/*
		 * 返回发送请求的端口号。它是Hostheader值(如果有的话)中“:”后面部分的值，
		 * 或者客户机连接被接受的服务器端口的值。
		 */
        request.getServerPort();
        
        /*
         * 该应用服务器的名称
         */
        request.getContextPath();
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
