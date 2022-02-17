package metodos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import clases.Codestudiante;
import interfaces.Estudiante;

public class Metodos {
	
	//vector donde se va fuardando la info de cada alumno
	Vector vPrimario = new Vector();
	
	
	public void guardar (Codestudiante unEstudiante) {
		vPrimario.addElement(unEstudiante);
		
		
		
		
	}
	
	public void guardarArchivo(Codestudiante estudiante) {
		
		try {
			FileWriter fw = new FileWriter("estudiantes.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			//Escribir dentro del archivo estudiantes (fw)
			pw.print(estudiante.getNombre());
			pw.print("|"+estudiante.getApellido());
			pw.print("|"+estudiante.getId());
			pw.print("|"+estudiante.getGrado());
			pw.print("|"+estudiante.getUsuario());
			pw.print("|"+estudiante.getPassword());
			pw.print("|"+estudiante.getN1());
			pw.print("|"+estudiante.getN2());
			pw.print("|"+estudiante.getN3());
			pw.print("|"+estudiante.getN4());
			pw.close();
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null,e);
		}
	}
		
		//Diseniar tabla
		public DefaultTableModel listaEstudiantes() {
			Vector nombreColumnaVector = new Vector();
			//nombre de las cabeceras de la columna de la tabla
			nombreColumnaVector.addElement("NOMBRES");
			nombreColumnaVector.addElement("APELLIDOS");
			nombreColumnaVector.addElement("ID");
			nombreColumnaVector.addElement("CURSO");
			
			DefaultTableModel modeloTabla = new DefaultTableModel(nombreColumnaVector,0);
			
			try {
				FileReader fr = new FileReader("estudiantes.txt");
				BufferedReader br = new BufferedReader(fr);
				String d;
				
				while ((d=br.readLine())!=null) {
					StringTokenizer dato = new StringTokenizer("|");
					
					Vector x = new Vector();
					while(dato.hasMoreTokens()) {
						x.addElement(dato.nextToken());
					}
					modeloTabla.addRow(x);
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null,e);
			}
			
			return modeloTabla;
		
		
		
		
		
	}
	
	

}
