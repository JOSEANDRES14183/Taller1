public class Autor {

    private String nom;
    private  Obra [] listaObras=new Obra[5];

    public Autor(String nom,Obra [] listaObras){
        this.nom=nom;
        this.listaObras=listaObras;
    }

    public Obra obraMesLlarga(Obra[]listaObras){
        int obraMasLarga=0;
        Obra obra=new Obra();
        String tituloObra = "";
        for(int i=0;i< listaObras.length;i++) {
            if (listaObras[i].getPaginas() > obraMasLarga) {
                obraMasLarga = listaObras[i].getPaginas();
                obra=listaObras[i];
            }
        }
        return obra;
    }


}
