public class NotebookTest {
    public static void main(String[] args) {

        Notebook notebook1 = new Notebook("Lenovo", "AM2390V", 15.4, true);

        System.out.println("Marka komputera: " + notebook1.brand);
        System.out.println("Model komputera: " + notebook1.model);
        System.out.println("Przekątna ekranu: " + notebook1.inches + "\"");
        System.out.println("Napęd CD-RD: " + notebook1.isCdDr);
        System.out.println("\n");

        Notebook notebook2 = new Notebook("HP", "9063FG", 17,false);

        System.out.println("Marka komputera: " + notebook2.brand);
        System.out.println("Model komputera: " + notebook2.model);
        System.out.println("Przekątna ekranu: " + notebook2.inches + "\"");
        System.out.println("Napęd CD-RD: " + notebook2.isCdDr);
    }
}
