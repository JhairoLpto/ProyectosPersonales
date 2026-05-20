package packegeVO;

import java.time.LocalDateTime;

public class user_body_metricsVO{
    private int metrid_id;
    private int user_id;
    private double weight;
    private double height;
    private double body_fat_percentage;
    private double muscle_mass;
    private LocalDateTime recorded_at;

    public user_body_metricsVO(double body_fat_percentage, double height, int metrid_id, double muscle_mass, LocalDateTime recorded_at, int user_id, double weight) {
        this.body_fat_percentage = body_fat_percentage;
        this.height = height;
        this.metrid_id = metrid_id;
        this.muscle_mass = muscle_mass;
        this.recorded_at = recorded_at;
        this.user_id = user_id;
        this.weight = weight;
    }

    public int getMetrid_id() {
        return metrid_id;
    }

    public void setMetrid_id(int metrid_id) {
        this.metrid_id = metrid_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
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

    public double getBody_fat_percentage() {
        return body_fat_percentage;
    }

    public void setBody_fat_percentage(double body_fat_percentage) {
        this.body_fat_percentage = body_fat_percentage;
    }

    public double getMuscle_mass() {
        return muscle_mass;
    }

    public void setMuscle_mass(double muscle_mass) {
        this.muscle_mass = muscle_mass;
    }

    public LocalDateTime getRecorded_at() {
        return recorded_at;
    }

    public void setRecorded_at(LocalDateTime recorded_at) {
        this.recorded_at = recorded_at;
    }
}