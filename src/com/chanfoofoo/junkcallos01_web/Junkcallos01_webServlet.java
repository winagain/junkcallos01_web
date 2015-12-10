package com.chanfoofoo.junkcallos01_web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Junkcallos01_webServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		String result ; 
		result = "Hello, world 123 : " + get_junkcall_csv_page() ; 
		resp.getWriter().println(result );
	}
	
	private String get_junkcall_csv_page() {
		String result ; 
		// SearchGoogle searchEngine = new SearchGoogle() ; 
		// result = searchEngine.test02_search_csv() ;
		result = "http://hkjunkcall.com/HKG_HL.XML" ; 
		result = "<a href='" + result + "' target='main'>"  ;  
		return result ;  
	}
	
	
	private String xx_get_junkcall_csv_page() {
		String url = "http://hkjunkcall.com/Download/download.asp?DownloadID=6";		
		String result = "" ; 
		 			
		try {
			URL obj;
			
			obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("GET");

			con.setRequestProperty("User-Agent", "Mozilla/5.0");

			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + responseCode);

			BufferedReader in = new BufferedReader(
					new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			result = response.toString() ; 

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result ; 
	}

}
