//clase padre de los datos

public class Datos {
    //declarar los atributos
    
        private  String Matricula;
        private  String Nombre;
        private  String ApPaterno,ApMaterno; 
        private  String Sexo;
        private  String Direccion;
        private  int Edad;
        private  String Materia;
       
        
        //constructor por defecto
        public Datos(){
        
        }
        
    //declarar el constructor    
    public Datos (String matricula,String nombre,String appat,String apmat,String sexo,String direc,int edad,String materia){
    
    Matricula = matricula;
    
    Nombre = nombre;
    ApPaterno = appat;
    ApMaterno = apmat;
    Sexo = sexo;
    Direccion = direc;
    Edad = edad;
    Materia=materia;
    
    
    }
    
     //agregando getteres y setters
    //matricula alumno
    public String getMatricula(){
        return Matricula;
    }
    public void setMatricula(String matricula){
    
    Matricula=matricula;
    }
    //Nombre
    public String getNombre(){
        return Nombre;
    
    }
    public void setNombre(String nom){
       Nombre = nom;
    
    }
    //Apellidos paterno
    public String getApPat(){
        return ApPaterno;
    }
    public void setApPat(String ApPat){
        ApPaterno =ApPat;
    
    }
    //Apellido materno
    public String getApMat(){
        return ApMaterno;
    }
    public void setApMat(String ApMat){
        ApMaterno = ApMat;
    }
    //Sexo
    public String getSexo(){
        return Sexo;
    }
    public void setSexo(String sex){
        Sexo = sex;
    
    }
    //direccion
    public String getDirec(){
        return Direccion;
    }
    public void setDirec(String direc){
        Direccion = direc;
    }
    //Edad
    public int getEdad(){
        return Edad;
    
    }
    public void setEdad(int edad){
        Edad = edad;
    
    }
   //materia
    public String getMateria(){
            
        return Materia;
    }
    public void setMateria(String mate){
        Materia = mate;
    }
    
    
    
    
   }
