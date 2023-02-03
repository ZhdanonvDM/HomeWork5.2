public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1 () {
        System.out.println("Задача № 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();
    }
    public static void task2 () {
        System.out.println("Задача № 2");
        int[] arr = generateRandomArray();
        int max, min;
        max = arr[0];
        min = arr[0];
        for (int element : arr) {
            if (max < element) {
                max = element;
            }
            if (min > element) {
                min = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача № 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        float average;
        for (int element : arr) {
            sum = sum + element;
        }
        average = (float)(sum/arr.length);
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        System.out.println();
    }
    public static void task4 () {
        System.out.println("Задача № 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}