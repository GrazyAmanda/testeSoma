package model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

import utils.tipos.TipoCargo;

@Entity
@Table(name = "funcionario")
@SequenceGenerator(name="SEQUENCE", sequenceName="funcionario_id_seq")
public class funcionario extends BaseModel{
	
	private static final long serialVersionUID = 3190089175445263237L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQUENCE")
	private Integer id;

	
	@Column(name="nome")
	private String nome;
	
	@Column(name="tipoCargo")
	private TipoCargo tipoCargo;

	@Override
	public Integer getId() {
		
		return null;
	}

	@Override
	public void setId(Integer id) {
	}

	@Override
	public String toStringAudit() {
		return null;
	}
}
