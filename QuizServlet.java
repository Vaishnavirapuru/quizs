package com.nov16;

import javax.servlet.annotation.*;

import java.io.*;

import javax.servlet.*;

@WebServlet("/quiz")
public class QuizServlet extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res)throws ServletException,IOException {
		int question = 5;
		int count=0;
		QuizBean qb = new QuizBean();
		String n=req.getParameter("name");
				String p=req.getParameter("pword");
		qb.setName(n);
		qb.setPword(p);
		if (req.getParameter("question1").equals("2")) {
			count++;
		}
		if (req.getParameter("question2").equals("1")) {
			count++;
		}
		if (req.getParameter("question3").equals("1")) {
			count++;
		}
		if (req.getParameter("question4").equals("1")) {
			count++;
		}
		if (req.getParameter("question5").equals("2")) {
			count++;
		}
		qb.setScore(count);
		qb.setQues(question);

		int k = new QuizDAO().quiz(qb);
		if(k>0)
		{
			PrintWriter pw=res.getWriter();
			pw.println("name:"+n);
			pw.println("questions:"+question);
			pw.println("score:"+count);
		}

	}

}
