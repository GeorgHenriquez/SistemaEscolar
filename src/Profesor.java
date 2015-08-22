
public class Profesor extends Datos {
    //atributos
    public String Matricula;
    public String Especialidad;
    
    //constructor por defecto
    public Profesor(){
        super();
    }
    
    //constructor con datos
    public Profesor(String matricula,String nombre,String appat,String apmat,String sexo,String direc,String especialidad){

       
        
        this.Matricula = matricula;
        this.Especialidad = especialidad;
        
    }
    //getters y setters
    //matricula
    public String getMatri(){
        return Matricula;
    }
    public void setMatri(String matricula){
        this.Matricula = matricula;
    }
    //Especialidad
    public String getEspecialidad(){
        return Especialidad;
    }
    public void setEspecialidad(String espe){
        this.Especialidad = espe;
    }
}
