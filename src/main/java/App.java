import models.Individual_Hero;
import models.Squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;

public class App {

    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/heroes/new",(req,res)->{
            Map<String,Object> model = new HashMap<>();
            return new ModelAndView(model,"post-heroForm.hbs");
        }, new HandlebarsTemplateEngine());

        post("/heroes/new", (req,res)->{
            Map<String,Object> model = new HashMap<>();
            String name = req.queryParams("name");
            int age = Integer.parseInt( req.queryParams("age"));
            String specialPower = req.queryParams("powers");
            String weakness = req.queryParams("weakness");
            Individual_Hero hero = new Individual_Hero(name,age,specialPower,weakness);
            return new ModelAndView(model,"success.hbs");

        },new HandlebarsTemplateEngine());
        get("/squads/new",(req,res)->{
            Map<String,Object> model = new HashMap<>();
            return new ModelAndView(model,"squadForm.hbs");
        }, new HandlebarsTemplateEngine());

        post("/squads/new", (req,res)->{
            Map<String,Object> model = new HashMap<>();
            String squadName = req.queryParams("squadName");
            int maxSize = Integer.parseInt( req.queryParams("maxSize"));
            String squadCause = req.queryParams("squadCause");
           Squad mySquad = new Squad(squadName,maxSize,squadCause);
            return new ModelAndView(model,"squadSuccess.hbs");

        },new HandlebarsTemplateEngine());

        get("/squads/:id",(req,res)->{
            Map<String, Object>model = new HashMap<>();
            int idOfSquadToFind = Integer.parseInt(req.params(":id"));
            Squad foundSquad =  Squad.findById(idOfSquadToFind);
            model.put("squad",foundSquad);
            return new ModelAndView(model,"squad-detail.hbs");

        }, new HandlebarsTemplateEngine());




        get("/heroes/:id",(req,res)->{
            Map<String, Object> model = new HashMap<>();
            int idOfHeroToFind = Integer.parseInt(req.params(":id"));
            Individual_Hero foundHero =  Individual_Hero.findById(idOfHeroToFind);
            model.put("hero",foundHero);
            return new ModelAndView(model,"heroDetail.hbs");

        }, new HandlebarsTemplateEngine());


        get("/",(req,res)->{
            Map<String,Object> model = new HashMap<>();
            List<Individual_Hero> heroes = Individual_Hero.all();
            List<Squad> squads = Squad.all();
            model.put("heroes",heroes);
            model.put("squads",squads);

            return new ModelAndView(model,"index.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
