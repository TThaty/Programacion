package HM_Actividad1;

import java.util.Objects;

public interface Persona {
	
 public static final String id = "";
 public static final String Nombre = ""; 
 public static final float IRPF = 0.20f;
 
 


public default double Sueldo (double salarioBruto, double seguridadSocial) {
	double deducciones;
	double calculoIRPF;
	double salarioNeto;
	
	deducciones = seguridadSocial * salarioBruto;
	calculoIRPF = salarioBruto * IRPF;
	salarioNeto = salarioBruto - deducciones - calculoIRPF;
	
	return salarioNeto;
}

}
