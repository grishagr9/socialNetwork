package org.example;

public interface Sendible {

    public Message createMessage(Person from, Person to, String text);

    /**
     * метод для отправки сообщений человеку
     * @param message объект сообщения
     * @return результат операции
     */
    public Boolean sendMessage(Message message);
}
