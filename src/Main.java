import java.util.ArrayList;
import java.util.List;

public class Main {
    public static String nombre;

    public static void main(String[] args) {
        //instanciamos un objeto del tipo Autor


        Autor JoseBarrientos =  new Autor ( nombre="Jose Barrientos" );
        Autor MarioBautista  = new Autor( nombre="Mario Bautista");

        //definiendo una lista de autores
        List<Autor> autores = new ArrayList<>();
        autores.add(JoseBarrientos);
        autores.add(MarioBautista);

        //instanciamos objeto del tipo categoria
        Categoria java = new Categoria( nombre="Java");
        Categoria programacion = new Categoria( nombre="Programacion");

        //definimos una lista de categorias
        List<Categoria> categorias = new ArrayList<>();
        categorias.add(java);
        categorias.add(programacion);



        //instanciar un objeto del tipo Titulo
        Titulo titulo = new Titulo();
        titulo.titulo = "Programacion orientada a Objetos";
        titulo.edicion = "Segunda Edicion";
        titulo.ISBN = "ISBN252569";
        titulo.autores = autores;
        titulo.categorias = categorias;

    }
}