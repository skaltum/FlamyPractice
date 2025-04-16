package FlamyMap.com.pwflamy.tasks.optional;

import java.util.List;
import java.util.Optional;

/**
 * Перед тем как начать выполнять изучи, что из себя представляет класс Optional и какие у него есть методы
 */
public class UserRepository {

    private List<User> users;

    public UserRepository(List<User> users) {
        this.users = users;
    }

    /**
     * Данный метод должен сначала найти пользователь в списке по его имени, используя приватный метод findByName.
     * Далее в зависимости от полученного результат необходимо в ответе вернуть следующие варианты строки:
     * 1) Если пользователь найден и у него есть адрес с индексом → верни строку формата: "Пользователь [name] живёт в [city], индекс: [postalCode]"
     * 2) Если адрес есть, но без индекса → "Пользователь [name] живёт в [city], индекс неизвестен"
     * 3) Если адрес отсутствует → "У пользователя [name] нет адреса"
     * 4) Если пользователь не найден → "Пользователь с именем [name] не найден"
     *
     * Для удобного форматирования используй String.format()
     */
    public String getUserAddressInfo(String name) {
        return "";
    }

    /**
     * Метод поиска User по его имени в списке users. Все пользователи уникальны по имени. Если пользователь не найден
     * в списке users - вернуть Optional.empty()
     */
    private Optional<User> findByName(String name) {
        return null;
    }
}
