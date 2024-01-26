import controller.EquationController;
import model.EquationModel;
import view.displayMenu;

public class Main {
    public static void main(String[] args) {
        EquationModel model = new EquationModel();
        displayMenu view = new displayMenu();
        EquationController controller = new EquationController(model, view);
        controller.run();
    }
}
