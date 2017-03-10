package com.ups;

import static spark.Spark.*;

public class DemoApplicationexample {
    public static void main(String[] args) {
        //get("/hello", (req, res) -> "Hello World");
       get("/", new Route() {
            @Override
            public Object handle(Request request, Response response) {
                return "Hello World!!";
            }
        });
        
        System.out.println("Hello World");
    }
}
