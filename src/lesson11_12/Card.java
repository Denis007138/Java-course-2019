package lesson11_12;

public class Card {
    private String mast;
    private String noninal;
    private int value;

    public Card() {
    }

    public Card(String mast, String noninal, int value) {
        this.mast = mast;
        this.noninal = noninal;
        this.value = value;
    }

    public String getMast() {
        return mast;
    }

    public void setMast(String mast) {
        this.mast = mast;
    }

    public String getNoninal() {
        return noninal;
    }

    public void setNoninal(String noninal) {
        this.noninal = noninal;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;

        Card card = (Card) o;

        if (getValue() != card.getValue()) return false;
        if (getMast() != null ? !getMast().equals(card.getMast()) : card.getMast() != null) return false;
        return getNoninal() != null ? getNoninal().equals(card.getNoninal()) : card.getNoninal() == null;
    }

    @Override
    public int hashCode() {
        int result = getMast() != null ? getMast().hashCode() : 0;
        result = 31 * result + (getNoninal() != null ? getNoninal().hashCode() : 0);
        result = 31 * result + getValue();
        return result;
    }

    @Override
    public String toString() {
        return "Карта: " + noninal + " " + mast;
    }
}
