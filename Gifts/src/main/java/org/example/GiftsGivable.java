package org.example;

public interface GiftsGivable {

    /**
     * предлагает выбрать случайный подарок
     * @return выбранный подарок
     */
    public Gift changeGift();

    /**
     *
     * @param person1 человек, от кого подарок
     * @param person2 человек, кому подарок
     * @param gift подарок, который будет дариться
     * @return результат операции
     */
    public Boolean presentGift(Person person1, Person person2, Gift gift);
}
