package com.ups.example;

import static spark.Spark.*;

public class DemoApplication {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}
