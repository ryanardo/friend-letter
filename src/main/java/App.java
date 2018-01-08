import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        // HELLO FROM AFAR
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>(); // new model is made to store information
            return new ModelAndView(new HashMap(), "hello.hbs"); //TELLS PROGRAM WHICH LINE TO RENDER.
        }, new HandlebarsTemplateEngine());

        // FAVORITE PHOTOS
        get("/favorite_photos", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(new HashMap(), "favorite_photos.hbs"); //TELLS PROGRAM WHICH LINE TO RENDER.
        }, new HandlebarsTemplateEngine());

    }
}
