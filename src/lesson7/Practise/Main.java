package lesson7.Practise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Photo photo1 = new Photo();
        photo1.setPathToSmallPhoto("https://avatars.mds.yandex.net/get-mpic/1705137/img_id7078646091893402036.png/orig");
        photo1.setPathToBigPhoto("https://beru.ru/product/televizor-skyline-32yt5900-32-2019-chernyi/444694892?show-uid=15751088746934173914006001");
        Photo photo2 = new Photo();
        photo2.setPathToBigPhoto("http://gfrglrgjkgrl");
        photo2.setPathToSmallPhoto("http://fkfklglgotrlf");
        Tovar planshet = new Tovar();
        planshet.setFullPrice(8990);
        planshet.setDiscount(22);
        planshet.setName("Графический планшет HUION H950p черный");
        planshet.addPhoto(photo1);
        planshet.addPhoto(photo2);
        //-----------------------------------доп. дз
        planshet.setAvailable("есть");
        //----------------------------------доп. дз
        planshet.printTovar();
        System.out.println("Отзывы");
        //основное дз
        User user1 = new User(4345, "Елена", "Пояркова",new Date(115,6,12), "https://avatars.mds.yandex.net/get-yapic/0/0-0/islands-middle");
        User user2=new User(2134,"Дина","Григорьева",new Date(117,8,9),"https://avatars.mds.yandex.net/get-yapic/34189/7H7lhWeiJ12kUmPME6vezOaw-1573964326/islands-middle");
        User user3=new User(2765,"Данис","Коновалов",new Date(111,4,14),"https://avatars.mds.yandex.net/get-yapic/0/0-0/islands-middle");
        Otziv comment1 = new Otziv();
        Otziv comment2=new Otziv();
        Otziv comment3=new Otziv();
        comment1.setId(1);
        comment1.setUser(user1);
        comment1.setComment("Вот всем четкая инструкция по настройке . Купите усилитель сигнала ( цена 450-500рублей). Нажимаете на пульте source выбираете DVB-T , далее нажимаете меню Ручная Настройка DVB-T , затем выбираете UHF......");
        comment1.setDatePublish(new Date(115,6,12));
        comment1.setRating(5);
        comment1.setLike(12);
        comment1.setDislike(5);
        comment1.setPlusText("Цена и качество");
        comment1.setMinusText("Сложная инструкция");
        comment1.printOtziv();
        comment2.setId(2);
        comment2.setUser(user2);
        comment2.setComment("Работаю дизайнером и часто приходится что-нибудь дома доделывать, дорисовывать или просто вдруг в голову приходит очередная идея, которую сразу хочется зарисовать, иначе потом забуду, планшет мне очень для этих целей");
        comment2.setDatePublish(new Date(117,8,9));
        comment2.setRating(5);
        comment2.setLike(3);
        comment2.setDislike(3);
        comment2.setPlusText("Подключение через USB. Простые настройки - интуитивно понятен с первого применения. Легкий, симпатично выглядит. Оптимальные характеристики, при этом цена умеренная");
        comment2.setMinusText("Я пока не нашла недостатков, меня все устраивает.");
        comment2.printOtziv();
        comment3.setId(3);
        comment3.setUser(user3);
        comment3.setComment(" Для моих задач: вырезка и ретушь портретов, работа с масками и т. д., вполне хватает.");
        comment3.setDatePublish(new Date(111,4,14));
        comment3.setRating(5);
        comment3.setLike(8);
        comment3.setDislike(4);
        comment3.setPlusText("Отличные характеристики за такую цену. Планшет выглядит очень стильно и приятный на ощупь, легкий вес, стилус, работающий без подзарядки. ");
        comment3.setMinusText("драйверов в комплекте нет, их придётся скачивать из сети.");
        comment3.printOtziv();
    }
}
