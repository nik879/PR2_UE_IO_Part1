package IO.Copy_Bsp3;

import java.io.FileNotFoundException;

public class Demo {
    public static void main(String[] args) {
        Bytecopy bc = new Bytecopy("C:\\Users\\nikik\\Downloads\\");
        try {
            bc.Copy("XMind Pro 8 Pro 3.7.4 Build 201709040350 + serial - Crackingpatching.com.zip","Copy of xmind.zip");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
