
package ui;

import java.util.ArrayList;
import util.FakeLibrarys;

/**
 *
 * @author minat
 */
public class Menu {
    
    private String menuTitle;
    private ArrayList<String> opList = new ArrayList();

//    public Menu(String menuTitle) {
//        this.menuTitle = menuTitle;
//    }
        
    public void addNewOption(String newOption) {
        opList.add(newOption);        
    }

    public void printMenu() {
        
        if (opList.isEmpty()) {
            System.out.println("Menu is empty. Not have anything is this list ");
            return;
        }
        for (String o : opList)
            System.out.println(o);  
    }
    

    public int getChoice() {
        
        int maxOption = opList.size() - 3;
        
        String inputMsg = "Choose [1..11]: ";
        String errorMsg = "You are required to choose the option .." + maxOption; 
        
        return FakeLibrarys.controlInteger(inputMsg, errorMsg, 0, maxOption);
       
         
    }
}
