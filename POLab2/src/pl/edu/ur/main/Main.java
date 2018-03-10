package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author marcin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7
        
        Scanner scanner = new Scanner(System.in);
        int zad;
        System.out.println("1 - zadanie 3");
        System.out.println("2 - zadanie 4");
        System.out.println("3 - zadanie 6");
        System.out.println("4 - zadanie 7");
        System.out.print("wybierz nr zadania: ");
        zad = scanner.nextInt();
        
        switch(zad){
            case 1: {
                    int tablica[] = new int[10];
                    int sort;

                    for (int i = 0; i < 10; i++){
                        //tablica[i] = i+1;
                        System.out.print("podaj liczbe " + (i+1) + ": ");
                        tablica[i] = scanner.nextInt();
                    }

                    System.out.println("1 - wyświetlić od poierwszego do ostaniego indexu");
                    System.out.println("2 - wyświetlić od ostaniego do poierwszego indexu");
                    System.out.println("3 - wyświetlić tylko parzyste indeksy");
                    System.out.println("4 - wyświetlić tylko nieparzyste indeksy");
                    System.out.print("wybierz rodzaj sortowania: ");
                    sort = scanner.nextInt();

                    switch(sort){
                        case 1: {
                            //od 1-10
                            for (int i = 0; i < 10; i++){
                            System.out.println(i + ": " + tablica[i]);
                            }
                            break;
                        }
                        case 2: {
                            //od 10-1
                            for (int i = 9; i >= 0; i--){
                            System.out.println(Math.abs(i-9) +": "+ tablica[i]);
                            }
                            break;
                        }
                        case 3: {
                            //parzyste
                            for (int i = 0; i < 10; i++){
                                if(i%2 == 0)
                                    System.out.println(i + ": " + tablica[i]);
                            }
                            break;
                        }
                        case 4: {
                            //nieparzyste
                            for (int i = 0; i < 10; i++){
                                if(i%2 != 0)
                                    System.out.println(i + ": " + tablica[i]);
                            }
                            break;
                        }
                        default: System.out.println("niepoprawne dane");
                            break;
                    }
                
                break;
            }
            case 2: {
                int tab[] = new int[10];
                int sort;
                double wynik=0;

                    for (int i = 0; i < 10; i++){
                        //tab[i] = i+1;
                        System.out.print("podaj liczbe " + (i+1) + ": ");
                        tab[i] = scanner.nextInt();
                    }
                    System.out.println("1 - oblicz sumę elementów tablicy");
                    System.out.println("2 - oblicz iloczyn elementów tablicy");
                    System.out.println("3 - wyznacz wartość średnią");
                    System.out.println("4 - wyznacz wartość minimalną");
                    System.out.println("5 - wyznacz wartość maksymalą");
                    System.out.print("wybierz algorytm: ");
                    sort = scanner.nextInt();
                    switch(sort){
                        case 1: {
                            //oblicz sumę elementów tablicy
                            for (int i = 0; i < 10; i++){
                                wynik += tab[i];
                            }
                            System.out.println("suma tablicy: " + wynik);
                            break;
                        }
                        case 2: {
                            //oblicz iloczyn elementów tablicy
                            wynik=1;
                            for (int i = 0; i < 10; i++){
                                wynik *= tab[i];
                            }
                            System.out.println("suma tablicy: " + wynik);
                            break;
                        }
                        case 3: {
                            //średnia wartość
                            for (int i = 0; i < 10; i++){
                                wynik += tab[i];
                            }
                            wynik = wynik/10;
                            System.out.println("suma tablicy: " + wynik);
                            break;
                        }
                        case 4: {
                            //minimalna
                            wynik = tab[0];
                            for (int i=1; i<10; i++) {
                                if (wynik > tab[i]) {
                                wynik = tab[i];
                                }
                            }
                            System.out.println("min tablicy: " + wynik);
                            
                            break;
                            
                        }
                        case 5: {
                            //maksymalna
                            wynik = tab[0];
                            for (int i=1; i<10; i++) {
                                if (wynik < tab[i]) {
                                wynik = tab[i];
                                }
                            }
                            System.out.println("min tablicy: " + wynik);
                            break;
                        }
                        default: System.out.println("niepoprawne dane");
                            break;
                    }
                    
                    
                break;
            }
            case 3: {
                int a=1;
                while(a > 0){
                    System.out.print("podaj liczbe całkowitą: ");
                    a = scanner.nextInt();
                }

                break;
            }
            case 4: {
                int n;
                System.out.print("ile elementów chcesz wprowadzić? ");
                n = scanner.nextInt();
                int tab[] = new int[n];
                
                    for (int i = 0; i < n; i++){
                        System.out.print("podaj liczbe " + (i+1) + ": ");
                        tab[i] = scanner.nextInt();
                    }
                    
                    for( int i = 0; i < n; i++ )
                    {
                        for( int j = 0; j < n - 1; j++ )
                        {
                            if( tab[ j ] > tab[ j + 1 ] ){
                                //swap( tab[ j ], tab[ j + 1 ] );
                                int temp = tab[j];
                                tab[j] = tab[j+1];
                                tab[j+1] = temp;
                            }
                        }
                    }
                    for (int i = 0; i < n; i++){
                            System.out.print(tab[i] + "; ");
                            }
                    
                    
                break;
            }
            default: System.out.println("nie ma takiego zadania");
                break;
        }
        
    }
    
}
