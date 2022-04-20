package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "tb_proveedor")
public class Proveedor {
	@Id
	@Column(name = "idprovedor")
	private int idprovedor;
	@Column(name = "nombre_rs")
	private String nombreProv;
	@Column(name = "telefono")
	private String telefono;
	@Column(name = "email")
	private String email;
	
}
