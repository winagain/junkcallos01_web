package com.chanfoofoo.junkcallos01_web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class StockInterest01_webServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		// resp.setContentType("text/plain");
		String result ;
		
		SearchStock stockInt = new SearchStock() ;
		// http://www.aastocks.com/tc/stocks/analysis/company-fundamental/dividend-history/?symbol=00435
		String lc_stockno = req.getParameter("symbol");
		if (lc_stockno == null) {
			lc_stockno = "00435" ; 
		}
		result = stockInt.search_stock(lc_stockno) + "<br>" +  
				lc_stockno ;
		
		resp.setContentType("text/html; charset=UTF-8");
		//resp.setCharacterEncoding("UTF-8");
	    PrintWriter out = resp.getWriter();
	    out.write(result);
	    out.close() ; 
	}			
}
