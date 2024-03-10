import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj współczynniki równania kwadratowego (a, b, c):");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        rozwiazRownanieKwadratowe(a, b, c);


        System.out.println("Podaj argument x:");
        double x = scanner.nextDouble();

        obliczWartoscFunkcji(x);


        System.out.println("Podaj trzy liczby (x, y, z):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double z1 = scanner.nextDouble();

        porzadkujLiczby(x1, y1, z1);


        System.out.println("Czy pada deszcz? (true/false):");
        boolean czyPadaDeszcz = scanner.nextBoolean();
        System.out.println("Czy jest autobus na przystanku? (true/false):");
        boolean czyJestAutobus = scanner.nextBoolean();

        sprawdzWarunkiAtmosferyczne(czyPadaDeszcz, czyJestAutobus);

        System.out.println("Czy jest zniżka na samochód? (true/false):");
        boolean czyZnizka = scanner.nextBoolean();
        System.out.println("Czy otrzymałeś premię? (true/false):");
        boolean czyPremia = scanner.nextBoolean();

        sprawdzWarunkiZakupuSamochodu(czyZnizka, czyPremia);


        System.out.println("Wybierz operację: 1 - dodawanie, 2 - odejmowanie, 3 - iloczyn, 4 - iloraz, 5 - reszta z dzielenia");
        int wybor = scanner.nextInt();
        System.out.println("Podaj dwie liczby:");
        double liczba1 = scanner.nextDouble();
        double liczba2 = scanner.nextDouble();

        kalkulatorDzialan(wybor, liczba1, liczba2);

        scanner.close();
    }


    private static void rozwiazRownanieKwadratowe(double a, double b, double c) {
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Równanie ma dwa pierwiastki rzeczywiste: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Równanie ma jeden pierwiastek rzeczywisty: x = " + x);
        } else {
            System.out.println("Równanie nie ma pierwiastków rzeczywistych.");
        }
    }


    private static void obliczWartoscFunkcji(double x) {
        double wynik;

        if (x > 0) {
            wynik = x * x;
        } else if (x == 0) {
            wynik = 0;
        } else {
            wynik = 3 * x;
        }

        System.out.println("Wartość funkcji dla x = " + x + " wynosi: " + wynik);
    }


    private static void porzadkujLiczby(double x, double y, double z) {
        double temp;

        if (x > y) {
            temp = x;
            x = y;
            y = temp;
        }

        if (y > z) {
            temp = y;
            y = z;
            z = temp;
        }

        if (x > y) {
            temp = x;
            x = y;
            y = temp;
        }

        System.out.println("Liczby w porządku rosnącym: " + x + ", " + y + ", " + z);
    }


    private static void sprawdzWarunkiAtmosferyczne(boolean czyPadaDeszcz, boolean czyJestAutobus) {
        if (czyPadaDeszcz && czyJestAutobus) {
            System.out.println("Weź parasol, dostaniesz się na uczelnię.");
        } else if (czyPadaDeszcz && !czyJestAutobus) {
            System.out.println("Nie dostaniesz się na uczelnię.");
        } else if (!czyPadaDeszcz && czyJestAutobus) {
            System.out.println("Dostaniesz się na uczelnię, miłego dnia i pięknej pogody.");
        }
    }


    private static void sprawdzWarunkiZakupuSamochodu(boolean czyZnizka, boolean czyPremia) {
        if (!czyZnizka || czyPremia) {
            System.out.println("Możesz kupić samochód! Zniżki na samochód nie ma.");
        } else if (!czyZnizka || !czyPremia) {
            System.out.println("Zakup samochód trzeba odłożyć na później..., zniżki na samochód nie ma.");
        } else {
            System.out.println("Możesz kupić samochód!");
        }
    }

    private static void kalkulatorDzialan(int wybor, double liczba1, double liczba2) {
        double wynik = 0;

        switch (wybor) {
            case 1:
                wynik = liczba1 + liczba2;
                System.out.println("Wynik dodawania: " + wynik);
                break;
            case 2:
                wynik = liczba1 - liczba2;
                System.out.println("Wynik odejmowania: " + wynik);
                break;
            case 3:
                wynik = liczba1 * liczba2;
                System.out.println("Wynik mnożenia: " + wynik);
                break;
            case 4:
                if (liczba2 != 0) {
                    wynik = liczba1 / liczba2;
                    System.out.println("Wynik dzielenia: " + wynik);
                } else {
                    System.out.println("Nie można dzielić przez zero.");
                }
                break;
            case 5:
                if (liczba2 != 0) {
                    wynik = liczba1 % liczba2;
                    System.out.println("Reszta z dzielenia: " + wynik);
                } else {
                    System.out.println("Nie można dzielić przez zero.");
                }
                break;
            default:
                System.out.println("Niepoprawny wybór operacji.");
        }
    }
}
