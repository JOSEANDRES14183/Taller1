public class Autor {

    private String nom;
    private  Obra [] listaObras=new Obra[5];

    public Autor(String nom,Obra [] listaObras){
        this.nom=nom;
        this.listaObras=listaObras;
    }

    public void obraMesLlarga(Obra[]listaObras){
        int obraMasLarga=0;
        String tituloObra = "";
        for(int i=0;i< listaObras.length;i++) {
            int obra = listaObras[i].getPaginas();
            if (obra > obraMasLarga) {
                obraMasLarga = obra;
                tituloObra=listaObras[i].getTitol();
            }
        }
        System.out.println("La obra mas larga es"+tituloObra);
    }


}
