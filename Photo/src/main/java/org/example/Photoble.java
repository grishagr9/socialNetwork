package org.example;

public interface Photoble {

    /**
     * метод, добавляющий лайк на фото
     * @param photo фото
     * @return результат операции
     */
    Boolean likeIt(Photo photo);

    /**
     * функция получения фото
     * @return фото
     */
    Photo recievePhoto();
}
