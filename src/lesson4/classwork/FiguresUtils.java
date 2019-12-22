package lesson4.classwork;

public class FiguresUtils {
    //1-модификатор доступа (4 варианта)
    //1.1-static
    //2-возвращаемый тип (или указание типа или void, если метод ничего не возвращает)
    //3-название метода(придумываем сами)
    //4-входящие параметры:
    public static void printtypeofTriangle(int a,int b,int c){
        if (a == b && b == c) {
            System.out.println("Это равносторонний треугольник");
        }else if ((b == c && a != b) || (a == c && c != b) || (a == b && b != c)) {
            System.out.println("Это равнобедренный треугольник");

        }else if (a != b && b != c && a != c) {
            System.out.println("Разносторонний треугольник");
        }
    }
    public static int calculatePerimeterTriangle(int a,int b,int c){
        int result;
        return result=a+b+c;
    }

}

