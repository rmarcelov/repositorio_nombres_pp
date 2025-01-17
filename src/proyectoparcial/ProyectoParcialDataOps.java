package proyectoparcial;
import java.util.Scanner;
public class ProyectoParcialDataOps {
  //método de la clase  
  public static void main(String[] args) {
     //declarar variables
     String empleado;
     double hora_trabajada,tarifa_hora,sueldo_bruto, descuento, sueldo_neto;
     //crear un objeto de lectura de datos
     Scanner lectura=new Scanner(System.in);
     //entrada de datos
     System.out.println("Ingresar nombre del empleado:");
     empleado=lectura.next();
     System.out.println("Ingreso horas trabajadas");
     hora_trabajada=lectura.nextDouble();
     System.out.println("Ingrese tarifa por hora");
     tarifa_hora=lectura.nextDouble();
     //proceso de datos
     //ahorrom=ingreso-gasto;
     //ahorroa=ahorrom*12;
     sueldo_bruto = hora_trabajada * tarifa_hora;
     descuento = sueldo_bruto * 0.13;
     sueldo_neto = sueldo_bruto - descuento;
     //salida de datos
      System.out.println("Cambio alteracion de Scrip 16/01/2025");
     System.out.println("Resultados de la Operacion para Practica DataOps");
     System.out.println("Sueldo Bruto: "+sueldo_bruto);
     System.out.println("Descuento: "+descuento);
     System.out.println("Sueldo Neto: "+sueldo_neto);
  }    
}
