import java.util.*;

public class OrdenacaoParesImpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int valor = scanner.nextInt();
            numbers.add(valor);
        }

        Collections.sort(numbers, new Comparator<Integer>() {

            @Override
            public int compare(Integer num1, Integer num2) {

                boolean isNum1Even = num1 % 2 == 0;
                boolean isNum2Even = num2 % 2 == 0;

                if (isNum1Even && isNum2Even) {

                    return num1.compareTo(num2);
                } else if (!isNum1Even && !isNum2Even) {

                    return num2.compareTo(num1);
                } else if (isNum1Even) {

                    return -1;
                } else {

                    return 1;
                }
            }
        });

        for (int valor : numbers) {
            System.out.println(valor);
        }
    }
}