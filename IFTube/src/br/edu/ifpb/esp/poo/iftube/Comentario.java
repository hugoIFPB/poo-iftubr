package br.edu.ifpb.esp.poo.iftube;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Comentario {

	private String texto;
	private Calendar data;
	private Usuario usuario;
	private Map<Calendar, Comentario> respostas;
	
	public Comentario() {
		respostas = new HashMap<Calendar, Comentario>();
	}
	
	public Map<Calendar, Comentario> getRespostas() {
		return respostas;
	}
	
	public void setRespostas(Map<Calendar, Comentario> respostas) {
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
