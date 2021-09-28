
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class creacionYBorracion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char respuesta;
		boolean bucle = true;
		File d1 = new File("Directorio1");
		File f1 = new File(d1, "Fichero1.txt");
		File d2 = new File(d1, "Directorio2");
		File f2 = new File(d2, "Fichero2.txt");
		File f3 = new File(d2, "Fichero3.txt");
		try {
			if(d1.mkdir()) {
				System.out.println("El fichero "+ d1.getName() + " se ha creado correctamente");
			} else {
				System.out.println("El fichero "+ d1.getName() + " NO se ha creado correctamente :(");
				if (d1.exists()) {
					System.out.println("Pero por que ya existia :)");
				}
			}
			if(f1.createNewFile()) {
				System.out.println("El fichero "+ f1.getName() + " se ha creado correctamente");
			} else {
				System.out.println("El fichero "+ f1.getName() + " NO se ha creado correctamente :(");	
				if (f1.exists()) {
					System.out.println("Pero por que ya existia :)");
				}
			}
			if(d2.mkdir()) {
				System.out.println("El fichero "+ d2.getName() + " se ha creado correctamente");
			} else {
				System.out.println("El fichero "+ d2.getName() + " NO se ha creado correctamente :(");	
				if (d2.exists()) {
					System.out.println("Pero por que ya existia :)");
				}
			}
			if(f2.createNewFile()) {
				System.out.println("El fichero "+ f2.getName() + " se ha creado correctamente");
			} else {
				System.out.println("El fichero "+ f2.getName() + " NO se ha creado correctamente :(");	
				if (f2.exists()) {
					System.out.println("Pero por que ya existia :)");
				}
			}
			if(f3.createNewFile()) {
				System.out.println("El fichero "+ f3.getName() + " se ha creado correctamente");
			} else {
				System.out.println("El fichero "+ f3.getName() + " NO se ha creado correctamente :(");	
				if (f3.exists()) {
					System.out.println("Pero por que ya existia :)");
				}
			}
			if (f3.exists()) {
				f3.delete();
				f3 = new File(d2, "FicheroNuevo");
				if(f3.createNewFile()) {
					System.out.println("El fichero "+ f3.getName() + " se ha renombrado correctamente");
				} else {
					System.out.println("El fichero "+ f3.getName() + " NO se ha renombrado correctamente :(");	
				}
			} else {
				System.out.println("El fichero no existe :(");
			}
			System.out.println("¿Esta seguro de borrar los ficheros?");
			System.out.println("Utilice el formato Y/N");
			while(bucle) {
				respuesta = sc.next().charAt(0);
				if((respuesta =='y') || (respuesta == 'Y')) {
					bucle = false;
					if (f2.delete() && f3.delete() && d2.delete() && f1.delete() && d1.delete()) {
						System.out.println("Los archivos se borraron");
					} else {
						System.out.println("Algo falló :(");
					}
				} else if ((respuesta == 'n') || (respuesta =='N')) {
					bucle = false;
				} else {
					System.out.println("No se ha introducido correctamente. Vuelva a intentarlo");
				}
			}
		} catch(IOException ioe) {
			ioe.printStackTrace();		
		}
	}
}
