import java.util.List;

public class Categoria {

       //atributos
        String nombre;
        List<Titulo>titulos;
        Categoria supercategoria;


        //metodo constructor por defecto
         public Categoria(){

         }

     //sobrecarga de constructor
     public Categoria(String nombre){
          this.nombre = nombre;
     }

}
