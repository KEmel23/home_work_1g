// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] commands = {"Сидеть","Лежать"};
        shelter shelter = new shelter("Ромашка", "Ленина 1");

        dog dog = new dog("Rex", "Ovcharka", commands,
                eenumColor.BROWN, shelter);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("Гив гив");
        dog.makeVoice("Нув нув");
    }
}