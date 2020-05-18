import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Dimensions dimensions = new Dimensions(20,20,5);
//        Case theCase = new Case("220B", "Dell", "240", dimensions);
//
//        Monitor theMonitor = new Monitor("27inch Beast", "Acer",27, new Resolution(2540,1140));
//
//        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4,6,"v2.44");
//
//        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//        thePC.powerUp();
        Scanner scanner = new Scanner(System.in);

        RestRoom restRoom = new RestRoom(1,0,"Toto",2);
        Room myRoom = new Room(1,1,1, restRoom);


        System.out.print("The temperature= ");
        int inputTemp = scanner.nextInt();
        System.out.print("It's a ");
        restRoom.waterTemperature(inputTemp);

        scanner.close();
    }
}
