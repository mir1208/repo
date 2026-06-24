public class ArrayCenter {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Пример массива
        int centerIndex = (array.length - 1) / 2; // Расчет индекса центра
        int centerElement = array[centerIndex]; // Получение значения центрального элемента

        System.out.println("Центральный элемент массива: " + centerElement); // Вывод результата

        int[] array2 = {1, 2, 3, 4, 5, 6};
        int centerIndex2 = (array2.length - 1) / 2;
        int centerElement2 = array2[centerIndex2];
        System.out.println("Центральный элемент массива 2: " + centerElement2); // Вывод результата
    }
}
}