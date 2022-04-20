package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo01 {
	public static void main(String[] args) {
		//ingresar los valores del nuevo usuario
		
		Usuario u = new Usuario(10, "Juan", "Perez", "jperez@mail.com", "345","2000/01/15" , 1, 1);
		//grabar en la tabla -->jpa

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		//empezo la transaccion
		em.getTransaction().begin();
		//proceso --> grabar en la tabla o entidad
		em.persist(u);
		
		
		//confirmar la transaccion
		em.getTransaction().commit();
		em.close();
	}
}
