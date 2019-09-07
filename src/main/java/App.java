import hero.*;
import static  spark.Spark.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class App {

    public static void main(String[] args) {
        staticFileLocation("/public");


        get("/",(req,res)->{
            Map<String,Object> model = new HashMap<>();
            return new ModelAndView(model,"index.hbs");
        }, new HandlebarsTemplateEngine());



        get("/heroes/new",(req,res)->{
            Map<String,Object> model = new HashMap<>();
            return new ModelAndView(model,"post-heroForm.hbs");
        }, new HandlebarsTemplateEngine());

        post("/heroes/new", (req,res)->{
            Map<String,Object> model = new HashMap<>();
            String name = req.queryParams("name");
            int Age = Integer.parseInt(req.queryParams("age"));
            Individual_Hero hero = new Individual_Hero(name,Age);
            return new ModelAndView(model,"success.hbs");

        },new HandlebarsTemplateEngine());
    }
}
