package lesson11_12;

public class Dealer extends Player {
    @Override
    public void takeCard(KolodaCards cards) {
        int valuesCards=this.getValueHand();
        if(valuesCards<18){
            this.addCardToHand(cards.getRandomCard());
            this.takeCard(cards);
        }
    }
    //    @Override
//    public void doTakeCard(KolodaCards cards) {
//        int valuesCards=this.getValueHand();
//        if(valuesCards<18){
//            this.addCardToHand(cards.getRandomCard());
//            this.doTakeCard(cards);
//        }
//    }
}
