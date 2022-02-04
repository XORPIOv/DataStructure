import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {


        var network = new Network();
        var user_input = new Scanner(System.in);

    String update;
    String operations;
        do {
                System.out.println("Welcome to our Equipment Library");
                System.out.println("""
                    Display:  Display equipment lists
                    Add:      Add an Equipment to list
                    Update:   Update an existing equipment (write update followed with the wanted equipment)
                    Find:     Find an existing equipment (write find followed with the wanted equipment)
                          
                         """);
                System.out.println("Enter an operation");
                operations = user_input.nextLine().toLowerCase();
                switch (operations) {
                case ("add"):
                network.add();
                break;

                case ("update"):
                network.updateAll();
                break;
             /*
                case ("update ip"):
                    network.updateIP();
                    break;
                case ("update location"):
                    network.updateLocation();
                    break;
*/
                //////////////////////////

                case ("find name"):
                network.findName();
                break;
                case ("find serial"):
                network.findSerial();
                break;
                case ("find mac"):
                network.findMac();
                break;

                //////////////////////////
                case ("last updated"):
                network.lastUpdated();
                break;
                case ("list locations"):
                network.allLocation();
                break;
                case ("display"):
                network.display();
                break;

                case ("exit"):
                break;

default:
        System.out.println("Operation not recognised");


        }
        } while (!operations.equals("exit"));


        network.display();
        System.out.println("Thanks");
        }

        }