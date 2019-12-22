package lesson11_12;

import java.util.LinkedList;
import java.util.Scanner;

public class Player {
    private LinkedList<Card> hand = new LinkedList<>();
    private boolean isDealer=false;
    private boolean isNeedCard=true;
    private boolean isWinner=true;
    public void addCardToHand(Card card){
        hand.add(card);
    }

    public boolean isDealer() {
        return isDealer;
    }

    public void setDealer(boolean dealer) {
        isDealer = dealer;
    }

    public boolean isNeedCard() {
        return isNeedCard;
    }

    public void setNeedCard(boolean needCard) {
        isNeedCard = needCard;
    }

    public void PrintHand(){
        System.out.println("-------------Это крупье?-"+isDealer);
        System.out.println("-------------Карты:---------------");
        for(Card card:hand){
            System.out.println(card);
        }
        System.out.println("----------------------------");
    }
    public void takeCard(KolodaCards cards){
        System.out.println("Берете ли вы карту?");
        Scanner scanner=new Scanner(System.in);
        String answer=scanner.nextLine();
        if(answer.equals("да")){
            this.addCardToHand(cards.getRandomCard());
        }else if(answer.equals(("нет"))){
            this.setNeedCard(false);
        }else{
            System.out.println("---------Повторите ввод!!!!!!");
            this.takeCard(cards);
        }
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }

//    public void doTakeCard(KolodaCards cards){
//        System.out.println("Берете ли вы карту?");
//        Scanner scanner=new Scanner(System.in);
//        String answer=scanner.nextLine();
//        if(answer.equals("да")){
//            this.addCardToHand(cards.getRandomCard());
//
//        }else if(answer.equals("нет")){
//            this.setNeedCard(false);
//        }else{
//            System.out.println("--------------Повторите ввод!!!!!!!!!");
//            this.doTakeCard(cards);
//        }
//    }
    public int getValueHand(){
        int summa=0;
        for(Card card:hand){
            summa=summa+card.getValue();
        }
        return summa;
    }
}
