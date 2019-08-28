package scholar;

public class Scholar {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.nombre = "Jesús ";
        empleado1.apellido = "Díaz ";
        empleado1.fecha_nacimiento = "07/09/2001";
        empleado1.tipo_sangre = "RH O+";
        empleado1.nacionalidad = "Colombiano";
        empleado1.identificacion = "1043434051";
        empleado1.telefono = "3046791685";
        empleado1.profesion = "Estudiante";
        empleado1.direccion = "Cll. 100# 42F-100";
        empleado1.correo_electronico = "jesusdavid3608@gmail.com";
        System.out.println("El empleado se llama: " + empleado1.nombre + empleado1.apellido);
        System.out.println("El génro del empleado es: " + empleado1.genero);
        System.out.println("El empleado nació el: " + empleado1.fecha_nacimiento);
        System.out.println("El tipo de sangre el empleado es: " + empleado1.tipo_sangre);
        System.out.println("La nacionalidad del empleado es: " + empleado1.nacionalidad);
        System.out.println("Documento del empleado: " + empleado1.identificacion);
        System.out.println("Teléfono del empleado:" + empleado1.telefono);
        System.out.println("La profesión del empleado es: " + empleado1.profesion);
        System.out.println("La direccion del empleado es: " + empleado1.direccion);
        System.out.println("El correo electronico del empleado es: " + empleado1.direccion);

        
        
        
        
        
    }

}
