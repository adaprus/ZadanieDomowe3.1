public class NotebookTest {
    public static void main(String[] args) {

        Notebook notebook1 = new Notebook();
        notebook1.brand = "Lenovo";
        notebook1.inches = 15.4;
        notebook1.isCdDr = true;
        notebook1.model = "AM2390V";

        System.out.println("Marka komputera: " + notebook1.brand);
        System.out.println("Model komputera: " + notebook1.model);
        System.out.println("Przekątna ekranu: " + notebook1.inches + "\"");
        System.out.println("Napęd CD-RD: " + notebook1.isCdDr);
        System.out.println("\n");

        Notebook notebook2 = new Notebook();
        notebook2.brand = "HP";
        notebook2.inches = 17;
        notebook2.isCdDr = false;
        notebook2.model = "9063FG";

        System.out.println("Marka komputera: " + notebook2.brand);
        System.out.println("Model komputera: " + notebook2.model);
        System.out.println("Przekątna ekranu: " + notebook2.inches + "\"");
        System.out.println("Napęd CD-RD: " + notebook2.isCdDr);
    }
}
