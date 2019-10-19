package br.edu.ifpb.esp.poo.iftube;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Usuario {

	private Long id;
	private String nome;
	private Calendar nascimento;
	private String email;
	private Set<Video> videos;
	
	public Usuario(String nome, String email) {
		setEmail(email);
		setNome(nome);
		setVideos(new HashSet<Video>());
	}
	
	public Usuario(
			Long id, 
			String nome, 
			String email) {
		this(nome, email);
		setId(id);
	}
	
	public Set<Video> getVideos() {
		return videos;
	}
	
	public void setVideos(Set<Video> videos) {
		this.videos = videos;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getNascimento() {
		return nascimento;
	}
	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}
	
	
	
	
	
	
	
}
