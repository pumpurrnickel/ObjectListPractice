import java.util.ArrayList;
import java.util.Scanner;

public class Animas {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Animal> animals = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        
        System.out.println("Animal Menu");
        System.out.println("State animal name; State if animal is a dog.");
        System.out.println("Enter nothing to proceed.");

        while(true) {
            System.out.println("Enter name: ");
            String name =  input.nextLine();

            if(name.equalsIgnoreCase("")){
                break;
            }

            System.out.println("Is it a dog? State either 'yes' or 'no'.");
            boolean IsADog;

            while(true){
                String answer = input.nextLine();
                
                if (answer.equalsIgnoreCase("yes")){
                    IsADog = true;
                } else {
                    IsADog = false;
                }
                break;
            }

            animals.add(new Animal(name, IsADog));

        }

        for (Animal Animal : animals) {
            System.out.println(Animal.toString());
        }
    }
}
