package org.example.lesson_8.services;

import org.example.lesson_8.models.Phone;

public interface FixPhoneService {

    default void fixThePhone(Phone phone) {
        phone.call(phone.getTestNumber());
        phone.play(phone.getMaxLoudness());
        phone.firmware();
        System.out.println("Check is completed");
    }
}
