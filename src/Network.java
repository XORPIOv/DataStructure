import org.w3c.dom.ls.LSOutput;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Network {

    public LinkedList<Library> library = new LinkedList<Library>();
    String last;


    Scanner input = new Scanner(System.in);

    public void add() {

        System.out.println("Adding new equipment ");
        System.out.print("Add name:  ");
        String name = input.nextLine();
        System.out.print("Add manufacture:  ");
        String manufacture = input.nextLine();
        System.out.print("Add model:  ");
        String model = input.nextLine();
        System.out.print("Add serial:  ");
        String serial = input.nextLine();
        System.out.print("Add mac:  ");
        String mac = input.nextLine();
        System.out.print("Add IP:  ");
        String ip = input.nextLine();
        System.out.print("Add location:  ");
        String location = input.nextLine();
        Library equipment = new Library(name, manufacture, model, serial, mac, ip, location);
        library.add(equipment);

        try {
            FileWriter writer = new FileWriter("list.txt", true);
            BufferedWriter out = new BufferedWriter(writer);
            out.write(String.valueOf("\n" + equipment));
            out.close();
        } catch (Exception e) {
            System.err.println("Error while writing to file: " +
                    e.getMessage());
        }
    } // store to file system, add new equipments

    public void updateAll() {

        File fileToBeModified = new File("list.txt");

        String oldContent = "";

        BufferedReader read = null;

        FileWriter write = null;


        try {
            read = new BufferedReader(new FileReader(fileToBeModified));


            String line = read.readLine();

            while (line != null) {
                oldContent = oldContent + line + System.lineSeparator();

                line = read.readLine();
            }


            display();
            System.out.println("Chose any equipment to update");
            String in = input.nextLine();
            System.out.println("Enter a new equipment");
            String out = input.nextLine();
            String newContent = oldContent.replaceAll(in, out);
            System.out.println("Equipment updated");
            last = out;


            write = new FileWriter(fileToBeModified);


            write.write(newContent);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {

                read.close();

                write.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    } // find both location & ip address

    ////////////////////////////////////

   /* public void updateName() {

        System.out.println("choose Name to update");
        String name = input.nextLine().toLowerCase();


        for (Library lib : library) {
            if (lib.getItemName().equals(name)) {
                System.out.println("Enter a new Name: ");
                String newname = input.nextLine();
                lib.setItemName(newname);
                System.out.println("Updated");
            } else {
                System.out.println("Name is not in the list");
            }
        }

    }
*/
   /* public void updateIP() {

        for (Library lib : library) {
            System.out.println(library);
            System.out.println("choose an IP to update ");
            String ip = input.nextLine().toLowerCase();
            if (lib.getItemIP().equals(ip)) {
                System.out.println("Enter a new IP: ");
                String newip = input.nextLine();
                lib.setItemIP(newip);
                last = newip;
                System.out.println("IP " + last + " Updated");


            } else {
                System.out.println("");
            }

        }

    }

    public void updateLocation() {


        for (Library lib : library) {
            System.out.println(library);
            System.out.println("choose a location to update ");
            String location = input.nextLine().toLowerCase();
            if (lib.getItemLocation().equals(location)) {
                System.out.println("Enter a new Location: ");
                String newlocation = input.nextLine();
                lib.setItemLocation(newlocation);
                last = newlocation;
                System.out.println("Location " + last + " Updated");


            } else {
                System.out.println("");
            }

        }
    }
*/
    ////////////////////////////////////


    public void findName() {
        for (Library lib : library)
            System.out.println(lib);
        System.out.println("Enter a name to find");

        String findname = input.nextLine().toLowerCase();
        for (Library lib : library) {
            if (lib.getItemName().equals(findname)) {
                System.out.println("Item Found");
            } else {
                System.out.println("Item not found");
            }
        }
    }

    public void findSerial() {
        System.out.println("Enter a Serial to find");
        String findserial = input.nextLine().toLowerCase();
        for (Library lib : library) {
            if (lib.getItemSerial().equals(findserial)) {
                System.out.println("Item Found");
            } else {
                System.out.println("Item not found");
            }
        }
    } // find serial

    public void findMac() {
        System.out.println("Enter a Mac to find");
        String findmac = input.nextLine().toLowerCase();
        for (Library lib : library) {
            if (lib.getItemMac().equals(findmac)) {
                System.out.println("Item Found");
            } else {
                System.out.println("Item not found");
            }
        }
    } // find mac

    //////////////////////////////////

    public void allLocation() {
        for (Library lib : library) {
            System.out.println(lib.getItemName() + "'s Location: " + lib.getItemLocation());
        }
    } // get all locations

    public void lastUpdated() {
        System.out.println("Last Updated is " + last);

    } // get last updated equipment

    public void display() throws IOException // load from file system
    {
        try {
            File f = new File("list.txt");
            Scanner scan = new Scanner(f);
            while (scan.hasNextLine()) {
                String data = scan.nextLine();
                System.out.println(data);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
