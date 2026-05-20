package packegeVO;

public class habit_scheduleVO {
    private int schedule_id;
    private int habit_id;
    private int day_of_week;

    public habit_scheduleVO(int day_of_week, int habit_id, int schedule_id) {
        this.day_of_week = day_of_week;
        this.habit_id = habit_id;
        this.schedule_id = schedule_id;
    }

    public int getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(int schedule_id) {
        this.schedule_id = schedule_id;
    }

    public int getHabit_id() {
        return habit_id;
    }

    public void setHabit_id(int habit_id) {
        this.habit_id = habit_id;
    }

    public int getDay_of_week() {
        return day_of_week;
    }

    public void setDay_of_week(int day_of_week) {
        this.day_of_week = day_of_week;
    }
}
