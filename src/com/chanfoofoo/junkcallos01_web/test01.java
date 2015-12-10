package com.chanfoofoo.junkcallos01_web;

import java.io.IOException;

public class test01 {
	 public static void main(String[] args) throws IOException {		
		 String tmp1x = "" ;
			SearchGoogle searchEngine = new SearchGoogle() ; 
			tmp1x = searchEngine.search_csv() ; 
		 System.out.println(tmp1x) ; 
		 
/*		 SearchStock stockInt = new SearchStock() ; 
		 String result = stockInt.search_stock("01398") ;
		 System.out.println(result) ; */
		 
	 }
}
