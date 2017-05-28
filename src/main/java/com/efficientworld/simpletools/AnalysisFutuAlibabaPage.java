package com.efficientworld.simpletools;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by Administrator on 2017/5/29 0029.
 *
 * for test
 */
public class AnalysisFutuAlibabaPage {
    public static void main(String[] args){
        AnalysisFutuAlibabaPage p=new AnalysisFutuAlibabaPage();
        p.analysis();
    }

    public void analysis(){
        try {
            Document doc= Jsoup.connect("https://www.futunn.com/quote/stock?m=us&code=BABA").get();
            Element content=doc.getElementById("basicQuote");
            Elements x=content.getElementsByClass("div002 up");
            if(x.size()==1){
                Elements a=x.get(0).getElementsByTag("span");
                for(Element e:a){
                    System.out.println(e.text());
                }
            }else{
                throw new RuntimeException("logic beyond assumed.");
            }
        } catch (IOException e) {
            throw new RuntimeException("analysis error,root cause:"+ ExceptionUtils.getRootCauseMessage(e),e);
        }

    }
}
