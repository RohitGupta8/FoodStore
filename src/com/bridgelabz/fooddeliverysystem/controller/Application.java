package com.bridgelabz.fooddeliverysystem.controller;

import com.bridgelabz.fooddeliverysystem.model.*;
import com.bridgelabz.fooddeliverysystem.view.UserInterface;

import java.util.Scanner;

// this is the controller layer
public class Application {
    static UserInterface userInterface = new UserInterface ();
    static FoodStore foodStore = new FoodStore ();

    DalMakhani dalMakhani = new DalMakhani ();
    SoyaChaap chaap = new SoyaChaap ();
    Momos momos = new Momos ();
    AppleJuice appleJuice = new AppleJuice ();
    MixedVeg mixedVeg = new MixedVeg ();
    ChanaMasala chanaMasala = new ChanaMasala ();
    ChilliPotato chilliPotato = new ChilliPotato ();
    SpringRolls springRolls = new SpringRolls ();
    Manchurian manchurian = new Manchurian ();
    HakkaNoodles hAkkaNoodles = new HakkaNoodles ();
    ShahiPaneer shahiPaneer = new ShahiPaneer ();
    MaaKiDaal maKiDal = new MaaKiDaal ();
    Scanner scanner = new Scanner ( System.in );
    ;

    public static void main ( String[] args ) {
        userInterface.Show ( foodStore );
        userInterface.print ( foodStore.getList () );

    }

    public boolean handle ( int option, FoodStore foodStore ) {
        switch (option) {
            case 1:
                System.out.println ( "Enter choice of the food : \n 1. Momos \n 2. ChilliPotato \n 3. appleJuice \n 4. Chaap \n 5. manchurian \n " +
                        "6. springRolls \n 7. hakkaNoodles \n 8. dalMakhani \n 9. ShahiPaneer \n 10. MixedVeg \n 11. Maa ki Dal \n 12. Chana masala \n" );
                int choice = new Scanner ( System.in ).nextInt ();
                switch (choice) {
                    case 1 -> foodStore.add ( momos );
                    case 2 -> foodStore.add ( chilliPotato );
                    case 3 -> foodStore.add ( appleJuice );
                    case 4 -> foodStore.add ( chaap );
                    case 5 -> foodStore.add ( manchurian );
                    case 6 -> foodStore.add ( springRolls );
                    case 7 -> foodStore.add ( hAkkaNoodles );
                    case 8 -> foodStore.add ( dalMakhani );
                    case 9 -> foodStore.add ( shahiPaneer );
                    case 10 -> foodStore.add ( mixedVeg );
                    case 11 -> foodStore.add ( maKiDal );
                    case 12 -> foodStore.add ( chanaMasala );
                }
                System.out.println ( "Food Is Added" );
                break;
            case 2:
                userInterface.print ( foodStore.getList () );
                System.out.println ( "enter food Item you want to remove" );
                String foodName = scanner.nextLine ();
                foodStore.remove ( foodName );
                break;
            case 4:
                return false;
            case 3:
                userInterface.print ( foodStore.getList () );
                break;

            default:
                System.out.println ( "plz enter 1 or 2 or 3" );
        }
        return true;
    }
}
