package com.kx.serlvet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet2", urlPatterns = "/cookie")
public class CookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");//通知浏览器以何种码表打开
//        String name = request.getParameter("userName"); 如果这个会出现乱码 就用下面的
        //
        String name = new String(request.getParameter("userName").getBytes("ISO-8859-1"),"UTF-8");
        System.out.println("参数："+name);
        String codeName = java.net.URLEncoder.encode(name, "utf-8");
        System.out.println("编码后："+codeName);
        System.out.println("==============");
        System.out.println("解码后："+ java.net.URLDecoder.decode(codeName));
        String password = request.getParameter("password");
        Cookie cookie = new Cookie("userName", codeName);
        cookie.setMaxAge(60 * 60 * 24 * 365 * 10);
        cookie.setPath("/");
        response.addCookie(cookie);

        Cookie cookie1 = new Cookie("password", password);
        cookie1.setMaxAge(60 * 60 * 24 * 365 * 10);
        cookie1.setPath("/");
        response.addCookie(cookie1);
        System.out.println("doget");
        request.getRequestDispatcher("/cookie.jsp").forward(request, response);
    }
}
