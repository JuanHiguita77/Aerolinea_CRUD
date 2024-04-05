
import Controller.AirplaneController;
import Controller.PasengerController;
import Controller.PlaneController;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args)
    {
        String optionPrincipalMenu;
        String pasengerOptionMenu;
        String airplaneOptionMenu;
        String planeOptionMenu;
        String citeOptionMenu;

        boolean exit = false;

        do
        {
            optionPrincipalMenu = JOptionPane.showInputDialog("""
                    1 - Pasengers Menu
                    2 - Airplanes Menu
                    3 - Plane Menu
                    4 - Cites Menu
                    5 - Exit
                    """);

            switch (optionPrincipalMenu)
            {
                case "1":
                        do
                        {
                            pasengerOptionMenu = JOptionPane.showInputDialog("""
                                1 - List All Pasengers
                                2 - Add New Pasenger
                                3 - Search Pasenger By Name
                                4 - Update Pasenger
                                5 - Delete Pasenger
                                6 - Exit Pasengers Menu
                                """);

                            switch (pasengerOptionMenu)
                            {
                                case "1":
                                    PasengerController.listPasengers();
                                    break;

                                case "2":
                                    PasengerController.create();
                                    break;

                                case "3":
                                    PasengerController.findByName();
                                    break;

                                case "4":
                                    PasengerController.update();
                                    break;

                                case "5":
                                    PasengerController.delete();
                                    break;

                                case "6":
                                    exit = true;
                                    break;
                            }
                        }while (!exit);

                break;

                case "2":
                        do
                        {
                            airplaneOptionMenu = JOptionPane.showInputDialog("""
                                    1 - List All Airplanes
                                    2 - Add New Airplane
                                    3 - Update Airplane
                                    4 - Delete Airplane
                                    5 - Exit Airplane Menu
                                    """);

                            switch (airplaneOptionMenu)
                            {
                                case "1":
                                    AirplaneController.listAirplanes();
                                    break;
                                    
                                case "2":
                                    AirplaneController.create();
                                    break;

                                case "3":
                                    AirplaneController.update();
                                    break;

                                case "4":
                                    AirplaneController.delete();
                                    break;

                                case "5":
                                    exit = true;
                                    break;
                            }
                        }while (!exit);
                break;

                case "3":
                    do
                    {
                        planeOptionMenu = JOptionPane.showInputDialog("""
                                    1 - List All Planes
                                    2 - Search Planes by Destiny
                                    3 - Add New Plane
                                    4 - Update Plane
                                    5 - Delete Plane
                                    6 - Exit Plane Menu
                                    """);

                        switch (planeOptionMenu)
                        {
                            case "1":
                                PlaneController.listPlanes();
                                break;

                            case "2":
                                PlaneController.findByDestinyName();
                                break;

                            case "3":
                                PlaneController.create();
                                break;

                            case "4":
                                PlaneController.update();
                                break;

                            case "5":
                                PlaneController.delete();
                                break;

                            case "6":
                                exit = true;
                                break;
                        }
                    }while (!exit);
                    break;
                /*case "4":
                    do
                    {
                        citeOptionMenu = JOptionPane.showInputDialog("""
                                    1 - List All Cites
                                    2 - Search By Cite Date
                                    3 - Add New Cite
                                    4 - Update Cite
                                    5 - Delete Cite
                                    6 - Exit Cites Menu
                                    """);

                        switch (citeOptionMenu)
                        {
                            case "1":
                                CitaController.listCites();
                                break;

                            case "2":
                                CitaController.findByDate();
                                break;

                            case "3":
                                CitaController.create();
                                break;

                            case "4":
                                CitaController.update();
                                break;

                            case "5":
                                CitaController.delete();
                                break;

                            case "6":
                                exit = true;
                                break;
                        }
                    }while (!exit);
                    break;*/
            }
        }while(!optionPrincipalMenu.equals("5"));
    }
}