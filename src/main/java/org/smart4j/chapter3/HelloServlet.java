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
	 * 鍏充簬搴忓垪鍖�
	 * 1.濡傛灉鏌愪釜绫昏兘澶熻搴忓垪鍖栵紝鍏跺瓙绫讳篃鍙互琚簭鍒楀寲;
	 * 2.瀵硅薄鐨勫簭鍒楀寲灏辨槸鍙互灏嗗璞″簭鍒楀寲涔嬪悗渚夸簬鍦ㄧ綉缁滀笂浼犺緭锛�
	 * 鎴栬�呬繚瀛樺埌鐗╃悊浠嬭川涓婏紱姣旀柟璇翠綘鍋氫簡涓父鎴忥紝浣犵帺浜嗕竴鍗婁綘鎯冲瓨鐩橈紝閭ｄ箞瀛樼洏锛�
	 * 灏卞彲浠ョ畝鍗曠悊瑙ｄ负灏嗗綋鍓嶆父鎴忚繍琛岀殑鎵�鏈夊璞″簭鍒楀寲淇濆瓨鍒扮‖鐩樹笂锛岀劧鍚庝綘鍐嶆鐜╃殑鏃跺�欙紝
	 * 浣犺鍙栧瓨妗ｏ紝灏辨槸鍙嶅簭鍒楀寲锛屸�滃啀寮勫嚭杩欎簺瀵硅薄鍑烘潵鈥濓紝缁х画杩愯;
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * 1.缁ф壙httpservlet绫伙紝璁╁畠鎴愪负涓�涓猄ervlet绫�
	 * 2.瑕嗙洊鐖剁被鐨刣oGet鏂规硶锛岀敤浜庢帴鍙梘et璇锋眰
	 * 3.鑾峰彇褰撳墠绯荤粺鏃堕棿骞舵斁鍦℉ttpServletRequest瀵硅薄涓紝鏈�鍚庤浆鍙戝埌椤甸潰
	 * 4.
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
