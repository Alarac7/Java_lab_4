public class ArrayAverage {
    static void main() {
        String[] arr = {"10", "20", "30", "abc", "50"};
        double sum = 0;

        try {
            for (int i = 0; i <= arr.length; i++) {
                sum += Integer.parseInt(arr[i]);
            }

            double average = sum / arr.length;
            System.out.println("Среднее арифметическое: " + average);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: выход за границы массива");
        } catch (NumberFormatException e) {
            System.err.println("Error: нельзя складывать число со строкой");
        } catch (Exception e) {
            System.err.println("Error: неизвестная ошибка - " + e.getMessage());
        }
    }
}
