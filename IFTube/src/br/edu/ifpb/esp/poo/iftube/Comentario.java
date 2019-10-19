package br.edu.ifpb.esp.poo.iftube;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Comentario {

	private String texto;
	private Calendar data;
	private Usuario usuario;
	private Set<Comentario> respostas;
	
	public Comentario() {
		respostas = new HashSet<Comentario>();
	}
	
	public Set<Comentario> getRespostas() {
		return respostas;
	}
	
	public void setRespostas(Set<Comentario> respostas) {
		this.respostas = respostas;
	}
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
}
