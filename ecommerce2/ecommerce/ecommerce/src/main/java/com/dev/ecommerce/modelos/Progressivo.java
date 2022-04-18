package com.dev.ecommerce.modelos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "progressivo")
public class Progressivo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRO_SEQ")
    @SequenceGenerator(sequenceName = "progressivo_seq", allocationSize = 1, name = "PRO_SEQ")
	private Long progressivoId;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date progDataCadastro = new Date();

	private String progNome;
	
	private int progQuantidade;
	private float progDesconto;

}
