package es.cursojava.oo.hibernate.ejercicios.ejercicio1.service;

import es.cursojava.oo.hibernate.ejercicios.ejercicio1.dto.AulaDTO;
import es.cursojava.oo.hibernate.ejercicios.ejercicio1.dto.CursoDTO;
import es.cursojava.oo.hibernate.ejercicios.ejercicio1.entities.Aula;
import es.cursojava.oo.hibernate.ejercicios.ejercicio1.entities.Curso;

public class CursoService {
	private Curso curso;
	private Aula aula;
	
	public CursoService() {
		super();
		this.aula = new Aula();
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}
	
	public void validarCapacidad(CursoDTO curso) {
		if(curso.getAulaDTO().getCapacidad() < 0) {
			throw new IllegalArgumentException("La capacidad del aula debe ser mayor que 0.");
		}
	}
	
	public void validarAulaUnica(Curso curso, Aula aula) {
		if(curso.getAula() != null) {
			throw new IllegalStateException("El curso ya tiene un aula asignada.");
		}
	}
	
	public CursoDTO crearCursoConAula(CursoDTO cursoDTO, AulaDTO aulaDTO) {
		return cursoDTO = new CursoDTO(
				cursoDTO.getNombre(),
				cursoDTO.getCodigo(),
				cursoDTO.getDescripcion(),
				cursoDTO.getDuracionHoras(),
				cursoDTO.IsActivo(),
				cursoDTO.getNivel(),
				cursoDTO.getCategoria(),
				cursoDTO.getPrecio(),
				cursoDTO.getFechaInicio(),
				cursoDTO.getFechaFin(),
				cursoDTO.getFechaCreacion(),
				aulaDTO
		);
	}
	
	public void asignarAula(Long cursoID, Long aulaID) {
		this.aula.setId(aulaID);
		this.curso.setId(cursoID);
	}
}
