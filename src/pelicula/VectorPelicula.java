package src.peliculas;

import src.tienda.*;

public class VectorPelicula{
	private Pelicula[] pelicula = new Pelicula[50];
	private int siguientePelicula;

	public VectorPelicula(){
		siguientePelicula = 1;

	}

	// agregar peliculas
	public void agregarPelicula(int anio, String nombre, String categoria){
		if(siguientePelicula > 50){
			System.out.println("Limite de peliculas alcanzado");
		}
		else{
			pelicula[(siguientePelicula-1)] = new Pelicula(siguientePelicula, anio, nombre, categoria);
		}
		siguientePelicula++;

	}

	public void agregarPelicula(){
		int año = IngresoDatos.getEntero("Ingrese el año: ",false);
		String nombre = IngresoDatos.getTexto("Ingrese el nombre de la pelicula: ");
		String categoria = IngresoDatos.getTexto("Ingrese la categoria de la pelicula: ");
		System.out.println("");
		agregarPelicula(año, nombre, categoria);

	}

    //Mostrar peliculas
	public void mostrarPeliculas(){
		System.out.println("\n\n Peliculas");
		for (int i = 0; i <(siguientePelicula-1); i++){
			System.out.println("-"+i+") "+((Pelicula) pelicula[i]).getContar());

		}

		System.out.println("\n\n");
	}
    //Ordenamiento
    public void ordenarPorNombreP(boolean ascendente){
        boolean cambio = true;

        for (int i = 1; i < (siguientePelicula-1); i++) {
            for (int j = 0; j < (siguientePelicula-1-i); j++) {
                if (ascendente)
                    cambio= (pelicula[j].getNombre().compareTo(pelicula[j+1].getNombre()) > 0 );
                else 
                    cambio= (pelicula[j].getNombre().compareTo(pelicula[j+1].getNombre()) < 0 );

                if(cambio ){
                    
                    Pelicula aux = pelicula[j];
                    pelicula[j] = pelicula[j+1];
                    pelicula[j+1]= aux;
                }
            }
        }

    }

}