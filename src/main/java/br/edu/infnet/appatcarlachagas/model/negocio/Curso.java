package br.edu.infnet.appatcarlachagas.model.negocio;

	import javax.persistence.CascadeType;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
	import javax.persistence.OneToOne;
	import javax.persistence.Table;

	@Entity
	@Table(name ="TCurso")
	public class Curso {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String descricao;
		private String duracao;
		private String modalidade;
		@OneToOne (cascade = CascadeType.DETACH)
		@JoinColumn(name = "idInstituicao")
		private Instituicao instituicao;
		@ManyToOne
		@JoinColumn(name = "idUsuario")
		private Usuario usuario;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public Instituicao getInstituicao() {
			return instituicao;
		}
		public void setInstituicao(Instituicao instituicao) {
			this.instituicao = instituicao;
		}
		public Usuario getUsuario() {
			return usuario;
		}
		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}
		public String getDuracao() {
			return duracao;
		}
		public void setDuracao(String duracao) {
			this.duracao = duracao;
		}
		public String getModalidade() {
			return modalidade;
		}
		public void setModalidade(String modalidade) {
			this.modalidade = modalidade;
		}


	}

