package com.kx.serlvet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet",urlPatterns = "/ajax")
public class AjaxServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        // ����id��Ӧ����
        PrintWriter out = response.getWriter();
        if("0".equals(id)){
            out.write("[{\"name\":\"��ѡ�����\"}]");
        }else if("1".equals(id)){
            out.write("[{\"name\":\"����\"},{\"name\":\"����\"},{\"name\":\"��ݸ\"}]");
        }else{
            out.write("[{\"name\":\"����\"},{\"name\":\"����\"},{\"name\":\"Ȫ��\"}]");
        }
        out.flush();
        out.close();
    }
}
