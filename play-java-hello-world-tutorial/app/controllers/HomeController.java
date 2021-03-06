package controllers;

import play.mvc.*;
import models.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }
    
    public Result explore() {
        return ok(views.html.explore.render());
    }
    
    public Result tutorial() {
        return ok(views.html.tutorial.render());
    }

    public Result hello() {
        return ok(views.html.hello.render());      
    }

    public Result participacion() {
        return ok(views.html.organizador.participacion.render());      
    }

    // public Result estudiante() {
    //     return ok(views.html.organizador.showEstudiante.render());      
    // }

    // public Result escuela() {
    //     return ok(views.html.organizador.showEscuela.render());      
    // }

    public Result about() {
        return ok(views.html.about.render());      
    }
}
