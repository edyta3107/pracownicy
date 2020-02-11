import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class ZarzadzanieMain   {


    public static void main(String[] args){


        PracownicyZlecenie[]pracownicyZlecenie = new PracownicyZlecenie[3];
        pracownicyZlecenie[0] = new PracownicyZlecenie("Andrzej","Kowalski",34,2010,7,31,2500.00);
        pracownicyZlecenie[1] = new PracownicyZlecenie("Michal", "Kowalczyk",25,2019,2,25,3000.00);
        pracownicyZlecenie[2] = new PracownicyZlecenie("Ania","Labedz",30,2018,6,1,3000.00);
        for(int i = 0 ; i< pracownicyZlecenie.length; i ++) {
            System.out.println(pracownicyZlecenie[i].getImie() + " " + pracownicyZlecenie[i].getNazwisko() + " " + pracownicyZlecenie[i].getDataPrzyjecia());
            System.out.println(pracownicyZlecenie[i].getWiek());
            if (pracownicyZlecenie[i].getWiek() >= 30) {
                pracownicyZlecenie[i].podwyzka(8);
                System.out.println(pracownicyZlecenie[i].getImie());
                System.out.println(" ");
            }


        }

        PracownicyStali[] pracownicyStali = new PracownicyStali[1];
        pracownicyStali[0] = new PracownicyStali("Ola","Kwasniewska",30,2017,5,1,4.000);
        for(int i = 0 ; i < pracownicyStali.length; i++){
            System.out.println(pracownicyStali[i].getImie()+" " + pracownicyStali[i].getNazwisko());
            System.out.print(  pracownicyStali[i].getImie());pracownicyStali[i].zwolnij(pracownicyStali);
        }
        System.out.println(pracownicyStali[0]);

         pracownicyStali[0] = new PracownicyStali("ela","Kowalska",25,2020,4,1,4.000);
        for(int i = 0; i <pracownicyStali.length; i++) {
            System.out.println(pracownicyStali[i].getImie()+" " + pracownicyStali[i].getNazwisko());
            pracownicyStali[i].przyjmij(pracownicyStali);

            System.out.println(pracownicyStali.length);

            File f = new File("plik.txt");
            if (!f.exists()) {
                try {
                    f.createNewFile();
                    System.out.println("Plik zostal utworzony");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            if (f.canWrite()) {
                try {
                    FileWriter fw = new FileWriter(f, true);
                    Formatter fm = new Formatter(fw);
                    Scanner sf = new Scanner(f);
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Podaj swoje uwagi anonimowo na temat zakladu pracy wraz z data");
                    String s = sc.nextLine();
                    fm.format("%s \r\n", s);
                    System.out.println("Zapisano");
                    fm.close();
                    fw.close();
                    System.out.println("\n Zawartosc pliku: ");
                    while (sf.hasNextLine()) {
                        System.out.println(sf.nextLine());
                    }
                    sf.close();
                    sc.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }


            }


        }}}

