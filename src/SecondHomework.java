import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHomework {
    public static void main(String[] args) {
        List<String> strings = List.of("short", "medium length", "a very long string indeed", "adequate", "Java");

        // 2.2. Оставление только строк, которые состоят из 15 символов или меньше
        // 2.3. Нахождение самой длинной строки среди оставшихся
        Optional<String> longestString = strings.stream()
                .filter(s -> s.length() <= 15) // Оставляем строки до 15 символов включительно
                .max(Comparator.comparingInt(String::length)); // Находим самую длинную строку

        longestString.ifPresent(s -> System.out.println("Самая длинная строка: " + s));
    }

}
