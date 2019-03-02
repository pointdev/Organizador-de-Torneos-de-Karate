package controllers;

import java.util.List;
import play.mvc.*;
import views.html.organizador.*;
import java.util.Set;
import play.data.Form;
import play.data.FormFactory;
import models.*;


public class DBController extends Controller {

    //showing escuela al usuario 
    public Result indexEscuela(){
        Set<Escuela> escuelas = Escuela.allEscuelas();
        return ok(indexEscuela.render(escuelas));
    }
    //crear una Escuela
    public Result createEscuela(){
        return TODO;
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

    //crear un estudiante
    public Result createEstudiante(){
        return TODO;
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