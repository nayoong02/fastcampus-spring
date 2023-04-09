package org.example.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
* 어떠한 경로가 들어와도 DispatcherServlet 호출
*/
@WebServlet("/")
public class DispatcherServlet extends HttpServlet {
    private static final Logger log = LoggerFactory.getLogger(DispatcherServlet.class);

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        log.info("DispatcherServlet#service");
    }

}
