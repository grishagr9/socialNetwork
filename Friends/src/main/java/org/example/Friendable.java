package org.example;

public interface Friendable {

    /**
     * метод может подружить двух людей
     * @param person1 человек, который добавляет друга
     * @param person2 человек, которого добавляют в друзья
     * @return результат операции
     */
    public Boolean addFriend(Person person1, Person person2);

    /**
     * метод, который удаляет друга у пользователя
     * @param person1 человек, который удаляет
     * @param person2 человек, которого удаляют
     * @return результат операции
     */
    public Boolean deleteFriend(Person person1, Person person2);

    /**
     * возвращает количество друзей у пользователя
     * @param person у кого считаем друзей
     * @return количество друзей
     */
    public Integer countFriends(Person person);

    /**
     * Проверяет являются ли пользователи друзьями
     * @param person1 первый пользователь
     * @param person2 второй пользователь
     * @return являются ли друзьями пользователи
     */
    public Boolean isFriends(Person person1, Person person2);
}
