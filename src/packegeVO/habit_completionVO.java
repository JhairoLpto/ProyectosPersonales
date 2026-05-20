package packegeVO;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class habit_completionVO {
    private int completion_id;
    private int habit_id;
    private LocalDate completion_date;
    private boolean completed;
    private LocalDateTime completed_at;

    public habit_completionVO(boolean completed, LocalDateTime completed_at, LocalDate completion_date, int completion_id, int habit_id) {
        this.completed = completed;
        this.completed_at = completed_at;
        this.completion_date = completion_date;
        this.completion_id = completion_id;
        this.habit_id = habit_id;
    }

    public int getCompletion_id() {
        return completion_id;
    }

    public void setCompletion_id(int completion_id) {
        this.completion_id = completion_id;
    }

    public int getHabit_id() {
        return habit_id;
    }

    public void setHabit_id(int habit_id) {
        this.habit_id = habit_id;
    }

    public LocalDate getCompletion_date() {
        return completion_date;
    }

    public void setCompletion_date(LocalDate completion_date) {
        this.completion_date = completion_date;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDateTime getCompleted_at() {
        return completed_at;
    }

    public void setCompleted_at(LocalDateTime completed_at) {
        this.completed_at = completed_at;
    }
}
