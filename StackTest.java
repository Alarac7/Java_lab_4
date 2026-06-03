import java.io.FileWriter;
import java.io.IOException;

class CustomEmptyStackException extends Exception {
    public CustomEmptyStackException(String message) {
        super(message);
    }
}

class ErrorLogger {
    public static void logException(String message) {
        try {
            FileWriter writer = new FileWriter("errors.txt", true);
            writer.write("Error: " + message + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: проблема с файлом");
        }
    }
}

class CustomStack {
    private int[] data = new int[5];
    private int count = 0;

    public void push(int value) {
        if (count < 5) {
            data[count] = value;
            count++;
        } else {
            System.out.println("Стек переполнен");
        }
    }

    public int pop() throws CustomEmptyStackException {
        if (count == 0) {
            throw new CustomEmptyStackException("В стеке нет элементов для извлечения");
        }
        count--;
        return data[count];
    }
}

public class StackTest {
    static void main() {
        CustomStack stack = new CustomStack();

        try {
            stack.push(10);
            System.out.println("взяли: " + stack.pop());
            System.out.println("взяли: " + stack.pop());
        } catch (CustomEmptyStackException e) {
            System.out.println("Error: " + e.getMessage());
            ErrorLogger.logException(e.getMessage());
        }
    }
}
