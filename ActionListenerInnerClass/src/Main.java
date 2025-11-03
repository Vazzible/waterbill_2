public class Main {

    public static void main(String[] args) {
        InclassView inclassView = new InclassView();
        inclassView.initializeUI();

        InclassController inclassController = new InclassController(inclassView);
    }
}