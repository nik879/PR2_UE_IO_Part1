package IO.adressbuch_bsp1;

import java.io.*;
import java.util.ArrayList;

public class AddressManager {
    @Override
    public String toString() {
        return "AddressManager{" +
                "addresses=" + addresses +
                '}';
    }

    private ArrayList<Address> addresses;

    public AddressManager() {
        this.addresses = new ArrayList<>();
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void loadFromCsv(String path, String separator) throws AddressLoadException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length != 4) {
                    throw new AddressLoadWrongFormatException("Falsches Format");
                }
                addresses.add(new Address(parts[0], parts[1], parts[2], parts[3]));
            }
        } catch (FileNotFoundException e) {
            throw new AddressLoadException(e);
        } catch (IOException e) {
           throw new AddressLoadException(e);
        }

    }

    public void exportToCsv(String path, String separator) throws AddressExportException{
        File file = new File(path);
        try (BufferedWriter bw = new BufferedWriter(new PrintWriter(new FileWriter(file)))) {
            if (file.exists()) {
                throw new FileAlreadyExistsException("Die Datei des ausgewählten Pfads existiert bereits");
            }
            for (Address address : addresses) {
                bw.write(address.firstname + separator + address.lastname + separator + address.mobilNumber + separator + address.email);
                bw.newLine();
            }
        } catch (FileAlreadyExistsException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new AddressExportException(e);
        }

    }
}
