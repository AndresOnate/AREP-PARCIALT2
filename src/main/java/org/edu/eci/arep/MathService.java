package org.edu.eci.arep;

import org.eclipse.jetty.util.ajax.JSON;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static spark.Spark.get;
import static spark.Spark.port;

public class MathService {

    public static void main(String[] args) {

        port(getPort());

        get("/linearsearch", (req, res) -> {
            res.type("application/json");
            String[] list = req.queryParams("list").split(",");
            String value = req.queryParams("value");
            System.out.println(list);
            System.out.println(value);
            int index = MathUtil.linearSearch(list, value);
            return jsonResponse("linearSearch", req.queryParams("list"), value, Integer.toString(index));
        });


        get("/binarysearch", (req, res) -> {
            res.type("application/json");
            String[] list = req.queryParams("list").split(",");
            ArrayList<Integer> newList  = convertToInteger(list);
            String value = req.queryParams("value");
            System.out.println(list);
            System.out.println(value);
            int index = MathUtil.binarySearch(0, newList.size() , newList, Integer.parseInt(value));
            return jsonResponse("binarysearch", req.queryParams("list"), value, Integer.toString(index));
        });
    }


    private static String jsonResponse(String operation, String list, String value, String index ) {
        String response =  "{\n" +
                " \"operation\":" + "\"" + operation +  "\"" + ",\n" +
                " \"inputlist\":" + "\"" + list + "\"" + ",\n" +
                " \"value\":" + "\"" + value +  "\"" +  ",\n" +
                " \"output\":" + "\""+  index + "\""+  "\n" +
                "}";
        return response;
    }

    private static ArrayList<Integer> convertToInteger(String[] list){
        ArrayList<Integer> newList = new ArrayList<>();
        for(String i: list){
            newList.add(Integer.parseInt(i));
        }
        return  newList;
    }


    private static int getPort(){
        if(System.getenv("PORT") != null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 35000;
    }



}
