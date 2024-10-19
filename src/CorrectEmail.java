/* Написать регулярное выражение, определяющее является ли данная
строчка допустимым (корректным) е-mail адресом
    a) пример правильных выражений: user@example.com, root@localhost
    b) пример неправильных выражений: myhost@@@com.ru, @my.ru,
    Julia String
*/
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorrectEmail {
    public static void main(String[] args) {
        // Обязательно имя пользователя, @, доменное имя сервера (может отсутствовать домен 2 или 3 уровня)
        String regex = "^([\\w\\W]+)@([\\w\\W]+\\.)*([\\w\\W]+)(\\.[\\w\\W]+)*$"; // шаблон адреса эл.почты
        // Получаем регулярное выражение
        Pattern p1 = Pattern.compile(regex); // создаём экземпляр класса Pattern и передаём в него шаблон regex
        System.out.println("Введите адрес электронной почты: ");
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        // Создаём экземпляр класса Matcher, передаём строку с ввода (email адрес), которую хотим проверить на соответствие регулярному выражению
        Matcher m1 = p1.matcher(email);
        // Проверяем на соответствие
        if (m1.matches()) System.out.println("Допустимый email адрес");
        else System.out.println("Недопустимый email адрес");
    }
}