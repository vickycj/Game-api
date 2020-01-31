package com.gamification.digigame.gameengine;

import com.gamification.digigame.gameengine.Animal;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;
    private int userId;
    private List<Animal> animalsObtained = new ArrayList<>();
    private List<Task> tasksList;
    private int currentLevel = Constants.LEVELS.LEVEL_1;
    private int tasksCompletedInCurrentLevel = 0;
    private boolean isLoyalCustomer = false;
    private boolean allTasksCompleted = false;
    private int totalTaskCompleted = 0;

    public User(String userName, int userId, boolean isLoyalCustomer, List<Task> tasks) {
        this.userName = userName;
        this.userId = userId;
        this.isLoyalCustomer = isLoyalCustomer;
        this.tasksList = tasks;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<Animal> getAnimalsObtained() {
        return animalsObtained;
    }

    public void setAnimalsObtained(List<Animal> animalsObtained) {
        this.animalsObtained = animalsObtained;
    }

    public List<Task> getTasksList() {
        return tasksList;
    }

    public void setTasksList(List<Task> tasksList) {
        this.tasksList = tasksList;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public int getTasksCompletedInCurrentLevel() {
        return tasksCompletedInCurrentLevel;
    }

    public void setTasksCompletedInCurrentLevel(int tasksCompletedInCurrentLevel) {
        this.tasksCompletedInCurrentLevel = tasksCompletedInCurrentLevel;
    }

    public boolean isLoyalCustomer() {
        return isLoyalCustomer;
    }

    public void setLoyalCustomer(boolean loyalCustomer) {
        isLoyalCustomer = loyalCustomer;
    }

    public boolean isAllTasksCompleted() {
        return allTasksCompleted;
    }

    public void setAllTasksCompleted(boolean allTasksCompleted) {
        this.allTasksCompleted = allTasksCompleted;
    }

    public int getTotalTaskCompleted() {
        return totalTaskCompleted;
    }

    public void setTotalTaskCompleted(int totalTaskCompleted) {
        this.totalTaskCompleted = totalTaskCompleted;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userId=" + userId +
                ", animalsObtained=" + animalsObtained +
                ", tasksList=" + tasksList +
                ", currentLevel=" + currentLevel +
                ", tasksCompletedInCurrentLevel=" + tasksCompletedInCurrentLevel +
                ", isLoyalCustomer=" + isLoyalCustomer +
                '}';
    }
}
