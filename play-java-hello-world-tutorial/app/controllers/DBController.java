package controllers;

import java.util.List;
import play.mvc.*;
import views.html.organizador.*;
import java.util.Set;
import play.data.Form;
import play.data.FormFactory;
import models.*;
import javax.inject.Inject;


public class DBController extends Controller {
    @Inject
    FormFactory formFactory;


    //showing escuela al usuario 
    public Result indexEscuela(){
        Set<Escuela> escuelas = Escuela.allEscuelas();
        return ok(indexEscuela.render(escuelas));
    }
    //crear una Escuela
    public Result createEscuela(){
        Form<Escuela> escuelaForm =  formFactory.form(Escuela.class);
        return ok(createEscuela.render(escuelaForm));
        }

    //guardar una escuela
    public Result saveEscuela(){
        return TODO;
    }

    //editar una escuela
    public Result editEscuela(Integer id){
        return TODO;
    }

    //update database
    public Result updateEscuela(){
        return TODO;
    }

    //destroy database
    public Result destroyEscuela(Integer id){
        return TODO;
    }

    //enseñar database
    public Result showEscuela(Integer id){
        return TODO;
    }

    //==============================================================================

    //showing estudiante al usuario 
    public Result indexEstudiante(){
        Set<Estudiante> estudiantes = Estudiante.allEstudiantes();
        return ok(indexEstudiante.render(estudiantes));
    }

    //crear un estudiante
    public Result createEstudiante(){
        Form<Estudiante> estudianteForm =  formFactory.form(Estudiante.class);
        return ok(createEstudiante.render(estudianteForm));
    }

    //guardar un estudiante
    public Result saveEstudiante(){
        return TODO;
    }

    //editar un estudiante
    public Result editEstudiante(Integer id){
        return TODO;
    }

    //update database
    public Result updateEstudiante(){
        return TODO;
    }

    //destroy estudiante
    public Result destroyEstudiante(Integer id){
        return TODO;
    }

    //enseñar estudiante
    public Result showEstudiante(Integer id){
        return TODO;
    }

}