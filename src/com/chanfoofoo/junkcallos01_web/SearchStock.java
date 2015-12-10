package com.chanfoofoo.junkcallos01_web;

import java.io.IOException;
import java.util.Random;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class SearchStock {
	public String xxsearch_csv() {
		String result = "https://www.google.com.hk/url?sa=t&rct=j&q=&esrc=s&source=web&cd=1&cad=rja&uact=8&ved=0ahUKEwiUq9ujgsfJAhWDJKYKHdPCDioQFggcMAA&url=http%3A%2F%2Fhkjunkcall.com%2FHKG_HL.XML&usg=AFQjCNH3mkJCEr5fB-0VSItjgUAun15VUw&sig2=UKbxEUZzLRvRP8w4fuK_-Q" ;
		return result ; 
	}
	
	public String search_stock(String lc_stockno){
		String lc_url = "http://www.aastocks.com/tc/stocks/analysis/company-fundamental/dividend-history/?symbol=" + lc_stockno ; // "00435"
		StringBuffer sb = new StringBuffer() ;
		String tmp1x = "" ; 
		try {
			System.out.println(lc_url) ; 
			// search = google + "search?q=hkjunkcall.com+HKG_HL.XML&safe=off&source=lnt&tbs=qdr:w&sa=X&ved=0ahUKEwj70Nbiw8bJAhXEHZQKHbapCn8QpwUIFA&biw=760&bih=778" ;
			// links = Jsoup.connect(lc_url).userAgent(userAgent).get().select("li.g>h3>a");
			Document doc = Jsoup.connect(lc_url).get() ; 
// <table class="cnhk-cf tblM s4 s5" style="width: 100%"> <caption class="txt_l nobl"> <div style="width: 100%" class="full"> <span class="float_l">派息記錄</span> <span style="float: right; padding-top: 5px; font-weight: normal; margin-right: 5px;"> <select onchange="GoToDH(this.value)"> <option value="" selected="">所有</option> <option value="SD">特別股息</option> <option value="D">股息</option> <option value="R">供股</option> <option value="B">紅股</option> <option value="O">公開發售</option> <option value="C">股份合併</option> <option value="S">股份拆細</option> </select> </span> <span style="float: right; font-weight: normal; margin-right: 5px; color:#000">

			sb.append("<table>")  ; 
		    for (Element table : doc.select("table")) {
		    	// System.out.println(table.className()) ;
		    	if (table.className().equals("cnhk-cf tblM s4 s5")) {
			    	for (Element row : table.select("tr")) {
			    		sb.append("<tr>")  ;
			            Elements tds = row.select("td");
			            if (tds.size() > 4) {
			            	tmp1x = "" ; 
			            	for (int ii=0;ii<tds.size();ii++){
			            		tmp1x = tmp1x + "<td>" + tds.get(ii).text() + "</td>" ; 
			            	}
			            	sb.append(tmp1x); 
			            }
			            sb.append("</tr> \r\n")  ;
			        }
		    	}
		    }
		    sb.append("</table>")  ; 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return sb.toString() ; 
	}
}	


