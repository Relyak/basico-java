package com.neoris.primer_proyecto.controlador;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neoris.primer_proyecto.modelo.Paquete;
import com.neoris.primer_proyecto.modelo.Sucursales;

//le decimos con esta etiqueta que es un controlador
@RestController
public class HomeControl {
	private Scanner sc = new Scanner(System.in);
	private static ArrayList<Sucursales> lisSu = new ArrayList<Sucursales>();
	private static ArrayList<Paquete> listaPaq = new ArrayList<Paquete>();
	private int referencia=0;
	private double precio;
	String a="";

	// aqui le pasamos el path
	@GetMapping("/")
	public void mostrar() {
		llenarSu();
		enviarPaquete();
		
	}
	

	private void llenarSu() {
		lisSu.add(new Sucursales((referencia+=1), "Calle callerina callota", "Madrid"));
		lisSu.add(new Sucursales((referencia+=1), "Rua rua ruinha", "Lisboa"));
	}

	public void enviarPaquete() {
		System.out.println("Dime la sucursal que recogerá tu paquete: ");
		String suc = "";
		while (!suc.equalsIgnoreCase("SALIR")) {
			System.out.println("Sucursales disponibles \n" + "ES\nPT\n" + "SALIR");
			suc = sc.nextLine();

			switch (suc) {
			case "ES":
				System.out.println("Has seleccionado la sucursal ES");
				enviarPaquete("ES");
				break;
			case "PT":
				System.out.println("Has seleccionado la sucursal PT");
				enviarPaquete("PT");
				break;
			case "SALIR":
				System.out.println("Hasta la próxima.");
				break;
			default:
				System.out.println("Seleccione una sucursal válida.");
				break;
			}
		}

	}

	private void enviarPaquete(String suc) {
		switch (suc) {
		case "ES":

			listaPaq.add(new Paquete((referencia+=1), "41414S", "alta", 3.2));
			listaPaq.add(new Paquete((referencia+=1), "41414S", "muy alta", 1));
			for (Paquete p : listaPaq) {
				precio = 0;
				if (p.getPrioridad().equalsIgnoreCase("alta")) {

					precio += 10;
					precio += p.getPeso() * 1;
					a="";
					System.out.printf(
							"Recibo: \n NumeroSucursal: %d Dirección: %S Ciudad: %S Referencia: %d Dni: %S Peso: %.2f Precio a pagar: %.2f",
							lisSu.get(0).getNumSu(), lisSu.get(0).getDireccion(), lisSu.get(0).getCiudad(),
							p.getNumeroRef(), p.getDni(), p.getPeso(), precio);
				}
				if (p.getPrioridad().equalsIgnoreCase("muy alta")) {

					precio += 20;
					precio += p.getPeso() * 1;
					System.out.printf(
							"Recibo: \n NumeroSucursal: %d Dirección: %S Ciudad: %S Referencia: %d Dni: %S Peso: %.2f Precio a pagar: %.2f",
							lisSu.get(1).getNumSu(), lisSu.get(1).getDireccion(), lisSu.get(1).getCiudad(),
							p.getNumeroRef(), p.getDni(), p.getPeso(), precio);
				}
			}
			break;
		case "PT":

			listaPaq.add(new Paquete((referencia+1), "222A", "alta", 3.2));
			listaPaq.add(new Paquete((referencia+1), "4555S", "muy alta", 1));
			for (Paquete p : listaPaq) {
				precio = 0;
				if (p.getPrioridad().equalsIgnoreCase("alta")) {

					precio += 10;
					precio += p.getPeso() * 1;
					System.out.printf(
							"Recibo: \n NumeroSucursal: %d Dirección: %S Ciudad: %S Referencia: %d Dni: %S Peso: %.2f Precio a pagar: %.2f",
							lisSu.get(0).getNumSu(), lisSu.get(0).getDireccion(), lisSu.get(0).getCiudad(),
							p.getNumeroRef(), p.getDni(), p.getPeso(), precio);
				}
				if (p.getPrioridad().equalsIgnoreCase("muy alta")) {

					precio += 20;
					precio += p.getPeso() * 1;
					System.out.printf(
							"Recibo: \n NumeroSucursal: %d Dirección: %S Ciudad: %S Referencia: %d Dni: %S Peso: %.2f Precio a pagar: %.2f",
							lisSu.get(1).getNumSu(), lisSu.get(1).getDireccion(), lisSu.get(1).getCiudad(),
							p.getNumeroRef(), p.getDni(), p.getPeso(), precio);
				}
			}
			break;

		}

	}
}
