
import javax.swing.JOptionPane;

public class Principal {

    //creando bandera
    public static Boolean bandera = true;
    public static Boolean bandera2 = true;
    public static int i1;

    public static void main(String[] args) {

        //creando objetos
        Metodos obj = new Metodos();

        String opc2, opc1;
        do {//inicio del primer do while

            opc1 = JOptionPane.showInputDialog(null, "********SISTEMA ESCOLAR******* \n[1]Alta \n"
                    + "[2]Cobro\n[3]Buscar\n[4]Salir\n ¿Que desea hacer?");

            i1 = Integer.parseInt(opc1);

            switch (i1) {
                case 1:
                    //ALta de alumno,calificaciones y profesores
                    do { //inicio del segundo do while

                        opc2 = JOptionPane.showInputDialog(null, "***Sistema Escolar*** \n[1]Alta de alumno \n"
                                + "[2]Alta cursos\n[3]Alta profesor\n[4]Subir calificaciones\n[5]Regresar\n¿Que desea hacer?");

                        int i = Integer.parseInt(opc2);

                        switch (i) {
                            case 1:
                                //alta de alumnos

                                String opc5;
                                int n;

                                //declarando menu para elegir que queremos hacer
                                opc5 = JOptionPane.showInputDialog(null, "¿Qué deseas hacer?\n[1]Agregar alumno automático \n"
                                        + "[2]Agregar alumno manual\n" + "[3]Mostrar alumnos\n" + "[4]Regresar");
                                n = Integer.parseInt(opc5);
                                if (n == 1) {
                                    //llamar metodo de llenado de alumno automatico
                                    obj.capturarAlumnoAuto();

                                } else if (n == 2) {
                                    //Si elije la opción numero 2 capturara el alumno manual
                                    obj.capturaDatosAlumno();

                                    //Seccion para ingresar el curso que desea tomar
                                    boolean b = true;
                                    String opc6;
                                    int m;
                                    do {
                                        opc6 = JOptionPane.showInputDialog(null, "¿QUE CURSO DESEA TOMAR?\n[1]Ingresar curso \n"
                                                + "[2]Ver cursos\n" + "[3]Regresar");
                                        m = Integer.parseInt(opc6);

                                        switch (m) {
                                            case 1:
                                                //Capturar curso por matricula
                                                obj.capturarCurso();
                                                b = false;
                                                break;
                                            case 2:
                                                //Ver cursos
                                                obj.verCursos();
                                                break;
                                            case 3:
                                                //regresar
                                                b = false;
                                                break;

                                            default:
                                                b = true;
                                                JOptionPane.showMessageDialog(null, "Opcion no valida");
                                                break;

                                        }
                                    } while (b == true);

                                } else if (n == 3) {
                                    //llamar al metodo para ver si alumno esta vacio sino mostrar los datos de alumno
                                    obj.verSiVacioAlumno();
                                } else if (n == 4) {
                                    bandera = true;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                                }
                                bandera = true;

                                break;
                            case 2:
                                //alta de materia
                                String opc4;
                                int m;

                                //declarando menu para elegir que queremos hacer
                                opc4 = JOptionPane.showInputDialog(null, "¿Qué deseas hacer?\n[1]Agregar curso automático \n"
                                        + "[2]Agregar curso manual\n" + "[3]Mostrar datos de cursos\n" + "[4]Regresar");
                                m = Integer.parseInt(opc4);
                                if (m == 1) {
                                    //llamar metodo de llenado de materia automatico
                                    obj.capturarMateriaAuto();
                                } else if (m == 2) {
                                    //Si elije la opción numero 2 capturara la materia en manual
                                    obj.CapturarMateria();
                                } else if (m == 3) {
                                    //Llamar al metodo para ver si materia esta vacio sino, puede mostrar las materias
                                    obj.verSiVacioMateria();
                                } else if (m == 4) {
                                    bandera = true;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                                }
                                bandera = true;

                                break;
                            case 3:
                                //alta de profesor
                                String opc3;
                                int j;

                                //declarando menu para elegir que queremos hacer
                                opc3 = JOptionPane.showInputDialog(null, "¿Qué deseas hacer?\n[1]Agregar profesor automático \n"
                                        + "[2]Agregar profesor manual\n" + "[3]Mostrar profesores\n" + "[4]Regresar");
                                j = Integer.parseInt(opc3);
                                if (j == 1) {
                                    //llamar metodo de llenado de profesor automatico
                                    obj.capturarProfesorAuto();
                                } else if (j == 2) {
                                    //Si elije la opción numero 2 capturara el profesor
                                    obj.capturarProfesor();
                                } else if (j == 3) {
                                    //para ver si esta vacio el profesor mandar un mensaje de que esta vacio sino, muestra los profesores
                                    //registrados 
                                    obj.verSiVacioProfesor();
                                } else if (j == 4) {
                                    //Regresar
                                    bandera = true;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                                }

                                bandera = true;

                                break;
                            case 4:
                              //Subir calificaciones
                               obj.subirCalificacionAlumno();
                                
                                bandera=true;
                                
                                break;
                            case 5:
                                //Regresar
                                bandera = false;
                                
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcion no valida,Escriba una opcion válida");

                                break;
                        }

                    } while (bandera == true); //fin del primer do while
                    bandera2 = true;
                    //fin del primer case donde va el segundo JoptionPane
                    break;

                case 2:
                    //cobro

                    String opc7;
                    int c;
                    boolean bandera3 = true;
                    do {
                        opc7 = JOptionPane.showInputDialog(null, "****COBRO****\n[1]Ver adeudos\n[2]Pagar\n"
                                + "[3]Regresar");

                        c = Integer.parseInt(opc7);
                        if (c == 1) {
                            //ver adeudos
                            obj.verAdeudos();
                            bandera3 = true;
                        } else if (c == 2) {
                            //cobrar
                            obj.pagarCurso();
                            bandera3 = true;

                        } else if (c == 3) {
                            bandera3 = false;
                        } else {

                            JOptionPane.showMessageDialog(null, "Opcion no valida");
                        }
                    } while (bandera3 == true);
                    bandera2 = true;

                    break;
                case 3:
                    //Buscar
                    String opc6;
                    int l;

                    opc6 = JOptionPane.showInputDialog(null, "****BUSQUEDA****\n[1]Para buscar alumno\n[2]Para buscar cursos\n"
                            + "[3]Para buscar profesor\n[4]Regresar");

                    l = Integer.parseInt(opc6);
                    if (l == 1) {
                        //Buscar alumno
                        obj.VacioAlumno();

                    } else if (l == 2) {
                        //buscar materia
                        obj.VacioMateria();

                    } else if (l == 3) {
                        //buscar Profesor
                        obj.VacioProfesor();

                    } else if (l == 4) {
                        bandera2 = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Opcion no valida");
                    }
                    bandera2 = true;

                    break;
                case 4:
                    //Salir
                    if (i1 == 4) {
                        JOptionPane.showMessageDialog(null, "Has salido correctamente");
                        bandera2 = false;
                    }

                default:
                    if (i1 != 4) {
                        JOptionPane.showMessageDialog(null, "Opcion no valida,Escriba una opcion válida");
                        bandera2 = true;
                    }

                    break;
            }

        } while (bandera2 == true);//fin del segundo do while

        //Para poder dar de alta un alumno se necesita una materia en el sistema
        //Para poder dar de alta una materia, se necesita un profesor en el sistema
        //Después podremos dar de alta un alumno
    }

}
