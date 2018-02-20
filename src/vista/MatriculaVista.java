package vista;

import java.util.ArrayList;
import java.util.Iterator;

import modelo.Alumno;
import modelo.AlumnoModelo;
import modelo.Asignatura;
import modelo.AsignaturaModelo;
import modelo.Matricula;

public class MatriculaVista {

	public void mostrarMatriculas(ArrayList<Matricula> matriculas){
		Iterator<Matricula> i = matriculas.iterator();
		while(i.hasNext()){
			Matricula matricula = i.next();
			mostrarMatricula(matricula);
		}
		
	}
	
	public void mostrarMatricula(Matricula matricula){
		//conseguir la info de asignatura y alumno
		AsignaturaModelo asignaturaModelo = new AsignaturaModelo();
		Asignatura asignatura = asignaturaModelo.getAsignatura(matricula.getId_asignatura());
		AlumnoModelo alumnoModelo = new AlumnoModelo();
		Alumno alumno = alumnoModelo.getAlumno(matricula.getId_alumno());
		
		System.out.println(alumno.getNombre() + " : " + alumno.getDni() + " : " + asignatura.getNombre() + " : "
				+ asignatura.getHoras() + " : " + matricula.getFecha());
	}
}
