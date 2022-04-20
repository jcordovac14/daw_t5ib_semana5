package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo03 {
	public static void main(String[] args) {
		//eliminar un usuario
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		//empezo la transaccion 
		em.getTransaction().begin();
		
		//eliminar un usuario 
		//forma 1: borrado logico--> solo se cambia el estado o tipo 
		
		
		//forma 1: borrado fisico-->borra 
		Usuario u = new Usuario(3, "Carli", "Toro", "u002@gmail.com", "10002","2022-03-24" , 2, 1);
		
		em.remove(u);
		
		//confirmar la transaccion
		em.getTransaction().commit();
		em.close();
	}
}
