package clases;



	/*
	 * To change this license header, choose License Headers in Project Properties.
	 * To change this template file, choose Tools | Templates
	 * and open the template in the editor.
	 */

import java.io.File;
import java.util.ArrayList;


	/**
	 *
	 * @author INGESIS
	 */

public class Codestudiante {	    
	     //Zona de variables 
		private String nombre;
	    private String apellido;
	    private String id;
	    private String grado;
		private String usuario;
	    private String password;
	    private float n1,n2,n3,n4;
	    private File   FicheroEstudiante= new File("estudiantes.txt");
	    private ArrayList<Codestudiante> usuarios =new ArrayList<Codestudiante>();
	    //zona de metodos
	    
		public String getNombre() {
			return nombre;
		}
		public Codestudiante(String nombre, String apellido, String id, String grado, String usuario, String password,float n1,float n2, float n3,float n4) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.id = id;
			this.grado = grado;
			this.usuario = usuario;
			this.password = password;
			this.n1 = n1;
			this.n2 = n2;
			this.n3 = n3;
			this.n4 = n4;
		}
		public Codestudiante() {
			super();
			// TODO Auto-generated constructor stub
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getGrado() {
			return grado;
		}
		public void setGrado(String grado) {
			this.grado = grado;
		}
		public String getUsuario() {
			return usuario;
		}
		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
			
		}
		public File getFicheroEstudiante() {
			return FicheroEstudiante;
		}
		public void setFicheroEstudiante(File ficheroEstudiante) {
			FicheroEstudiante = ficheroEstudiante;
		}
		public ArrayList<Codestudiante> getUsuarios() {
			return usuarios;
		}
		public void setUsuarios(ArrayList<Codestudiante> usuarios) {
			this.usuarios = usuarios;
		}
		public float getN1() {
			return n1;
		}
		public void setN1(int n1) {
			this.n1 = n1;
		}
		public float getN2() {
			return n2;
		}
		public void setN2(int n2) {
			this.n2 = n2;
		}
		public float getN3() {
			return n3;
		}
		public void setN3(int n3) {
			this.n3 = n3;
		}
		public float getN4() {
			return n4;
		}
		public void setN4(int n4) {
			this.n4 = n4;
		}
		

}


