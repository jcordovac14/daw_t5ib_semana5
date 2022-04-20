package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo02 {
	public static void main(String[] args) {
		//actualizar los datos d un usuario
		Usuario u = new Usuario(3, "Carli", "Toro", "u002@gmail.com", "10002","2022-03-24" , 2, 1);
		// -->jpa

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		//empezo la transaccion
		em.getTransaction().begin();
		//proceso --> actualizar en la tabla o entidad
		em.merge(u);//actualiza si existe y si no, lo inserta
		
		
		//confirmar la transaccion
		em.getTransaction().commit();
		em.close();
		
	}
}
