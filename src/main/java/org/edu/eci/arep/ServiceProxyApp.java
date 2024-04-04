package org.edu.eci.arep;

import static spark.Spark.*;

public class ServiceProxyApp {

    public static void main(String[] args) {

        port(getPort());
        staticFiles.location("/public");
        get("/mathservices", (req, res) -> {
            res.type("application/json");
            System.out.println(req.queryParams("list"));
            return RRInvoker.invoke(req.queryParams("operation"), req.queryParams("list"), req.queryParams("value"));

        });

    }
    private static int getPort(){
        if(System.getenv("PORT") != null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}
