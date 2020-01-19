package lesson7.Practise;

import java.util.Date;

public class Otziv {
    private int id;
    private User user;
    private Date datePublish;
    private int rating;
    private int like;
    private int dislike;
    private String plusText;
    private String minusText;
    private String comment;
    public Otziv(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDatePublish() {
        return datePublish;
    }

    public void setDatePublish(Date datePublish) {
        this.datePublish = datePublish;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    public String getPlusText() {
        return plusText;
    }

    public void setPlusText(String plusText) {
        this.plusText = plusText;
    }

    public String getMinusText() {
        return minusText;
    }

    public void setMinusText(String minusText) {
        this.minusText = minusText;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    public void printOtziv(){
        System.out.printf("ID:%d LIKES:%d DISLIKES:%d RATING:%d DATEPUBLISH:%tc",id,like,dislike,rating,datePublish);
        System.out.println();
        System.out.printf("ID:%d Имя:%s Фамилия:%s Дата регистрации:%tc Ссылка на аватар:%s",user.getId(),user.getName(),user.getSername(),user.getDateRegister(),user.getPathToAvatar());
        System.out.println();
        System.out.print("Достоинства:"+plusText);
        System.out.println();
        System.out.print("Недостатки:"+minusText);
        System.out.println();
        System.out.print(comment);
        System.out.println();
    }
}
