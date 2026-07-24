package clase3;


class Globo {
    int volumen = 0;
    int volumen_maximo = 10;

    public void inflar() {
        volumen += 2;
    }
}



public class sentenciaWhile {
    
    public static void main(String[] args) {
        Globo globo = new Globo();

        // System.out.println(globo.volumen);
        // System.out.println(globo.volumen_maximo);

        while (globo.volumen < globo.volumen_maximo) {
            globo.inflar();
            System.out.println(globo.volumen);
        }

    }

}
