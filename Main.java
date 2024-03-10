import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            System.out.println("1. " + pokazImieIWiek());

            Scanner skaner = new Scanner(System.in);

            System.out.print("Podaj pierwszą liczbę: ");
            double liczba1 = skaner.nextDouble();
            System.out.print("Podaj drugą liczbę: ");
            double liczba2 = skaner.nextDouble();

            operacjeMatematyczne(liczba1, liczba2);

            System.out.print("Podaj liczbę do sprawdzenia parzystości: ");
            int liczbaParzysta = skaner.nextInt();
            System.out.println("3. Czy liczba jest parzysta? " + czyParzysta(liczbaParzysta));

            System.out.print("Podaj liczbę do sprawdzenia podzielności przez 3 i 5: ");
            int liczbaPodzielna = skaner.nextInt();
            System.out.println("4. Czy liczba jest podzielna przez 3 i 5? " + czyPodzielnaPrzez3i5(liczbaPodzielna));

            System.out.print("Podaj liczbę do podniesienia do potęgi 3: ");
            double liczbaDoPotegi = skaner.nextDouble();
            System.out.println("5. Wynik potęgowania: " + potega3(liczbaDoPotegi));

            System.out.print("Podaj liczbę do obliczenia pierwiastka kwadratowego: ");
            double liczbaPierwiastek = skaner.nextDouble();
            System.out.println("6. Pierwiastek kwadratowy: " + pierwiastekKwadratowy(liczbaPierwiastek));

            System.out.print("Podaj trzy liczby do sprawdzenia trójkąta prostokątnego (a, b, c): ");
            double a = skaner.nextDouble();
            double b = skaner.nextDouble();
            double c = skaner.nextDouble();
            System.out.println("7. Czy można zbudować trójkąt prostokątny? " + czyTrojkatProstokatny(a, b, c));

            skaner.close();
        }

        public static String pokazImieIWiek() {
            String imie = "Wojciech Koba";
            int wiek = 20;
            return "Imię: " + imie + ", Wiek: " + wiek;
        }

        public static void operacjeMatematyczne(double liczba1, double liczba2) {
            double suma = liczba1 + liczba2;
            double roznica = liczba1 - liczba2;
            double iloczyn = liczba1 * liczba2;
            System.out.println("2. Suma: " + suma + ", Różnica: " + roznica + ", Iloczyn: " + iloczyn);
        }

        public static boolean czyParzysta(int liczba) {
            return liczba % 2 == 0;
        }

        public static boolean czyPodzielnaPrzez3i5(int liczba) {
            return liczba % 3 == 0 && liczba % 5 == 0;
        }

        public static double potega3(double liczba) {
            return Math.pow(liczba, 3);
        }

        public static double pierwiastekKwadratowy(double liczba) {
            return Math.sqrt(liczba);
        }

        public static boolean czyTrojkatProstokatny(double a, double b, double c) {
            double[] boki = {a, b, c};
            sortuj(boki);
            return Math.pow(boki[0], 2) + Math.pow(boki[1], 2) == Math.pow(boki[2], 2);
        }

        private static void sortuj(double[] tablica) {
            for (int i = 0; i < tablica.length - 1; i++) {
                for (int j = 0; j < tablica.length - 1 - i; j++) {
                    if (tablica[j] > tablica[j + 1]) {
                        double temp = tablica[j];
                        tablica[j] = tablica[j + 1];
                        tablica[j + 1] = temp;
                    }
                }
            }
        }

        private static double potega(double podstawa, double wykladnik) {
            double wynik = 1;
            for (int i = 0; i < wykladnik; i++) {
                wynik *= podstawa;
            }
            return wynik;
        }
    }