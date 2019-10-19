package br.edu.ifpb.esp.poo.iftube;

import java.util.ArrayList;
import java.util.Set;

public class Video {

	private Long id;
	private String titulo;
	private ArrayList<Comentario> comentarios;
	private Set<Usuario> curtiu;
	private Set<Usuario> naoCurtiu;
	
	public Set<Usuario> getCurtiu() {
		return curtiu;
	}
	
	public Set<Usuario> getNaoCurtiu() {
		return naoCurtiu;
	}
	
	public void setCurtiu(Set<Usuario> curtiu) {
		this.curtiu = curtiu;
	}
	
	public void setNaoCurtiu(Set<Usuario> naoCurtiu) {
		this.naoCurtiu = naoCurtiu;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public ArrayList<Comentario> getComentarios() {
		return comentarios;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setComentarios(ArrayList<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	
	
}
