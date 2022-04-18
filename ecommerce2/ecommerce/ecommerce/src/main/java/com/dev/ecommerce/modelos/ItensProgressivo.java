package com.dev.ecommerce.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "itens_progressivo")
public class ItensProgressivo {

	public ItensProgressivo() {
		super();
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ITE_PRO_SEQ")
    @SequenceGenerator(sequenceName = "itensprogressivo_seq", allocationSize = 1, name = "ITE_PRO_SEQ")
	private Long iteProId;

	@ManyToOne
	private Produto produto;
	
	@ManyToOne
	private Progressivo progressivo;


}
