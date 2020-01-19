package lesson17.classwork;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
        public static void main(String[] args) {
            try {
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("./src/lesson17/ыуфавыуа.txt"));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("zweite.txt"));

                int c = 0;
                while (true) {
                    c = bis.read();
                    if (c != -1)
                        bos.write(c);
                    else
                        break;
                }
                bis.close();
                bos.flush(); //освобождаем буфер (принудительно записываем содержимое буфера в файл)
                bos.close(); //закрываем поток записи (обязательно!)
            }
            catch (java.io.IOException e) {
                System.out.println(e.toString());
            }
        }


}
