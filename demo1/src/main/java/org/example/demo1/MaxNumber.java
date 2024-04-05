package org.example.demo1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MaxNumber", value = "/Max-Number")
public class MaxNumber extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int num3 = Integer.parseInt(request.getParameter("num3"));
        String action = request.getParameter("action");

        int result = 0;
        String actionName = "";
        if (action.equals("max")) {
            result = Math.max(num1, Math.max(num2, num3));
            actionName = "Максимум";
        } else if (action.equals("min")) {
            result = Math.min(num1, Math.min(num2, num3));
            actionName = "Минимум";
        } else if (action.equals("average")) {
            result = (num1 + num2 + num3) / 3;
            actionName = "Среднее арифметическое";
        }
        out.println("<html><body>");
        out.println("<h1>" + actionName + "</h1>");
        out.println("<p>Число 1: " + num1 + "</p>");
        out.println("<p>Число 2: " + num2 + "</p>");
        out.println("<p>Число 3: " + num3 + "</p>");
        out.println("<p>Результат: " + result + "</p>");
        out.println("</body></html>");
    }
    public void destroy() {
    }
}
