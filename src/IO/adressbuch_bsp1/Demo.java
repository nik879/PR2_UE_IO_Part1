package IO.adressbuch_bsp1;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        AddressManager am = new AddressManager();
        System.out.println(am);
        try {
            am.loadFromCsv("C:\\Users\\nikik\\Downloads\\addresses (2).csv",";");
        } catch (AddressLoadException e) {
            e.printStackTrace();
        }
        System.out.println(am);

        try {
            am.exportToCsv("C:\\Users\\nikik\\Desktop\\export-file.csv",";");

        } catch (AddressExportException e) {
            e.printStackTrace();
        }
    }
}
