package src.peliculas;

public class Pelicula{
	private int id;
	private int año;
	private String nombre;
	private String categoria;

	public Pelicula(int id, int año, String nombre, String categoria){
		this.id = id;
		this.año = año;
		this.nombre = nombre;
		this.categoria = categoria;
	}

	//get y set
	   public int getId(){
        return id;
    }

    public int getAño(){
        return año;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setAnio(int año){
        this.año = año;
    }

    public void setCategoria(String categoria){
    	this.categoria = categoria;
    }

    public String getContar(){
        String prueba = "Id: "+id+"  Categoria: "+categoria+"  Nombre de la pelicula: "+nombre+ "   Año: " +año;
        
        return prueba;
    }

} 