package scholar;

public class Scholar {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.nombre = "Jesús ";
        empleado1.apellido = "Díaz";
        empleado1.genero = "Masculino";
        empleado1.fecha_nacimiento = "2001/09/07";
        empleado1.tipo_sangre = "RH O+";
        empleado1.nacionalidad = "Colombiano";
        empleado1.identificacion = "1043434051";
        empleado1.telefono = "3046791685";
        empleado1.profesion = "Estudiante";
        empleado1.direccion = "Cll. 100# 42F-100";
        empleado1.correo_electronico = "jesusdavid3608@gmail.com";
        empleado1.calcEdad;
        System.out.println("Nombre: " + empleado1.nombre + empleado1.apellido);
        System.out.println("Género: " + empleado1.genero);
        System.out.println("Fecha de nacimiento: " + empleado1.fecha_nacimiento);
        System.out.println("Tipo de sangre: " + empleado1.tipo_sangre);
        System.out.println("Nacionalidad: " + empleado1.nacionalidad);
        System.out.println("Documento de identidad: " + empleado1.identificacion);
        System.out.println("Teléfono: " + empleado1.telefono);
        System.out.println("Drofesión: " + empleado1.profesion);
        System.out.println("Direccion: " + empleado1.direccion);
        System.out.println("Correo electrónico: " + empleado1.direccion);
        System.out.println("Fecha de nacimiento: " + empleado1.calcEdad);

    }

}
