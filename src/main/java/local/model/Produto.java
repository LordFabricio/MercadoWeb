package local.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Produto{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "produto_id", unique = true, nullable = false)
	private int produto_id;
	
	@Column(nullable=false)
	private String nome;
	
	@Column(name="codigo_de_barra")
	private String codigoDeBarra;
	
	@Column(nullable=false)
	private int estoque;
	
	@Column(name="valor_un", nullable=false, columnDefinition="Decimal(9,2)")
	private double valorUn;

	@JsonIgnore
	@OneToMany(mappedBy = "produto")
	private List<Cupom> cupom;

	public int getProduto_id() {
		return produto_id;
	}

	public void setProduto_id(int produto_id) {
		this.produto_id = produto_id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoDeBarra() {
		return codigoDeBarra;
	}

	public void setCodigoDeBarra(String codigoDeBarra) {
		this.codigoDeBarra = codigoDeBarra;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public double getValorUn() {
		return valorUn;
	}

	public void setValorUn(double valorUn) {
		this.valorUn = valorUn;
	}

	public List<Cupom> getCupom() {
		return cupom;
	}

	public void setCupom(List<Cupom> cupom) {
		this.cupom = cupom;
	}

	
	
	
}
