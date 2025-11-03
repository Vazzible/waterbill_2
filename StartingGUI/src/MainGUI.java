public class Main {
    public static void main(String[] args){
        new InClassGUI();

        InClassView inClassView = new InClassView();
        InClassController inClassController = new InClassController(InClassView);
        inClassView.initializeUI();
    }
}
