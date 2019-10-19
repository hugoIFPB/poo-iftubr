package br.edu.ifpb.esp.poo.iftube;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
//		Usuario u = new Usuario("Fulano", "fulano@ifpb.br");
//		Calendar c = new GregorianCalendar(2000,0,13);
//		u.setNascimento(c);
//		Set<Video> videos = u.getVideos();
//		char i32;
//		boolean b1;
//		byte bi8;
//		short s16;
//		int in32;
//		float flutuante32;
//		double flutuanteDupla64;
//		long inteiro64;
//		Character i32w;
//		Boolean b1w;
//		Byte bi8w;
//		Short s16w;
//		Integer in32w;
//		Float flutuante32w;
//		Double flutuanteDupla64w;
//		Long inteiro64w;
//		int valor = Integer.parseInt("12345");
		Map<Short, String> alunos = new HashMap<Short, String>();
		alunos.put((short)35, "qwertyu");
		alunos.put((short)37, "qwertyu");
		alunos.put((short)13, "qwertyu");
		alunos.put((short)13, "qwersdfsdfsdtyu");
		for(Short key : alunos.keySet()) {
			System.out.println(key + " - " +alunos.get(key));
		}
	}
	
}
