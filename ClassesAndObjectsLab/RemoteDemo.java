
import java.util.Scanner;

// Sushant Khatri

/**
   This class demonstrates the Remote class.
*/
public class RemoteDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner object to read from the keyboard.
        Scanner keyboard = new Scanner(System.in);

        // Declare variables.
        int channel;  // The user's channel choice.

        // Declare and instantiate a television object.
        Remote familyRoom = new Remote("LG OLED", "Family Room");

        // Turn the power on.
        familyRoom.power();

        // Display the state of the Family Room television.
        System.out.println("The " + familyRoom.getManufacturer()
                + " television in the " + familyRoom.getLocation() + " is on.");
        System.out.println("Channel: " + familyRoom.getChannel()
                + " Volume: " + familyRoom.getVolume());
        
        // Prompt the user for input and store in channel.
        System.out.print("What channel do you want? ");
        channel = keyboard.nextInt();

        // Change the channel on the television.
        familyRoom.setChannel(channel);

        // Increase the volume of the television twice.
        familyRoom.volumeUp();
        familyRoom.volumeUp();

        // Display the the current channel & volume of the family room TV.
        System.out.println("Channel: " + familyRoom.getChannel()
                + " Volume: " + familyRoom.getVolume());
        System.out.println("Too loud! Lowering the volume.");

        // Decrease the volume of the television by four (4).
        for (int i = 0; i < 4; i++) {
            familyRoom.volumeDown();
        }

        // Display the the current channel & volume of the family room TV.
        System.out.println("Channel: " + familyRoom.getChannel()
                + " Volume: " + familyRoom.getVolume());

        System.out.println();  // For a blank line.
        
        //
        // ADD LINES FOR TASK #5 HERE:
        // Task #5 Creating another instance of a Remote object 
		// for the "Office".
        //
        // Declare and instantiate another instance.
        // Declare another Remote object called office.
        // Instantiate office to be a Samsung television located
        // in the "Office".
        Remote office = new Remote("Samsung", "Office");

        // Use a call to the power method to turn the power on.
        // Turn the power on.
        office.power();

        // Use calls to the accessor methods to print what television
        // was turned on and what the current channel and volume are.
        // Display the state of the TV located in the Office.
        System.out.println("The " + office.getManufacturer()
                + " television in the " + office.getLocation() + " is on.");
        System.out.println("Channel: " + office.getChannel()
                + " Volume: " + office.getVolume());

        // Use calls to the mutator methods to change the channel to
        // the user's preference and decrease the volume by three.
        // Prompt the user for input and store into channel.
        System.out.print("What channel do you want? ");
        channel = keyboard.nextInt();

        // Change the channel on the television.
        office.setChannel(channel);

        // Decrease the volume of the television by three (3).
        for (int i = 0; i < 3; i++) {
            office.volumeDown();
        }

        // Display the current channel & volume of the TV in the Office.
        System.out.println("Channel: " + office.getChannel()
                + " Volume: " + office.getVolume());
        
    }
}
