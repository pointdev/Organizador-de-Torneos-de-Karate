package models;

//Estudiante(numero, nombre, apellido1, apellido2, cinta, edad, escuela, codigo_participacion)

public class estudiante  {
    public Integer id;
    public String fname, lname, lname2, cinta, escuela;
    public Integer edad, codigoParticipacion;

    public estudiante(Integer id, String fname, String lname, String lname2, String cinta, Integer edad, String escuela, String codigoParticipacion){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.lname2 = lname2;
        this.cinta = cinta;
        this.edad = edad;
        this.escuela = escuela;
        this.codigoParticipacion = codigoParticipacion;
    }
}
