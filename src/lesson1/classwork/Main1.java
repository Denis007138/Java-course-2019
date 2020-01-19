package lesson1.classwork;

public class Main1 {
    public static void main(String[] args) {
        int tourCost=20000;
        int money=10000;
        int monthToTrip=4;
        int salary=2000;

//Ищем сохраненные деньги, где необходимо найти сколько зарплат нужно для тура
        int savedMoneyAtThisPeriod=salary*monthToTrip;
        int totalMoneyBeforeTrip=money+savedMoneyAtThisPeriod;

        if(totalMoneyBeforeTrip<=tourCost){
            System.out.println("мы в тур не едем!!!!!");

        }else{
            System.out.println("мы в тур едем!!!");
        }
    }
}
