import java.util.HashMap;
import java.util.Map;

import models.Squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/", ((request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }), new HandlebarsTemplateEngine());

        get("/squad/new", ((request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "squad-form.hbs");
        }), new HandlebarsTemplateEngine());

        post("/squad/new", ((request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String squadName = request.queryParams("squadName");
            String cause = request.queryParams("cause");
            int maxSize= Integer.parseInt(request.queryParams("maxSize"));
            Squad newSquad = new Squad(squadName, cause, maxSize);
            return new ModelAndView(model, "success.hbs");

        }), new HandlebarsTemplateEngine());




    }
}
