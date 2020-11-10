public class Obra {

    private String titol;
    private String tematica;
    private int paginas;

    public Obra(String titol,String tematica, int paginas){
        this.titol=titol;
        this.tematica=tematica;
        this.paginas=paginas;
    }

    public String getTitol() {
        return titol;
    }

    public int getPaginas() {
        return paginas;
    }

    public Obra(){}

}
