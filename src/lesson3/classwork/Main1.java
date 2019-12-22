package lesson3.classwork;

public class Main1 {
    public static void main(String[] args) {
        char[] chars={'d','q','a','u','h','\'','\\','o',';'};
        for(char currentElement:chars){
            if(currentElement=='a'||currentElement=='o'||currentElement=='i'){
                System.out.println(currentElement);
            }

        }
    }
}
