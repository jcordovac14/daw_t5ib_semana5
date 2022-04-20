package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "tb_productos")
public class Producto {
	@Id
	@Column(name = "id_prod")
	private String codigo;
	@Column(name = "des_prod")
	private String descripcion;
	@Column(name = "stk_prod")
	private int stock;
	@Column(name = "pre_prod")
	private double precio;
	
	@ManyToOne
	@JoinColumn (name = "idcategoria" , insertable = false , updatable = false )
	private Categoria categoria; // solo me sirve para el listado join 
	
	private int idcategoria; // sirve para grabar un nuevo producto
	
	@Column(name = "est_prod")
	private int estado;
	
	
	@ManyToOne
	@JoinColumn (name = "idprovedor" , insertable = false , updatable = false )
	private Proveedor proveedor;
	
	@Column(name = "idprovedor")
	private int idproveedor;
}
