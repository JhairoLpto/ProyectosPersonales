package packegeVO;

import java.time.LocalDateTime;

public class userVO{
    private int user_id;
    private String name;
    private double weight;
    private double height;
    private LocalDateTime birthdate;
    private int streak;

    public userVO(LocalDateTime birthdate, double height, String name, int streak, int user_id, double weight) {
        this.birthdate = birthdate;
        this.height = height;
        this.name = name;
        this.streak = streak;
        this.user_id = user_id;
        this.weight = weight;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public LocalDateTime getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDateTime birthdate) {
        this.birthdate = birthdate;
    }

    public int getStreak() {
        return streak;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }
}