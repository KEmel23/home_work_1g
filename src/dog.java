import java.util.Arrays;

public class dog extends pet{

    private String name;
    private String breed;
    private String[] commands;


    public dog (String name, String breed, String[] commands,
               eenumColor enumColor, shelter shelter){
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setShelter(shelter);
        super.setColor(enumColor);
    }

    public dog(String name, String breed,
               eenumColor enumColor, shelter shelter) {
        this.name = name;
        this.breed = breed;
        super.setShelter(shelter);
        super.setColor(enumColor);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }
    void makeVoice(){
        System.out.println("Гав гав");
    }

    void makeVoice(String voice){
        System.out.println(voice);
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nName: " + name +
                "\nBreed: " + breed +
                "\nCommands: " + Arrays.toString(commands);
    }
}
