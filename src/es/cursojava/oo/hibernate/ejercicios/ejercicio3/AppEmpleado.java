package es.cursojava.oo.hibernate.ejercicios.ejercicio3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import es.cursojava.oo.hibernate.ejercicios.ejercicio3.entities.Empleado;
import es.cursojava.utils.Dexter;
import es.cursojava.utils.interfaces.Iniciable;

public class AppEmpleado implements Iniciable {

	public static void main(String[] args) {
		new AppEmpleado().init();
	}

	@Override
	public void init() {
		List<Empleado> empleados = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			Empleado emp = crearEmpleado();
			empleados.add(emp);
		}
		
	}
	
	public Empleado crearEmpleado() {
		return new Empleado(
				Dexter.toGetID(), 
				Dexter.toGetName(), 
				Dexter.toGetDepartment(), 
				new BigDecimal(Dexter.toGetSalary())
		);
	}
	
}
