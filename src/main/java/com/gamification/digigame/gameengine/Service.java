package com.gamification.digigame.gameengine;

import java.util.ArrayList;
import java.util.List;

public class Service {

    private Persistance persistance = Persistance.getInstance();
    private GenerateAnimal generateAnimal = new GenerateAnimal();

    public User postTaskCompletion(int userId, int taskId) {

        User user = persistance.getUserDetails(userId);
        List<Task> tasks = user.getTasksList();


        for (Task it : tasks) {
            if (it.getTaskId() == taskId) {
                it.setTaskCompleted(true);
            }
        }

        updateUserDetails(user);

        user.setTotalTaskCompleted(user.getTotalTaskCompleted() + 1);

        if (user.getTotalTaskCompleted() == 9) {
            user.setAllTasksCompleted(true);
        }


        if (user.isAllTasksCompleted()) {
            if (eligibleForDino(user)) {
                user.getAnimalsObtained().add(Constants.ANIMALS.DINO);
            }
        }

        return user;

    }

    public User getUserDetails(int userId) {
        return persistance.getUserDetails(userId);
    }

    private void updateUserDetails(User user) {
        if (user.getTasksCompletedInCurrentLevel() == 2 && user.getCurrentLevel() != Constants.LEVELS.LEVEL_3) {
            user.setCurrentLevel(user.getCurrentLevel() + 1);
            user.setTasksCompletedInCurrentLevel(0);
        } else {
            if(user.getTasksCompletedInCurrentLevel() < 2) {
                user.setTasksCompletedInCurrentLevel(user.getTasksCompletedInCurrentLevel() + 1);
            }
        }
        user.getAnimalsObtained().add(generateAnimal.getAnimal(user, user.isLoyalCustomer()));
    }

    private boolean eligibleForDino(User user) {
        List<String> animalsList = new ArrayList<>();
        for (Animal it : user.getAnimalsObtained()) {
            animalsList.add(it.getAnimalName());
        }

        if (animalsList.contains(Constants.ANIMALS_NAMES.LION)
                && animalsList.contains(Constants.ANIMALS_NAMES.TIGER)
                && animalsList.contains(Constants.ANIMALS_NAMES.MONKEY)
                && animalsList.contains(Constants.ANIMALS_NAMES.GOAT)) {
            return true;
        }

        return false;
    }

    private boolean checkLevels(int taskId, int currentLevel) {
        return (taskId <= 3 && currentLevel == Constants.LEVELS.LEVEL_1)
                || (taskId > 3 && taskId <= 6 && currentLevel == Constants.LEVELS.LEVEL_2)
                || (taskId > 6 && currentLevel == Constants.LEVELS.LEVEL_3);
    }
}
