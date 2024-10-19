/* Проверить, надежно ли составлен пароль. Пароль считается
надежным, если он состоит из 8 или более символов. Где символом может быть
цифр, английская буква, и знак подчеркивания. Пароль должен содержать хотя
бы одну заглавную букву, одну маленькую букву и одну цифру.
    a) пример правильных выражений: F032_Password, TrySpy15.
    b) пример неправильных выражений: smart_pass, A007.
*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SafePassword {
    public static void main(String[] args) {
        // Обязательно одна маленькая, одна заглавная буква, одна цифра, дальше идут допустимые значения, от 8 и более символов
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d_]{8,}$";
        // Получаем регулярное выражение
        Pattern p1 = Pattern.compile(regex); // создаём экземпляр класса Pattern и передаём в него шаблон regex
        System.out.println("Введите пароль: ");
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        // Создаём экземпляр класса Matcher, передаём строку с ввода (пароль), которую хотим проверить на соответствие регулярному выражению
        Matcher m1 = p1.matcher(password);
        // Проверяем на соответствие
        if (m1.matches()) System.out.println("Допустимый пароль");
        else System.out.println("Недопустимый пароль");
    }
}
