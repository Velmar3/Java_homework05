import java.util.HashMap;
import java.util.Map;

// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что один человек может иметь несколько телефонов.
public class task1 {
    public static void main(String[] args) {
        Map<String, String> bookPhone = new HashMap<>();
        bookPhone.put("Смирнов С.С.", "6-22-88, 6-99-11");
        bookPhone.put("Петров П.П.", "6-94-91, 6-29-81");
        bookPhone.put("Васильев В.В.", "6-34-66");
        bookPhone.put("Соколов С.С.", "6-49-81, 6-44-78");
        bookPhone.put("Воронюк В.В.", "6-39-83");
        bookPhone.put("Фролов А.А.", "6-59-82");
        bookPhone.put("Иванов И.И.", "6-26-84");

        System.out.println(bookPhone);
        System.out.println(bookPhone.get("Иванов И.И."));
        System.out.println(bookPhone.get("Петров П.П."));

        addBookPhone(bookPhone, "Фролов А.А.", "6-22-22");

        System.out.println(bookPhone.get("Фролов А.А."));

        deleteBookPhone(bookPhone, "Соколов С.С.");

        System.out.println(bookPhone);
    }

    // Добавить или изменить или изменить данные
    public static void addBookPhone(Map<String, String> dict, String name, String number) {
        dict.put(name, number);
    }

    // Удалить данные
    public static void deleteBookPhone(Map<String, String> dict, String name) {
        dict.remove(name);
    }
}
