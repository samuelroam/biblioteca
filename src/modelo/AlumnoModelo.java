package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AlumnoModelo extends Conector{

	public Alumno getAlumno(int id_alumno) {
		try {
			PreparedStatement pst = super.conexion.prepareStatement("select * from alumnos where id = ?");
			pst.setInt(1, id_alumno);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				Alumno alumno = new Alumno();
				alumno.setId(rs.getInt("id"));
				alumno.setNombre(rs.getString("nombre"));
				alumno.setDni(rs.getString("dni"));
				alumno.setEmail(rs.getString("email"));
				
				return alumno;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
