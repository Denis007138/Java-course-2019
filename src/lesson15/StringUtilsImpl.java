package lesson15;

public class StringUtilsImpl implements StringUtils {

    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("Число 1 или число 2 пусты");
        }
        double num1;
        try {
            num1 = Double.parseDouble(number1);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Первый параметр не является числом");
        }
        double num2;
        try {
            num2 = Double.parseDouble(number2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Второй параметр не является числом");
        }
        if (num2 == 0.0) {
            throw new ArithmeticException("Деление на 0 запрещено");
        }

        return num1 / num2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        //метод, проверяющий, если слово содержится в тексте
        if(text==null || word==null || !text.contains(word)){
            throw new NullPointerException("Не найдены совпадения");
        }
        String[] massivText=text.split(" ");
        int[] massiv1=new int[massivText.length];
        //цикл создающий массив с индексом элемента, совпадающего с самим элементом
        for(int i=0;i<massivText.length;i++){
            if(massivText[i].contains(word)){
                massiv1[i]=text.indexOf(word);
            }
        }
        //вывести индексы совпадений символов
        int[] newMassiv=new int[massiv1.length];
        for(int i=0;i<massiv1.length;i++){
                if(massiv1[i]!=0){
                    newMassiv[i]=i;
                }
        }
        return newMassiv;
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        double[] newMassiv=new double[text.length()];
        //matches-соответствует или не соответствует данная строка регулярному выражению в скобках
        //^-начало строки
        //$-конец строки
        //\\D-нецифровой символ
        //*-ноль или более раз
            if (text.matches("^\\D*$")) {
                throw new CustomException("Not found");
            }
            //Character-класс
        //Character.isDigit-метод, осуществляющий,цифра этот символ или нет
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                newMassiv[i] = Double.parseDouble(String.valueOf(text.charAt(i)));
            }

        }
        return newMassiv;
    }
}