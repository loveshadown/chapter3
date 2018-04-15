package org.smart4j.chapter3;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet{
	/**
	 * @author chenkang
	 * 关于序列化
	 * 1.如果某个类能够被序列化，其子类也可以被序列化;
	 * 2.对象的序列化就是可以将对象序列化之后便于在网络上传输，
	 * 或者保存到物理介质上；比方说你做了个游戏，你玩了一半你想存盘，那么存盘，
	 * 就可以简单理解为将当前游戏运行的所有对象序列化保存到硬盘上，然后你再次玩的时候，
	 * 你读取存档，就是反序列化，“再弄出这些对象出来”，继续运行;
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * 1.继承httpservlet类，让它成为一个Servlet类
	 * 2.覆盖父类的doGet方法，用于接受get请求
	 * 3.获取当前系统时间并放在HttpServletRequest对象中，最后转发到页面
	 */
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)
	throws ServletException,IOException{
		System.out.println("11111111111111");
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		String currentTime = dateFormat.format(new Date());
		req.setAttribute("currentTime", currentTime);
		req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req, resp);
	}
}
