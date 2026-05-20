package packegeVO;

import java.time.LocalDateTime;

public class userVO{
    private int user_id;
    private String name;
    private String email;
    private String password_hash;
    private LocalDateTime birthdate;
    private String gender;
    private double current_weight;
    private double current_height;
    private int streak;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    public userVO(LocalDateTime birthdate, LocalDateTime created_at, double current_height, double current_weight, String email, String gender, String name, String password_hash, int streak, LocalDateTime updated_at, int user_id) {
        this.birthdate = birthdate;
        this.created_at = created_at;
        this.current_height = current_height;
        this.current_weight = current_weight;
        this.email = email;
        this.gender = gender;
        this.name = name;
        this.password_hash = password_hash;
        this.streak = streak;
        this.updated_at = updated_at;
        this.user_id = user_id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }

    public LocalDateTime getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDateTime birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getCurrent_weight() {
        return current_weight;
    }

    public void setCurrent_weight(double current_weight) {
        this.current_weight = current_weight;
    }

    public double getCurrent_height() {
        return current_height;
    }

    public void setCurrent_height(double current_height) {
        this.current_height = current_height;
    }

    public int getStreak() {
        return streak;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }
}