package IO.Copy_Bsp3;

import java.io.*;

public class Bytecopy {
    private String path;

    public Bytecopy(String path) {
        this.path = path;
    }

    public void Copy(String inputfile, String outputfile) throws FileNotFoundException {
        try (BufferedInputStream bi = new BufferedInputStream(new FileInputStream(path + inputfile));
             BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(path+outputfile)) ) {
            int byteRead=0;
            final long timestart = System.nanoTime();
            while ((byteRead=bi.read()) != -1) {
            bo.write(byteRead);
            }
            final long timeend = System.nanoTime();
            System.out.println((timeend-timestart)*10E-9+" Sekunden");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
