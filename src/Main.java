
import Controller.AirplaneController;
import Controller.PasengerController;
import Controller.PlaneController;
import Controller.ReservationController;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args)
    {
        String optionPrincipalMenu;
        String pasengerOptionMenu;
        String airplaneOptionMenu;
        String planeOptionMenu;
        String reservationOptionMenu;

        do
        {
            optionPrincipalMenu = JOptionPane.showInputDialog("""
                    1 - Pasengers Menu
                    2 - Airplanes Menu
                    3 - Plane Menu
                    4 - Reservation Menu
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
                            }
                        }while (!pasengerOptionMenu.equals("6"));

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
                            }
                        }while (!airplaneOptionMenu.equals("5"));
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
                        }
                    }while (!planeOptionMenu.equals("6"));
                    break;
                case "4":
                    do
                    {
                        reservationOptionMenu = JOptionPane.showInputDialog("""
                                    1 - List All Reservations
                                    2 - Search Reservation per Plane
                                    3 - Add New Reservation
                                    4 - Update Reservation
                                    5 - Delete Reservation
                                    6 - Exit Reservation Menu
                                    """);

                        switch (reservationOptionMenu)
                        {
                            case "1":
                                ReservationController.listReservations();
                                break;

                            case "2":
                                ReservationController.findAllReservationInPlane();
                                break;

                            case "3":
                                ReservationController.create();
                                break;

                            case "4":
                                ReservationController.update();
                                break;

                            case "5":
                                ReservationController.delete();
                                break;
                        }
                    }while (!reservationOptionMenu.equals("6"));
                break;
            }
        }while(!optionPrincipalMenu.equals("5"));
    }
}