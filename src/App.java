import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExample();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller empleadoContoller = new EmpleadoContoller();

        boolean result = empleadoContoller.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        System.out.println("Ingreso " + result);

        result = empleadoContoller.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        System.out.println("Ingreso " + result);
        

        System.out.println("---------------------");

        empleadoContoller.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        empleadoContoller.addEmpleado(new Empleado(2, "Juan", "Senior"));
        empleadoContoller.addEmpleado(new Empleado(3, "Andres", "Senior"));

        System.out.println(empleadoContoller.getEmpleadoById(2));

        empleadoContoller.displayEmpleados();
        System.out.println("---------------------");
        empleadoContoller.displayEmpleadosSoloNombres();
        System.out.println("---------------------");
        empleadoContoller.displayLlaves();
        System.out.println("---------------------");
        empleadoContoller.displayEmpleadosValues();

    }

    private static void runMapExample() {
        new Mapa();
    }

    private static void runEjerccios() {
        // Ejercicio 1
        System.out.println("Ejercicio 1 Anagramas");
        System.out.println(Ejercicios.areAnagrams("listen", "silent")); // true
        System.out.println(Ejercicios.areAnagrams("hello", "bello"));   // false
        System.out.println(Ejercicios.areAnagrams("triangle", "integral")); // true

        // Ejercicio 2 
        System.out.println("Ejercicio 2 Sumatoria de numeros enteros");
        int[] resultA = Ejercicios.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 5);
        if (resultA != null) {
            System.out.println("[" + resultA[0] + ", " + resultA[1] + "]"); // [1,2]
        } else {
            System.out.println("null");
        }

        int[] resultB = Ejercicios.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 10);
        System.out.println(resultB == null ? "null" : "[" + resultB[0] + ", " + resultB[1] + "]");

    }
}