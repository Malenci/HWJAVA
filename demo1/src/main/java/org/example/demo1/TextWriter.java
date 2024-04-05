package org.example.demo1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TextWriter", value = "/TextWriter")
public class TextWriter extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String text = request.getParameter("text");
        PrintWriter out = response.getWriter();
        int vowelsCount = countVowels(text);
        String vowelsList = getVowelsList(text);
        int consonantsCount = countConsonants(text);
        String consonantsList = getConsonantsList(text);
        int punctuationCount = countPunctuation(text);
        String punctuationList = getPunctuationList(text);


        out.println("<html><body>");
        out.println("<h1>Статистика текста</h1>");
        out.println("<p>Текст: " + text + "</p>");
        out.println("<p>Количество гласных: " + vowelsCount + "</p>");
        out.println("<p>Список гласных: " + vowelsList + "</p>");
        out.println("<p>Количество согласных: " + consonantsCount + "</p>");
        out.println("<p>Список согласных: " + consonantsList + "</p>");
        out.println("<p>Количество знаков пунктуации: " + punctuationCount + "</p>");
        out.println("<p>Список знаков пунктуации: " + punctuationList + "</p>");
        out.println("</body></html>");
    }

    private int countVowels(String text) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < text.length(); i++) {
            if (vowels.indexOf(text.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    private String getVowelsList(String text) {
        StringBuilder list = new StringBuilder();
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < text.length(); i++) {
            if (vowels.indexOf(text.charAt(i)) != -1) {
                list.append(text.charAt(i)).append(" ");
            }
        }
        return list.toString().trim();
    }

    private int countConsonants(String text) {
        int count = 0;
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        for (int i = 0; i < text.length(); i++) {
            if (consonants.indexOf(text.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    private String getConsonantsList(String text) {
        StringBuilder list = new StringBuilder();
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        for (int i = 0; i < text.length(); i++) {
            if (consonants.indexOf(text.charAt(i)) != -1) {
                list.append(text.charAt(i)).append(" ");
            }
        }
        return list.toString().trim();
    }

    private int countPunctuation(String text) {
        int count = 0;
        String punctuation = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        for (int i = 0; i < text.length(); i++) {
            if (punctuation.indexOf(text.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    private String getPunctuationList(String text) {
        StringBuilder list = new StringBuilder();
        String punctuation = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        for (int i = 0; i < text.length(); i++) {
            if (punctuation.indexOf(text.charAt(i)) != -1) {
                list.append(text.charAt(i)).append(" ");
            }
        }
        return list.toString().trim();
    }
}

