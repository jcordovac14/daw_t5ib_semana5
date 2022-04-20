package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Usuario;

public class Demo06 {
	public static void main(String[] args) {
		
		//LISTADO DE USUARIOS
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		//inicia la transaccion
		//em.getTransaction().begin();
		//solo cuando se cambia o modifica, sino no es necesario, por ejemplo si es listado
		//confirma la transaccion
		//em.getTransaction().commit();
		
		//select * from tb_usuarios 
		TypedQuery<Usuario> consulta =  em.createQuery("select a from Usuario a ", Usuario.class);
		List<Usuario> lstUsuario = consulta.getResultList();
		
		for (Usuario u : lstUsuario) {
			System.out.println(u);
		}
		
		em.close();
	}
}
