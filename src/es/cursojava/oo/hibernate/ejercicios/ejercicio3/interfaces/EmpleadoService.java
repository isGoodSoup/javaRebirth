package es.cursojava.oo.hibernate.ejercicios.ejercicio3.interfaces;

import java.math.BigDecimal;
import java.util.List;

import es.cursojava.oo.hibernate.ejercicios.ejercicio3.dto.EmpleadoDTO;

public interface EmpleadoService {
	EmpleadoDTO altaEmpleado(EmpleadoDTO EmpleadoDTO);
	EmpleadoDTO actualizarSalario(String nif, BigDecimal nuevoSalario);
	EmpleadoDTO buscarPorNif(String nif);
	List<EmpleadoDTO> listarPorDepartamento(String departamento);
	List<EmpleadoDTO> listarTodos();
}
