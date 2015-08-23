public class Materia {

    //creando los atributs

    public String Matricula;
    public String Nombre;
    public String Descripcion;
    public int Duracion;
    public int Costo;
    public Double caliTotal;

    //creando un constructor
    public Materia(String matricula, String nombre, String descrip, int durac,int costo,Double calitotal) {
        this.Matricula = matricula;
        this.Nombre = nombre;
        this.Descripcion = descrip;
        this.Duracion = durac;
        this.Costo = costo;
        this.caliTotal = calitotal;
    }

    Materia() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
   //agregando getteres y setters
    //matricula
    public String getMatri(){
        return Matricula;
    }
    public void setMatri(String matricula){
        this.Matricula = matricula;
     }
    //Nombre
    public String getNombre(){
        return Nombre;
    
    }
    public void setNombre(String nom){
        this.Nombre = nom;
    
    }
    //Descripcion
    public String getDescrip(){
        return Descripcion;
    }
    public void setDescrip(String descri){
        this.Descripcion = descri;
        
    }
    //duracion
    public int getDuracion(){
        return Duracion;
    }
    public void setDuracion(int duracion){
        this.Duracion = duracion;
    }
    //costo
    public int getCosto(){
        return Costo;
    }
    public void setCosto(int costo){
        this.Costo = costo;
    }
    //Calificacion total
    public double getCaliTotal(){
        return caliTotal;
    }
    public void setCaliTotal(Double calitotal){
        this.caliTotal = calitotal;
    }
}
