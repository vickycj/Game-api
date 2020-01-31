package com.gamification.digigame.gameengine;

@org.springframework.stereotype.Service
public class GameRunner {

    private Service service = new Service();

    public User postTaskCompletion(int userId, int taskId){

        return service.postTaskCompletion(userId,taskId);
    }

    public User getUserDetails(int userId){
        return service.getUserDetails(userId);
    }

}
