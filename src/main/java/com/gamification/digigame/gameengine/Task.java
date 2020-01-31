package com.gamification.digigame.gameengine;

public class Task {

    private int taskId;
    private String taskDescription;
    private int taskLevel;
    private boolean isTaskCompleted = false;

    public Task(int taskId, String taskDescription, int taskLevel) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.taskLevel = taskLevel;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public int getTaskLevel() {
        return taskLevel;
    }

    public void setTaskLevel(int taskLevel) {
        this.taskLevel = taskLevel;
    }

    public boolean isTaskCompleted() {
        return isTaskCompleted;
    }

    public void setTaskCompleted(boolean taskCompleted) {
        isTaskCompleted = taskCompleted;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", taskDescription='" + taskDescription + '\'' +
                ", taskLevel=" + taskLevel +
                ", isTaskCompleted=" + isTaskCompleted +
                '}';
    }
}
