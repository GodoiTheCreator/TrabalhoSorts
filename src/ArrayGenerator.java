import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class ArrayGenerator {

    // Função 1: Array ordenado em ordem crescente, sem valores repetidos
    public static int[] generateAscendingArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    // Função 2: Array ordenado em ordem decrescente, sem valores repetidos
    public static int[] generateDescendingArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = n - i;
        }
        return arr;
    }

    // Função 3: Array aleatório sem valores repetidos
    public static int[] generateRandomArrayNoDuplicates(int n) {
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }
        Collections.shuffle(list, new Random());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    // Função 4: Array aleatório com valores repetidos
    public static int[] generateRandomArrayWithDuplicates(int n) {
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(n) + 1;
        }
        return arr;
    }

}
