package HM_Actividad1;

public class PersonaUniversitaria implements Becario, Empleado{
	private int edad;
	private String nombre;

	@Override
	public double Sueldo(double salarioBruto, double seguridadSocial) {
		double deducciones;
		double calculoIRPF;
		double salarioNeto;
		
		deducciones = seguridadSocial * salarioBruto;
		calculoIRPF = salarioBruto * IRPF;
		salarioNeto = salarioBruto - deducciones - calculoIRPF;
		
		return salarioNeto;
	}

	public PersonaUniversitaria() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public double Sueldo(double seguridadSocial) {
		double deducciones;
		double calculoIRPF;
		double salarioNeto;
		
		deducciones = seguridadSocial * Becario.SALARIO_BRUTO;
		calculoIRPF = Becario.SALARIO_BRUTO * IRPF;
		salarioNeto = Becario.SALARIO_BRUTO - deducciones - calculoIRPF;
		
		return salarioNeto;
	}

}
