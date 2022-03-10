package test;

import java.sql.SQLException;
import java.util.List;

import dao.DaoCoches;
import entidades.Coches;

public class TestTabla {

	public TestTabla() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		DaoCoches dao = new DaoCoches();

		try {
			List<Coches> coches = dao.listadoCoches();
			for (Coches coches2 : coches) {
				System.out.println(coches2.getModelo());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
