package lesson8;

public class Main1 {
    public static void main(String[] args) {
    Tiger tiger=new Tiger();
    //Object o=new Object();
        Tiger tiger1=new Tiger();
        tiger.setName("Вася");
        tiger1.setName("Катя");
        Monkey monkey1=new Monkey();
        monkey1.setName("Клава");
        Monkey monkey2=new Monkey();
        monkey2.setName("Петрович");
//        System.out.println(tiger.equals(tiger1));
//        System.out.println(tiger.toString());
        Animal[] animals=new Animal[4];
        animals[0]=tiger;
        animals[1]=tiger1;
        animals[2]=monkey1;
        animals[3]=monkey2;

        for(int i=0;i<animals.length;i++){
            animals[i].voice();
        }
    }

}
