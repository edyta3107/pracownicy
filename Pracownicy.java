import java.time.LocalDate;
import java.util.Date;

public class Pracownicy  {




    private String imie;
    private int wiek;
    private String nazwisko;
    private LocalDate dataPrzyjecia;
    private double  placa;

    public Pracownicy(String imie,String nazwisko,int wiek,int rok,int miesiac,int dzien){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        dataPrzyjecia = LocalDate.of( rok,miesiac,dzien );

    }

    public LocalDate getDataPrzyjecia() {
        return dataPrzyjecia;
    }

    public int getWiek() {
        return wiek;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }



    }

