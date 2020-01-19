package lesson15;


public class Main1 {
    public static void main(String[] args) {
        StringUtilsImpl utils=new StringUtilsImpl();
        try{
            System.out.println(utils.div("5","8"));
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        //Задача на нахождение слова в тексте
        try {
            int[] ir = utils.findWord("Владелец сайта — американская некоммерческая организация «Фонд Викимедиа», имеющая 37 региональных представительств. Название энциклопедии образовано", "и");
            for (int i = 0; i < ir.length; i++) {
                System.out.print(ir[i] + " ");
            }
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        System.out.println();
        //Задача на нахождение цифр в тексте
        try {
            double[] mass = utils.findNumbers("jl4992папвкп465lfj");
            for(int i=0;i<mass.length;i++){
                System.out.print(mass[i]+" ");
            }
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.print("Конец примера");
    }
}
