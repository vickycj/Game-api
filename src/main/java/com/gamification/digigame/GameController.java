package com.gamification.digigame;

import com.gamification.digigame.gameengine.GameRunner;
import com.gamification.digigame.gameengine.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/digigame")
public class GameController {


    @Autowired
    GameRunner gameRunner;

    @GetMapping(path="/getUserDetails")
    public @ResponseBody User getUserDetails(@RequestParam int userId) {
        return gameRunner.getUserDetails(userId);
    }

    @PostMapping(path= "/postTask")
    public @ResponseBody User postTask(@RequestParam int userId, @RequestParam int taskId){
        return gameRunner.postTaskCompletion(userId,taskId);
    }

}
