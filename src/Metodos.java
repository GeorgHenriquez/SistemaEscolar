
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Metodos {

    //creando array list para guardar los datos creados
    public static ArrayList<Alumno> alumnos = new ArrayList<>();
    public static ArrayList<Materia> materias = new ArrayList<>();
    public static ArrayList<Profesor> profesor = new ArrayList<>();

    Principal ocul = new Principal();
    //Datos datos = new Datos();

    //METODOS PARA GENERAR LAS MATRICULAS
    //GENERAR MATRICULA DE ALUMNO
    public String GenerarMatricula(String nombre, String app, String apm, int edad,
            String sexo) {

        //String miEdad = String.valueOf(edad);
        String matricula = nombre.substring(0, 1) + app.substring(0, 1) + apm.substring(0, 1) + edad + sexo;

        return matricula.toUpperCase();

    }

    //GENERAR LA MATRICULA DE LA MATERIA
    public String GenerarMatricuMateria(String nombre, String des,
            int duracion) {

        String matricula = nombre.substring(0, 1) + des.substring(0, 1) + duracion + 1 + 4 + 3;

        return matricula.toUpperCase();
    }

    //GENERAR LA MATRICULA DEL PROFESOR
    public String GenerarMatriProfesor(String nombre, String app, String apm,
            String sexo, String especialidad) {

        String matricula = nombre.substring(0, 1) + app.substring(0, 1) + apm.substring(0, 1) + sexo + especialidad.substring(1, 3) + 3;

        return matricula.toUpperCase();
    }

//    public String mostrarMatricula() {
//
//        String matricula = GenerarMatricula(datos.getNombre(), datos.getApPat(),
//                datos.getApMat(), datos.getEdad(), datos.getSexo(),
//                datos.getMateria());
//        JOptionPane.showMessageDialog(null, "La matricula generada es: " + datos.getMatricula());
//
//        return datos.getMatricula();
//
//    }
//metodo para capturar datos del alumno
    public void capturaDatosAlumno() {
        //variables
        String nombre1,
                ap,
                am,
                sexo;
        int edad;

        Alumno obj = new Alumno();

        //si no hay ninguna materia dada de alta entonces no podra dar de alta ningun alumno
        if (materias.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Para poder dar de alta un alumno necesitas una materia\n en el sistema");

        } else {
            nombre1 = JOptionPane.showInputDialog(null, "Ingrese Nombre: ");
            while (nombre1.length() == 0 || nombre1.length() < 2) {
                nombre1 = JOptionPane.showInputDialog(null, "Ingrese un nombre válido");
            }
            obj.setNombre(nombre1);

            ap = JOptionPane.showInputDialog(null, "Ingrese Apellido Paterno: ");
            while (ap.length() == 0 || ap.length() < 2) {
                ap = JOptionPane.showInputDialog(null, "Ingrese un Apellido Paterno válido");
            }
            obj.setApPat(ap);
            am = JOptionPane.showInputDialog(null, "Ingrese Apellido Materno: ");
            while (am.length() == 0 || am.length() < 2) {
                am = JOptionPane.showInputDialog(null, "Ingrese un Apellido Materno válido");
            }
            obj.setApMat(am);
            edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Edad: "));
            while (edad < 0 || edad > 100 || edad == 0) {
                edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una edad válida"));
            }
            obj.setEdad(edad);
            sexo = JOptionPane.showInputDialog(null, "Ingrese Sexo: ");
            while (!(sexo.equals("f") || sexo.equals("m"))) {
                sexo = JOptionPane.showInputDialog(null, "Ingrese un Sexo válido");
            }
            obj.setSexo(sexo);
//            materia = JOptionPane.showInputDialog(null, "Ingrese Materia: ");
//            while (materia.length() == 0 || materia.length() < 3) {
//                materia = JOptionPane.showInputDialog(null, "Ingrese una Materia válida");
//            }
//            obj.setMateria(materia);

            obj.setMatricula(GenerarMatricula(obj.getNombre(), obj.getApPat(), obj.getApMat(), obj.getEdad(), obj.getSexo()));

            //agregando los datos anteriores a el arraylist
            alumnos.add((Alumno) obj);
            JOptionPane.showMessageDialog(null, "El alumno se ha agregado con éxito");

        }

    }

    //metodo para añadir alumno automaticamente
    public void capturarAlumnoAuto() {

        Alumno obj = new Alumno();

        if (materias.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Para poder dar de alta un alumno necesitas una materia\n en el sistema");

        } else {

            obj.setNombre("Jose Manuel");
            obj.setApPat("Pérez");
            obj.setApMat("Garcia");
            obj.setEdad(18);
            obj.setSexo("m");
            obj.setMateria("Algebra");

            obj.setMatricula(GenerarMatricula(obj.getNombre(), obj.getApPat(), obj.getApMat(), obj.getEdad(), obj.getSexo()));

            //agregando los datos anteriores a el arraylist
            alumnos.add((Alumno) obj);

            JOptionPane.showMessageDialog(null, "El alumno se ha agregado automáticamente con éxito");

        }

    }

    public void CapturarMateria() {
        String nombre,
                descrip;
        int duracion, costo;

        Materia obj1 = new Materia();

        //si profesor esta vacio no deja capturar una materia
        if (profesor.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Para poder dar de alta una materia  necesitas un profesor \n en el sistema");

        } else {

            nombre = JOptionPane.showInputDialog(null, "Ingrese Nombre: ");
            while (nombre.length() == 0 || nombre.length() < 2) {
                nombre = JOptionPane.showInputDialog(null, "Ingrese un nombre válido");
            }
            obj1.setNombre(nombre);

            descrip = JOptionPane.showInputDialog(null, "Ingrese descripcion de la materia: ");
            while (descrip.length() == 0 || descrip.length() < 2) {
                descrip = JOptionPane.showInputDialog(null, "La materia debe de \n tener mas de tres caracteres");
            }
            obj1.setDescrip(descrip);
            duracion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese duracion en horas: "));
            while (duracion < 0 || duracion > 100 || duracion == 0) {
                duracion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la duracion en horas menor a 100 y mayor a 0 "));
            }
            obj1.setDuracion(duracion);
            costo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el costo de el curso"));
            while (costo < 0 || costo == 0) {
                costo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un costo válido para el curso "));
            }
            obj1.setCosto(costo);

            //Generar la matricula de la materia
            obj1.setMatri(GenerarMatricuMateria(obj1.getNombre(), obj1.getDescrip(), obj1.getDuracion()));

            //agregando los datos a un array list
            materias.add((Materia) obj1);
            JOptionPane.showMessageDialog(null, "El curso  se ha agregado con éxito");
        }
    }

    public void capturarMateriaAuto() {
        Materia obj1 = new Materia();

        if (profesor.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Para poder dar de alta una materia  necesitas un profesor \n en el sistema");
        } else {

            obj1.setNombre("Algebra");
            obj1.setDescrip("En esta materia el alumno reforzara conocimientos previos de algebra");
            obj1.setDuracion(5);
            obj1.setCosto(600);
            //Agregar la materia al arraylist materia
            materias.add((Materia) obj1);

            //Generar la matricula automaticamente
            obj1.setMatri(GenerarMatricuMateria(obj1.getNombre(), obj1.getDescrip(), obj1.getDuracion()));

            JOptionPane.showMessageDialog(null, "El curso se ha agregado automáticamente con éxito");
        }
    }

    public void capturarProfesor() {
        //declarando variables
        String nombre,
                ap,
                am,
                sexo,
                direccion,
                espe;

        Profesor obj2 = new Profesor();

        nombre = JOptionPane.showInputDialog(null, "Ingrese Nombre: ");
        while (nombre.length() == 0 || nombre.length() < 2) {
            nombre = JOptionPane.showInputDialog(null, "Ingrese un nombre válido");
        }
        obj2.setNombre(nombre);
        ap = JOptionPane.showInputDialog(null, "Ingrese Apellido Paterno: ");
        while (ap.length() == 0 || ap.length() < 2) {
            ap = JOptionPane.showInputDialog(null, "Ingrese un Apellido Paterno válido");
        }
        obj2.setApPat(ap);
        am = JOptionPane.showInputDialog(null, "Ingrese Apellido Materno: ");
        while (am.length() == 0 || am.length() < 2) {
            am = JOptionPane.showInputDialog(null, "Ingrese un Apellido Materno válido");
        }
        obj2.setApMat(am);
        sexo = JOptionPane.showInputDialog(null, "Ingrese Sexo: ");
        while (!(sexo.equals("f") || sexo.equals("m") || (sexo.equals("F")) || (sexo.equals("M")))) {
            sexo = JOptionPane.showInputDialog(null, "Ingrese un Genero válido");
        }
        obj2.setSexo(sexo);
        direccion = JOptionPane.showInputDialog(null, "Ingrese la direccion: ");
        while (direccion.length() == 0 || direccion.length() < 2) {
            direccion = JOptionPane.showInputDialog(null, "Ingrese una direccion válida");
        }
        obj2.setDirec(direccion);
        espe = JOptionPane.showInputDialog(null, "Ingrese su especialidad: ");
        while (espe.length() == 0 || espe.length() < 2) {
            espe = JOptionPane.showInputDialog(null, "Ingrese una especialidad válida");
        }
        obj2.setEspecialidad(espe);
        //agregando datos al arraylist profesor
        profesor.add((Profesor) obj2);
        //generar la matricula del profesor
        obj2.setMatri(GenerarMatriProfesor(obj2.getNombre(), obj2.getApPat(), obj2.getApMat(), obj2.getSexo(), obj2.getEspecialidad()));

        JOptionPane.showMessageDialog(null, "El profesor se ha agregado con éxito");
    }
//Metodo para capturar profesores automaticamente

    public void capturarProfesorAuto() {
        Profesor obj2 = new Profesor();

        obj2.setNombre("Richard");
        obj2.setApMat("Diaz");
        obj2.setApPat("Perez");
        obj2.setSexo("m");
        obj2.setDirec("Por,el puente roto, adelante de la cementera XD ");
        obj2.setEspecialidad("Ingeniero");

        //Agregar los datos anteriores al arraylist
        profesor.add((Profesor) obj2);

        //generar la matricula del profesor automaticamente con el metodo
        obj2.setMatri(GenerarMatriProfesor(obj2.getNombre(), obj2.getApPat(), obj2.getApMat(), obj2.getSexo(), obj2.getEspecialidad()));

        JOptionPane.showMessageDialog(null, "El profesor se ha agregado automáticamente con éxito");

    }
    //Metodos para mostrar

    public void mostrarAlumno() {
        for (int i = 0; i <= alumnos.size() - 1; i++) {
            Alumno alum = (Alumno) alumnos.get(i);

            JOptionPane.showMessageDialog(null, "** DATOS  DE ALUMNO**\n" + "Matricula: " + alum.getMatricula() + "\nNombre: "
                    + alum.getNombre() + " " + alum.getApPat() + " " + alum.getApMat() + "\nEdad: " + alum.getEdad()
                    + "\nMateria que cursa: " + alum.getMateria());

            //nombre,Edad,sexo,Materia que cursa
        }
    }

    public void mostrarMateria() {
        for (int i = 0; i <= materias.size() - 1; i++) {
            Materia mate = (Materia) materias.get(i);

            JOptionPane.showMessageDialog(null, "** DATOS  DE MATERIA** \n" + "Matricula: " + mate.getMatri()
                    + "\nNombre: " + mate.getNombre() + "\nDescripción: " + mate.getDescrip() + "\nDuracion: " + mate.getDuracion() + " horas"
                    + "\nCosto: " + mate.getCosto());

        }
    }

    public void mostrarProfesor() {
        for (int i = 0; i <= profesor.size() - 1; i++) {
            Profesor profe = (Profesor) profesor.get(i);
            JOptionPane.showMessageDialog(null, "\"** DATOS  DE PROFESOR**\n" + "Matricula: " + profe.getMatri() + "\nNombre: "
                    + profe.getNombre() + " " + profe.getApPat() + " " + profe.getApMat() + "\nSexo: " + profe.getSexo() + "\nDireccion: "
                    + profe.getDirec() + "\nEspecialidad: " + profe.getEspecialidad());

            //Nombre apmat appat sexo, direc,especi
        }

    }
//Metodos para buscar

    public void buscarAlumno(String matricula) {
        for (int i = 0; i <= alumnos.size() - 1; i++) {

            Alumno alum = (Alumno) alumnos.get(i);

            if (matricula.equals(alum.getMatricula())) {
                JOptionPane.showMessageDialog(null, "Los datos del alumno encontrado son: \n" + "Matricula: " + alum.getMatricula() + "\nNombre: "
                        + alum.getNombre() + " " + alum.getApPat() + " " + alum.getApMat() + "\nEdad: " + alum.getEdad()
                        + "\nMateria que cursa: " + alum.getMateria());
            } else {

                JOptionPane.showMessageDialog(null, "Has escrito mal la matricula, intentelo de nuevo");
            }

        }

    }

    public void buscarMateria(String materia) {
        for (int i = 0; i <= materias.size() - 1; i++) {
            Materia mate = (Materia) materias.get(i);

            if (materia.equals(mate.getMatri())) {

                JOptionPane.showMessageDialog(null, "Los datos de la materia encontrada son: \n" + "Matricula: " + mate.getMatri()
                        + "\nNombre: " + mate.getNombre() + "\nDescripción: " + mate.getDescrip() + "\nDuracion: " + mate.getDuracion() + " horas"
                        + "\nCosto: " + mate.getCosto());
            } else {
                JOptionPane.showMessageDialog(null, "Has escrito mal la matricula, intentelo de nuevo");
            }

        }

    }

    public void buscarProfesor(String prof) {

        for (int i = 0; i <= profesor.size() - 1; i++) {
            Profesor profe = (Profesor) profesor.get(i);

            if (prof.equals(profe.getMatri())) {
                JOptionPane.showMessageDialog(null, "Los datos encontrados del profesor son: \n" + "Matricula: " + profe.getMatri() + "\nNombre: "
                        + profe.getNombre() + " " + profe.getApPat() + " " + profe.getApMat() + "\nSexo: " + profe.getSexo() + "\nDireccion: "
                        + profe.getDirec() + "\nEspecialidad: " + profe.getEspecialidad());
            } else {
                JOptionPane.showMessageDialog(null, "Has escrito mal la matricula, intentelo de nuevo");
            }

        }

    }

    //Metodos para mostrar los datos, si estan vacios mandar mensaje sino proceder a mostar los datos 
    //Alumno
    public void verSiVacioAlumno() {
        if (alumnos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay ningun alumno registrado");
        } else {
            mostrarAlumno();

        }

    }

    //Materia
    public void verSiVacioMateria() {
        if (materias.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay ninguna materia registrada");
        } else {
            mostrarMateria();

        }

    }

    //Profesor
    public void verSiVacioProfesor() {
        if (profesor.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay ninguna profesor registrado");
        } else {
            mostrarProfesor();

        }

    }

    //Metodos para busqueda, si estan vacio mandar que no hay ningun alumno registrado si ya estan llenos, proceder a 
    //buscar los alumnos
    public void VacioAlumno() {
        if (alumnos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay ningun alumno registrado");
        } else {
            buscarAlumno(JOptionPane.showInputDialog(null, "Introduce la matricula: "));
        }

    }//Para las materias

    public void VacioMateria() {
        if (materias.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay ninguna materia registrada");

        } else {
            buscarMateria(JOptionPane.showInputDialog(null, "Introduce la matricula: "));

        }

    }

    public void VacioProfesor() {
        if (profesor.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay ninguna profesor registrado");

        } else {
            buscarProfesor(JOptionPane.showInputDialog(null, "Introduce la matricula: "));

        }

    }

    //Esto es para capturar a que curso va a pertenecer el alumno y se puedan ver los cursos disponibles
    public void capturarCurso() {
        //para asignar un nombre del curso al que esta perteneciendo el alumno

        for (int i = 0; i <= materias.size() - 1; i++) {

            Materia mate = (Materia) materias.get(i);
            Alumno obj = (Alumno) alumnos.get(i);
           
            boolean bandera = true;
            do{
            
            String materia = JOptionPane.showInputDialog(null, "Introduce la matricula del curso: ");
            
            
                 if (materia.equals(mate.getMatri())) {
                    //Agregando el nombre de la matricula al curso
                    obj.setMateria(mate.getNombre());
                    JOptionPane.showMessageDialog(null, "Has agregado esta materia a tus cursos");
                    bandera=false;
                    
                    } else {
                    
                    JOptionPane.showMessageDialog(null, "Has escrito mal la matricula, intentelo de nuevo");
                    bandera=true;
                 }
        }while(bandera==true);
                
           
        }

    }
// ver cursos disponibles

    public void verCursos() {

        for (int i = 0; i <= materias.size() - 1; i++) {
            Materia mate = (Materia) materias.get(i);

            JOptionPane.showMessageDialog(null, "** CURSOS DISPONIBLES** \n" + "Matricula: " + mate.getMatri()
                    + "\nNombre: " + mate.getNombre() + "\nDuración: " + mate.getDuracion() + "\nCosto: " + mate.getCosto());

        }

    }
//Ver adeudos disponibles

    public void verAdeudos() {

        if (alumnos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay ningun alumno registrado");

        } else {

            for (int i = 0; i <= alumnos.size() - 1; i++) {
                Alumno alum = (Alumno) alumnos.get(i);
                Materia mate = (Materia) materias.get(i);
                if (mate.getCosto() > 0) {

                    JOptionPane.showMessageDialog(null, "**ALUMNO CON ADEUDO**\n" + "Nombre: "
                            + alum.getNombre() + " " + alum.getApPat() + " " + alum.getApMat() + "\nMateria que cursa: " + alum.getMateria() + "\nAdeudo: " + mate.getCosto());
                } else {
                    JOptionPane.showMessageDialog(null, "No hay adeudos");

                }
            }
        }
    }

    public void pagarCurso() {

        if (alumnos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay ningun alumno registrado");

        } else {

            for (int i = 0; i <= alumnos.size() - 1; i++) {

                Alumno alum = (Alumno) alumnos.get(i);
                Materia mate = (Materia) materias.get(i);

                if (mate.getCosto() > 0) {
                    String matricula = JOptionPane.showInputDialog(null, "Introduce la matricula del alumno ");

                    if (matricula.equals(alum.getMatricula())) {
                        String m;
                        int a, p, r;

                        a = mate.getCosto();
                        m = JOptionPane.showInputDialog(null, "¿Cuanto desea abonar?: ");
                        p = Integer.parseInt(m);

                        r = a - p;
                        mate.setCosto(r);

                        JOptionPane.showInputDialog(null, "Tu pago se ha hecho con éxito");

                    } else {

                        JOptionPane.showMessageDialog(null, "Has escrito mal la matricula, intentelo de nuevo");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No hay adeudos");

                }

            }

        }

    }

}
