package org.edu.eci.arep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RRInvoker {


    private static final String USER_AGENT = "Mozilla/5.0";
    private static final String[] mathServices = {"http://ec2-3-80-60-42.compute-1.amazonaws.com:35000/",
                                                  "http://ec2-3-88-58-203.compute-1.amazonaws.com:35000/",
        };

    private static int currentMathService = 0;

    public static String invoke(String service, String list, String value) throws IOException {
        System.out.println(currentMathService);
        URL obj = new URL(mathServices[currentMathService] + service + "?list=" + list + "&&" + "value=" +  value );
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        StringBuffer response = new StringBuffer();
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

        } else {
            System.out.println("GET request not worked");
        }
        roundRobinServer();
        return response.toString();
    }

    private static void roundRobinServer(){
        if(currentMathService < 1){
            currentMathService += 1;
        }else {
            currentMathService = 0;
        }
    }
}
