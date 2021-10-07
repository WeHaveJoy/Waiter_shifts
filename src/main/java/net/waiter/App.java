package net.waiter;

import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;

public class App {

    static   Map<String, Object> map = new HashMap<>();

//    static int getHerokuAssignedPort() {
//        ProcessBuilder processBuilder = new ProcessBuilder();
//        if (processBuilder.environment().get("PORT") != null) {
//            return Integer.parseInt(processBuilder.environment().get("PORT"));
//        }
//        return 4566; //return default port if heroku-port isn't set (i.e. on localhost)
//    }

    public static void main(String[] args) {

        String dbDiskURL = "jdbc:h2:file:./Coffee_shop";


        Jdbi jdbi = Jdbi.create(dbDiskURL, "sa", "");

// get a handle to the database
        Handle handle = jdbi.open();

// create the table if needed
//        handle.execute("create table if not exists waiters (  waiterID INT PRIMARY KEY NOT NULL, waiter varchar(15))");

        

        port(8080); // Spark will run on port 8080

        get("/", (req, res) -> {
            Map<String, Object> map = new HashMap<>();

            return new ModelAndView(map, "login.handlebars");


        }, new HandlebarsTemplateEngine());


        get("/:username", (req, res) -> {
            Map<String, Object> map = new HashMap<>();

            return new ModelAndView(map, "shift.handlebars");


        }, new HandlebarsTemplateEngine());


        post("/:username", (req, res) -> {
            Map<String, Object> map = new HashMap<>();

            String waiterName = "username";

    String name= String.valueOf(handle.execute("insert into waiters (waiter) values($1)", waiterName));


       System.out.println(name);

//            return   "/ " + req.params(":username");
            return new ModelAndView(map, "shift.handlebars");

        }, new HandlebarsTemplateEngine());



        get("/admin", (req, res) -> {

            Map<String, Object> map = new HashMap<>();

            return new ModelAndView(map, "manager.handlebars");

        }, new HandlebarsTemplateEngine());

    }


}
