/*
package com.example.bus.uporabnik.busaplication;

import android.content.Context;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

*/
/**
 * Created by Uporabnik on 12. 06. 2016.
 *//*

public class XMLparsing {
    private String urlString = "http://bus.lpp.si/";
    private XmlPullParserFactory xmlFactoryObject;
    static final String KEY_SITE = "p";


   // public volatile boolean parsingComplete = true;

    public static List<Object> PodatkiIzDatoteke(Context ctx) {
        //ArrayList<String> sezImen = new ArrayList<>();

        List<Object> stackSites;
        stackSites = new ArrayList<Object>();

        Object curStackSite = null;
        String curText = "";

        try {
            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            XmlPullParser xpp = factory.newPullParser();

            FileInputStream fis = ctx.openFileInput("StackSites.xml");
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis));

            xpp.setInput(reader);

            int eventType = xpp.getEventType();

            while (eventType != XmlPullParser.END_DOCUMENT){ //dokler nismo na koncu dokumenta

                String tagname = xpp.getName();

                switch (eventType) {
                    case XmlPullParser.START_TAG:
                        if (tagname.equalsIgnoreCase(KEY_SITE)){
                            curStackSite = new Object();
                        }

                }

            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
























    //metoda za vspostavitev povezave s spletno stranjo
   */
/* protected void ConnectionSetUP(){
        Thread proces = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    URL url = new URL(urlString);
                    HttpURLConnection conection = (HttpURLConnection)url.openConnection();

                    conection.setReadTimeout(1000);
                    conection.setConnectTimeout(1500);
                    conection.setRequestMethod("GET");
                    conection.setDoInput(true);
                    conection.connect();

                    InputStream stream = conection.getInputStream();
                    xmlFactoryObject = XmlPullParserFactory.newInstance();
                    XmlPullParser mojParser = xmlFactoryObject.newPullParser();

                    mojParser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES,false);
                    mojParser.setInput(stream, null);

                    stream.close();
                }
                catch (Exception e){
                    e.printStackTrace();

                }
            }

        });
        proces.start();


    }*//*

}
*/
