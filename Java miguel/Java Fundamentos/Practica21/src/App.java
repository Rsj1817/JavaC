public class App {
    public static void main(String[] args) throws Exception {
    
    Libro l1 = new Libro("MEX34","El principito","Jose Jose",234);
    Libro l2 = new Libro("COL456","Mala mano","Luis Serio",12);
    Libro l3 = new Libro("BR345","Un mosutro","Derick Lagunes",980);

    Libro[] libros = {l1,l2,l3};

    Libro mayorPaginas = l1;
    
    

    for (Libro libro : libros) {
        System.out.println(libro.toString());

        if(libro.getNumPaginas() > mayorPaginas.getNumPaginas()){
            mayorPaginas=libro;
        }
        
    }
    System.out.println("El libro con mas paginas es: " + mayorPaginas.getTitulo());

    




    }
}
