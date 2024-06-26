package com.parasoft.nested;

import static com.parasoft.nested.PhoneFactory.Brand.APPLE;
import static com.parasoft.nested.PhoneFactory.Brand.DEFAULT;

public class PhoneFactory {

    public static Phone getIphone4() {
        return new Phone("iphone4", APPLE);
    }

    public enum Brand {
        APPLE, DEFAULT
    }

    public interface Callable {
       void call911();
    }

    public static class Phone implements Callable {
        private String name;
        private Brand brand;

        public Phone(String name, Brand brand) {
            this.name = name;  //before was name
            this.brand = brand; //before was brand
        }

        public void call911() {
            System.out.println("call 911");
        }
        public void call912() {
            System.out.println("call 912");
        }
        public String toString() {
            return "name: " + this.name + ", brand: " + this.brand;
        }

        public String getName() {
            return name;
        }

        public Brand getBrand() {
            return brand;
        }
    }
}
