package com.chanfoofoo.junkcallos01_web;

import java.io.IOException;
import java.util.Random;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class SearchGoogle {
	public String xxsearch_csv() {
		String result = "https://www.google.com.hk/url?sa=t&rct=j&q=&esrc=s&source=web&cd=1&cad=rja&uact=8&ved=0ahUKEwiUq9ujgsfJAhWDJKYKHdPCDioQFggcMAA&url=http%3A%2F%2Fhkjunkcall.com%2FHKG_HL.XML&usg=AFQjCNH3mkJCEr5fB-0VSItjgUAun15VUw&sig2=UKbxEUZzLRvRP8w4fuK_-Q" ;
		return result ; 
	}
	
	public String search_csv() {
    	// String google = "http://www.google.com/search?site=hkjunkcall.com&q=";
    	String google = "https://www.google.com.hk/" ; 
    	// String search = "hkjunkcall.com+HKG_HL.XML&safe=off&source=lnt&tbs=qdr:w&sa=X&ved=0ahUKEwj70Nbiw8bJAhXEHZQKHbapCn8QpwUIFA&biw=760&bih=778";
    	String search = "hkjunkcall.com+HKG_HL.XML";
    	String charset = "UTF-8";
    	// String userAgent = "ExampleBot 1.0 (+http://example.com/bot)"; // Change this to your company's name and bot homepage!
    	String userAgent = "Mozilla/5.0" ; 
    	String result = "nothing found xx" ;
    	String tmp1x ;     	
    	 
    	// Elements links = Jsoup.connect(google + URLEncoder.encode(search, charset)).userAgent(userAgent).get().select("li.g>h3>a");
    	Elements links = null ;
		try {
			// search = "search?q=" + search + "&num=10&as_qdr=m" ; // URLEncoder.encode(search, charset) ;
			// search = search + "&num=5&gws_rd=cr&site:hkjunkcall.com" ; 
			// search = URLEncoder.encode(search, charset) ;
			tmp1x = Double.toString((new Random()).nextDouble());
			search = google + "search?q=" + search + "&randomid=" + tmp1x ;  
			System.out.println(search) ; 
			// search = google + "search?q=hkjunkcall.com+HKG_HL.XML&safe=off&source=lnt&tbs=qdr:w&sa=X&ved=0ahUKEwj70Nbiw8bJAhXEHZQKHbapCn8QpwUIFA&biw=760&bih=778" ;
			links = Jsoup.connect(search).userAgent(userAgent).get().select("li.g>h3>a");
	    	for (Element link : links) {
	    	    String title = link.text();
	    	    String url = link.absUrl("href"); // Google returns URLs in format "http://www.google.com/url?q=<url>&sa=U&ei=<someKey>".
	    	    // url = URLDecoder.decode(url.substring(url.indexOf('=') + 1, url.indexOf('&')), "UTF-8");

	    	    if (!url.startsWith("http")) {
	    	        continue; // Ads/news/etc.
	    	    }

	    	    tmp1x = google + "url?q=" ; 
	    	    url = url.replace(tmp1x , "") ; 

	    	    System.out.println("Title: " + title);
	    	    System.out.println("URL: " + url);
	    	    // System.out.println(link.toString());
	    	    
	    	    
	    	    result = result + "<a href='" + url + "' target='main'>"; 
	    	    // break ; 
	    	}			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


    	return result ; 
    }

	public String test02_search_csv() {
    	// String google = "http://www.google.com/search?site=hkjunkcall.com&q=";
    	String google = "https://www.google.com.hk/" ; 
    	// String search = "hkjunkcall.com+HKG_HL.XML&safe=off&source=lnt&tbs=qdr:w&sa=X&ved=0ahUKEwj70Nbiw8bJAhXEHZQKHbapCn8QpwUIFA&biw=760&bih=778";
    	String search = "hkjunkcall.com+HKG_HL.XML";
    	String charset = "UTF-8";
    	// String userAgent = "ExampleBot 1.0 (+http://example.com/bot)"; // Change this to your company's name and bot homepage!
    	String userAgent = "Mozilla/5.0" ; 
    	String result = "nothing found test02_search_csv() xx" ;
    	String tmp1x ;     	
    	 
    	// Elements links = Jsoup.connect(google + URLEncoder.encode(search, charset)).userAgent(userAgent).get().select("li.g>h3>a");
    	Elements links = null ;
		try {
			// search = "search?q=" + search + "&num=10&as_qdr=m" ; // URLEncoder.encode(search, charset) ;
			// search = search + "&num=5&gws_rd=cr&site:hkjunkcall.com" ; 
			// search = URLEncoder.encode(search, charset) ;
			tmp1x = Double.toString((new Random()).nextDouble());
			search = google + "search?q=" + search + "&randomid=" + tmp1x ;  
			// search = "http://www.google.com.hk/search?q=hkjunkcall.com+HKG_HL.XML&safe=off&source=lnt&tbs=qdr:w&sa=X&ved=0ahUKEwj70Nbiw8bJAhXEHZQKHbapCn8QpwUIFA&biw=760&bih=778";
			search = "http://www.google.com.hk/search?q=hkjunkcall.com+HKG_HL.XML";
			System.out.println(search) ; 
			// search = google + "search?q=hkjunkcall.com+HKG_HL.XML&safe=off&source=lnt&tbs=qdr:w&sa=X&ved=0ahUKEwj70Nbiw8bJAhXEHZQKHbapCn8QpwUIFA&biw=760&bih=778" ;
			links = Jsoup.connect(search).userAgent(userAgent).get().select("li.g>h3>a");
	    	for (Element link : links) {
	    	    String title = link.text();
	    	    String url = link.absUrl("href"); // Google returns URLs in format "http://www.google.com/url?q=<url>&sa=U&ei=<someKey>".
	    	    // url = URLDecoder.decode(url.substring(url.indexOf('=') + 1, url.indexOf('&')), "UTF-8");

	    	    if (!url.startsWith("http")) {
	    	        continue; // Ads/news/etc.
	    	    }

	    	    tmp1x = google + "url?q=" ; 
	    	    url = url.replace(tmp1x , "") ; 

	    	    System.out.println("Title: " + title);
	    	    System.out.println("URL: " + url);
	    	    // System.out.println(link.toString());
	    	    
	    	    
	    	    result =  "<a href='" + url + "' target='main'>" ; 
	    	    break ; 
	    	}			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


    	return result ; 
    }
	
}	


