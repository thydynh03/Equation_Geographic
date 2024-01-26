package controller;

import model.EquationModel;
import view.displayMenu;

public class EquationController {
    private EquationModel model;
    private displayMenu view;

    public EquationController(EquationModel model, displayMenu view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        int option;
        do {
            option = view.displayMenuAndGetOption();
            switch (option) {
                case 1:
                    model.calculateEquation();
                    break;
                case 2:
                    model.calculateQuadraticEquation();
                    break;
                case 3:
                     System.out.println("Exitting.......");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        } while (option != 3);
    }
}
