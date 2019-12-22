package lesson7.Practise;

import java.util.Date;

public class User {
    private int id;
    private String name;
    private String sername;
    private Date dateRegister;
    private String pathToAvatar;

    public User(int id, String name, String sername, Date dateRegister, String pathToAvatar) {
        this.id = id;
        this.name = name;
        this.sername = sername;
        this.dateRegister = dateRegister;
        this.pathToAvatar = pathToAvatar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }

    public Date getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(Date dateRegister) {
        this.dateRegister = dateRegister;
    }

    public String getPathToAvatar() {
        return pathToAvatar;
    }

    public void setPathToAvatar(String pathToAvatar) {
        this.pathToAvatar = pathToAvatar;
    }
}
