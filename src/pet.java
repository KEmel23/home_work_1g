import java.awt.*;
import java.util.Random;

public class pet {
    eenumColor color;
    int age;
    shelter shelter;

    public eenumColor getColor() {
        return color;
    }

    public void setColor(eenumColor color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public shelter getShelter() {
        return shelter;
    }

    public void setShelter(shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

    public String getInfo() {
        return "Age: " + age +
                "\nColor: " + color +
                "\nShelter name: " + shelter.getName() +
                "\nShelter address: " + shelter.getAddress();
    }
}
