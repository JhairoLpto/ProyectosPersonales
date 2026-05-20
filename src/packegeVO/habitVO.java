package packegeVO;

import java.time.LocalDateTime;

public class habitVO {
    private int habit_id;
    private int user_id;
    private String name;
    private String description;
    private LocalDateTime created_at;

    public habitVO(LocalDateTime created_at, String description, int habit_id, String name, int user_id) {
        this.created_at = created_at;
        this.description = description;
        this.habit_id = habit_id;
        this.name = name;
        this.user_id = user_id;
    }

    public int getHabit_id() {
        return habit_id;
    }

    public void setHabit_id(int habit_id) {
        this.habit_id = habit_id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }
}
