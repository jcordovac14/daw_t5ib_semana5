package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo05 {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		//empieza la transaccion // 
		em.getTransaction().begin();
		
		//eliminar buscando el codigo
		Usuario u = em.find(Usuario.class,33);
		if (u == null) {
			System.err.println("usuario o codigo no existe");
		}else {
			em.remove(u);
			System.out.println("usuario removido");
		}
		
		
		
		
		//confirma la transaccion
		em.getTransaction().commit();
		em.close();
		
		
	}
}
