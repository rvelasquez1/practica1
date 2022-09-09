import java.util.List;

public class Autor {
    //atributos
    String nombre;
    List<Titulo> titulos;

    //metodo  constructor por defecto
    public Autor() {

    }
   //sobrecarga de constructores
    public Autor(String nombre) {
        this.nombre = nombre;
        //sobrecarga de constructores
    }
    public Autor(String nombre,List<Titulo>titulos){
        this.nombre = nombre;
        this.titulos = titulos;
    }
}