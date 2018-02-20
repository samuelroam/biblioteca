package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MatriculaModelo extends Conector{

	public ArrayList<Matricula> selectAll() {
		ArrayList<Matricula> matriculas = new ArrayList<Matricula>();

		try {
			Statement st = super.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from matriculas");
			while (rs.next()) {
				Matricula matricula = new Matricula();
				matricula.setId_alumno(rs.getInt("id_alumno"));
				matricula.setId_asignatura(rs.getInt("id_asignatura"));
				matricula.setFecha(rs.getDate("fecha"));

				matriculas.add(matricula);
			}
			return matriculas;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return matriculas;
	}

}
