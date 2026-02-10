import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String soal = sc.next();

        switch (soal) {

            case "Soal1": {
                int a = sc.nextInt();
                int b = sc.nextInt();

                if (a > 0 && b > 0 && a > Integer.MAX_VALUE - b) {
                    System.out.println("OVERFLOW");
                }
                else if (a < 0 && b < 0 && a < Integer.MIN_VALUE - b) {
                    System.out.println("OVERFLOW");
                }
                else {
                    System.out.println(a + b);
                }
                break;
            }

            case "Soal2": {
                float x = sc.nextFloat();
                float y = sc.nextFloat();

                float sumFloat = x + y;
                double sumDouble = (double) x + (double) y;

                double diff = Math.abs(sumDouble - sumFloat);

                System.out.printf("%.6f", diff);
                break;
            }

            case "Soal3": {
                int N = sc.nextInt();

                Integer a = N;
                Integer b = a;

                a = a + 1;

                System.out.println("==: " + (a == b));
                System.out.println("equals: " + a.equals(b));
                break;
            }

            case "Soal4": {
                String S = sc.next();

                String a = S;
                String b = new String(S);

                a = a + "X";

                System.out.println("==: " + (a == b));
                System.out.println("equals: " + a.equals(b));
                break;
            }

            case "Soal5": {
                int i = Integer.parseInt(sc.next());
                double d = Double.parseDouble(sc.next());
                boolean b = Boolean.parseBoolean(sc.next());

                double result = i * d;
                if (!b) {
                    result *= -1;
                }

                System.out.printf("%.2f", result);
                break;
            }

            default:
                System.out.println("Soal tidak dikenal");
        }

        sc.close();
    }
}
