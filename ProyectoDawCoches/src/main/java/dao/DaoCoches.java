package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexiones.Conexion;
import entidades.Coches;

public class DaoCoches {

	public DaoCoches() {
		// TODO Auto-generated constructor stub
	}

	public List<Coches> listadoCoches() throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		Conexion c = new Conexion();
		ResultSet rs = null;
		List<Coches> coches = new ArrayList<>();
		Coches coche = null;
		try {
			con = c.getConn();
			String consulta = "select * from COCHES order by precio";
			ps = con.prepareStatement(consulta);
			rs = ps.executeQuery();

			while (rs.next()) {
				 coche = new Coches();
				coche.setIdcoches(rs.getInt("idcoches"));
				coche.setModelo(rs.getString("modelo"));
				coche.setColor(rs.getString("color"));
				coche.setPrecio(rs.getDouble("precio"));
				coches.add(coche);
			}
		} catch (SQLException e) {
			throw e;
		} finally {
			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
			if (con != null)
				con.close();
		}

		return coches;

	}

	public void modificarPrecio(int idcoche, Double precioNuevo) {
		Connection con;
		PreparedStatement ps;
		Conexion c = new Conexion();

		try {
			con = c.getConn();
			String consulta = "update COCHES set precio=? where idcoches=?";
			ps = con.prepareStatement(consulta);
			ps.setDouble(1, precioNuevo);
			ps.setInt(2, idcoche);
			ps.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
