
package badcare;

import data.ProductsList;
import ui.Menu;
import util.FakeLibrarys;

/**
 *
 * @author minat
 */
public class BadCareFactory {

    public static void main(String[] args) {

        Menu menu = new Menu();

        menu.addNewOption(" ~~---~~----~~----~~----~~----~~----~~----~~----~~----~~---~~----~~ ");
        menu.addNewOption("|           Welwelwlcomeeeee to Minat Badminton Shop               |");
        menu.addNewOption("| 1.  Add some products into list                                  |");
        menu.addNewOption("| 2.  Add new racket                                               |");
        menu.addNewOption("| 3.  Add new clothes                                              |");
        menu.addNewOption("| 4.  Add new shoe                                                 |");
        menu.addNewOption("| 5.  Add new shuttle                                              |");
        menu.addNewOption("| 6.  Search to see information of product via id                  |");
        menu.addNewOption("| 7.  Update information of product via id                         |");
        menu.addNewOption("| 8.  Remove information of product via id                         |");
        menu.addNewOption("| 9.  Show productions sort by id                                  |");
        menu.addNewOption("| 10. Show productions sort by name                                |");
        menu.addNewOption("| 11. Squid game                                                   |");
        menu.addNewOption(" ~~---~~----~~----~~----~~----~~----~~----~~----~~----~~---~~----~~ \n");
        
        
        ProductsList proList = new ProductsList();
        
        int pick;
        String reply;
        do {
            menu.printMenu();
            pick = menu.getChoice();

            switch (pick) {
                case 1:  // add some products into list
                   proList.addPros();
                   break;
                case 2:  // add racket
                    do {
                        System.out.println("You are adding a new racket to list");
                        proList.addRacket();

                        reply = FakeLibrarys.controlString("Add more?(Y/N): ", "Please input your choice(Y/N)").toUpperCase();
                    } while (reply.startsWith("Y"));
                    System.out.println();
                    break;

                case 3:   // add clothes
                    do {
                        System.out.println("You are adding a new clothes to list");
                        proList.addClothes();
                        
                        reply = FakeLibrarys.controlString("Add more?(Y/N): ", "Please input your choice(Y/N)").toUpperCase();
                    } while (reply.startsWith("Y"));
                    System.out.println();
                    break;

                case 4:    // add shoe
                    do {
                        System.out.println("You are adding a new shoe to list");
                        proList.addShoe();
                        reply = FakeLibrarys.controlString("Add more?(Y/N): ", "Please input your choice(Y/N)").toUpperCase();
                    } while (reply.startsWith("Y"));
                    System.out.println();
                    break;

                case 5:     // add shuttle
                    do {
                        System.out.println("You are adding a new shuttle to list");
                        proList.addShuttleCock();
                        reply = FakeLibrarys.controlString("Add more?(Y/N): ", "Please input your choice(Y/N)").toUpperCase();
                    } while (reply.startsWith("Y"));
                    System.out.println();
                    break;

                case 6:     // Search by id
                    do {                        
                        proList.searchProsByID();
                        reply = FakeLibrarys.controlString("Search more?(Y/N): ", "Please input your choice(Y/N)").toUpperCase();
                    } while (reply.startsWith("Y"));    
                    break;
                    
                case 7: //Update information of product via id
                    do {                        
                        proList.updateInfoPros();
                        reply = FakeLibrarys.controlString("Update more?(Y/N): ", "Please input your choice(Y/N)").toUpperCase();
                    } while (reply.startsWith("Y")); 
                    break;
                    
                case 8:  //Show productions sort by id   
                    do {                        
                        proList.removePros();
                        reply = FakeLibrarys.controlString("Delete more?(Y/N): ", "Please input your choice(Y/N)").toUpperCase();
                    } while (reply.startsWith("Y"));
                    break;
                case 9: 
                    proList.printProsListSortAscByName();
                    break;
                case 10:
                    proList.printProsListSortAscByID();
                    break;
                case 11:
                    System.out.println("Squizzzz Gameeeee ! Bái baiiiiii");
                default:
                    break;
            }
        } while (pick != 11);

    }
}
