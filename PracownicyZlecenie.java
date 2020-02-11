public class PracownicyZlecenie extends Pracownicy implements Zarzadzanie  {



    @Override
    public void zwolnij(Object[] o  ) {
        int f = o.length -1;
        o[f]= null;
        System.out.println(o + "zostal/a zwolniona");
    }


    @Override
    public void przyjmij( Object[] o  ) {
        int f = o.length-1;
        final boolean b = o[f] != new Object();
        System.out.println("pracownik zostal przyjety " );



    }


    @Override
    public void podwyzka(int x) {double y =(placa2 + placa2* x/100);
        System.out.println(y);
    }

    @Override
    public void pokaz(Object o){}


    PracownicyZlecenie(String imie, String nazwisko, int wiek, int rok, int miesiac, int dzien, double placa2 ){
        super( imie, nazwisko, wiek, rok, miesiac, dzien);
        this.placa2= placa2;
     }


    private double placa2;
}
