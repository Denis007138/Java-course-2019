package lesson4.classwork;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for(int day=0; day<31;day++){
            for(int hours=0;hours<24;hours++){
                for(int min=0;min<60;min++){
                    for(int sec=0;sec<60;sec++){
                        System.out.printf("Прошло %d дня, %d часов,%d минут,%d секунд",day,hours,min,sec);
                        System.out.println();
                        Thread.sleep(1000);
                    }
                }
            }
        }
    }
}
