package model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

import utils.tipos.TipoOperacao;;

@Entity
@Table(name = "extrato")
@SequenceGenerator(name="SEQUENCE", sequenceName="extrato_id_seq")
public class extrato extends BaseModel{
	
	private static final long serialVersionUID = 3190089175445263237L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQUENCE")
	private Integer id;

	
	
	@Column(name="tipoOperacao")
	private TipoOperacao tipoOperacao;
	
	@Column(name="valor")
	private Integer valor;

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
