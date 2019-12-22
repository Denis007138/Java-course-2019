package lesson11_12;

import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    private KolodaCards cards;
    private LinkedList<Player> players = new LinkedList<>();

    public void setCards() {
        this.cards = cards;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public Game() {
        KolodaCards cards = new KolodaCards();
        cards.initKolodaCards();
        this.setCards(cards);
    }

    public void setCards(KolodaCards cards) {
        this.cards = cards;
    }

    public void doFirstRound() {
        for (int i = 0; i < 2; i++) {
            for(Player player:players){
                player.addCardToHand(cards.getRandomCard());
            }
        }
    }
    public void printPlayersHands(){
        for(Player player:players){
            if(!player.isDealer()){
                player.PrintHand();
            }
        }
    }
    public void printAllPlayersHands(){
        for(Player player:players){
            player.PrintHand();

        }
    }
    public void doActionPlayers(){
        for(Player player:players){
            if(!player.isDealer()){
                while(player.isNeedCard()) {
                    player.takeCard(cards);
                    player.PrintHand();
                }
            }
        }
    }
    public void doActionDealer(){
        for(Player player:players){
            if(player.isDealer()){
                player.takeCard(cards);

            }
        }
    }
    public void printWinner(){
        for(Player player:players){
            if(!player.isDealer()){
                int values=player.getValueHand();
                if(values>21){
                    player.setWinner(false);
                }
            }
        }
        if(getCountWinner()==1){
            System.out.println("---------------------------------");
            System.out.println("-----------WINNER----------------");
            for(Player player:players){
                if(player.isWinner()){
                    player.PrintHand();
                    return;
                }
            }
        }
        for(int i=21;i>4;i--){
            int summ=0;
            for(Player player:players){
                if(player.getValueHand()==i){
                    System.out.println("---------------------------------");
                    System.out.println("-----------WINNER----------------");
                    player.PrintHand();
                    summ++;
                }
            }
            if(summ!=0){
                return;
            }
        }
    }
    private int getCountWinner(){
        int summa=0;
        for(Player player:players){
            if(player.isWinner()){
                summa++;
            }
        }
        return summa;
    }
//    public void printAllPlayersHands(){
//        for(Player player:players){
//                player.PrintHand();
//        }
//    }
//    public void doActionPlayers(){
//        for(Player player:players){
//            if(!player.isDealer()){
//                while(player.isNeedCard()){
//                    player.doTakeCard(cards);
//                    player.PrintHand();
//                }
//            }
//        }
//    }
//    public void doActionDealer(){
//        for(Player player:players){
//            if(player.isDealer()){
//                while(player.isNeedCard()){
//                   player.doTakeCard(cards);
//                }
//            }
//        }
//    }
//    public void printWinner(){
//        for(Player player:players){
//            if(!player.isDealer()){
//                int values=player.getValueHand();
//                if(values>21){
//                    player.setWinner(false);
//                }
//            }
//
//        }
//        for(int i=21;i>4;i--){
//            int summ=0;
//            for(Player players:players){
//                if(players.getValueHand()==i){
//                    summ++;
//
//                }
//            }
//
//        }
//    }
//    public int getCountWinner(){
//        int summa=0;
//        for (Player player:players) {
//            if(player.isWinner()){
//                summa++;
//            }
//        }
//        return summa;
//    }
}
