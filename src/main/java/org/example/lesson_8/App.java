package org.example.lesson_8;

import org.example.lesson_8.iml.FixPhoneServiceImpl;
import org.example.lesson_8.models.AndroidPhone;
import org.example.lesson_8.models.ApplePhone;
import org.example.lesson_8.models.Phone;
import org.example.lesson_8.models.WindowsPhone;
import org.example.lesson_8.services.FixPhoneService;

public class App {
    public static void main(String[] args) {
        Phone apple = new ApplePhone();
        Phone xiaomi = new AndroidPhone();
        Phone nokia = new WindowsPhone();
        Phone samsung = new Phone("+3751112233", 11) {
            @Override
            public void firmware() {
                System.out.println("The model Samsung N100");
            }
        };
        FixPhoneService service = new FixPhoneServiceImpl();
        service.fixThePhone(apple);
        service.fixThePhone(xiaomi);
        service.fixThePhone(nokia);
        service.fixThePhone(samsung);
    }
}
