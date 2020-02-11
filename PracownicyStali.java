public class PracownicyStali extends Pracownicy implements Zarzadzanie{



    @Override
    public void zwolnij(Object[] o  ) {
        int f = o.length -1;
        o[f]= null;
        System.out.println( "Zostal/a zwolniony/a");
    }


    @Override
    public void przyjmij( Object[] o  ) {
        int f = o.length-1;
        final boolean b = o[f] != new Object();
        System.out.println("pracownik zostal przyjety " );

    }




    @Override
    public void podwyzka(int x) {double y =(placa1*x/100+placa1);
    }

    private double placa1;

    public PracownicyStali(String imie,String nazwisko, int wiek,int rok, int miesiac, int dzien, double placa1) {
        super(imie,nazwisko, wiek, rok,miesiac,dzien);
        this.placa1 = placa1;
    }

    @Override
    public void pokaz(Object o  ) {

    }
}
