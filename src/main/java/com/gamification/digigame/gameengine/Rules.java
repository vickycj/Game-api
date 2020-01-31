package com.gamification.digigame.gameengine;

import java.util.ArrayList;
import java.util.List;

public class Rules {


    public static class NON_VALUED_CUSTOMER {
        public static final String[] LEVEL_1 = {
                Constants.CATEGORY.HIGH,Constants.CATEGORY.LOW,Constants.CATEGORY.LOW};

        public static final String[] LEVEL_2 = {
                Constants.CATEGORY.LOW,Constants.CATEGORY.LOW,Constants.CATEGORY.MEDIUM};

        public static final String[] LEVEL_3 = {
                Constants.CATEGORY.HIGH,Constants.CATEGORY.LOW,Constants.CATEGORY.MEDIUM};
    }

    public static class VALUED_CUSTOMER {
        public static final String[] LEVEL_1 = {
                Constants.CATEGORY.MEDIUM,Constants.CATEGORY.LOW,Constants.CATEGORY.LOW};

        public static final String[] LEVEL_2 = {
                Constants.CATEGORY.LOW,Constants.CATEGORY.MEDIUM,Constants.CATEGORY.MEDIUM};

        public static final String[] LEVEL_3 = {
                Constants.CATEGORY.LOW,Constants.CATEGORY.LOW,Constants.CATEGORY.HIGH};
    }

    public static class TASKS_LIST {

        private static final String TASK_1 = "Login to Internet Banking";
        private static final String TASK_2 = "Fund in 15k rs";
        private static final String TASK_3 = "Use Debit card for transaction above 500rs";
        private static final String TASK_4 = "Make a transaction above 10k";
        private static final String TASK_5 = "Fund in 30k rs";
        private static final String TASK_6 = "Make UPI Transaction";
        private static final String TASK_7 = "Invest in Term Deposit/ Fixed Deposit";
        private static final String TASK_8 = "Start Mutual Fund";
        private static final String TASK_9 = "Refer a Friend";
        private static List<Task> tasks =  new ArrayList<>();

        static {
            tasks.add(new Task(1, TASK_1, Constants.LEVELS.LEVEL_1));
            tasks.add(new Task(2, TASK_2, Constants.LEVELS.LEVEL_1));
            tasks.add(new Task(3, TASK_3, Constants.LEVELS.LEVEL_1));
            tasks.add(new Task(4, TASK_4, Constants.LEVELS.LEVEL_2));
            tasks.add(new Task(5, TASK_5, Constants.LEVELS.LEVEL_2));
            tasks.add(new Task(6, TASK_6, Constants.LEVELS.LEVEL_2));
            tasks.add(new Task(7, TASK_7, Constants.LEVELS.LEVEL_3));
            tasks.add(new Task(8, TASK_8, Constants.LEVELS.LEVEL_3));
            tasks.add(new Task(9, TASK_9, Constants.LEVELS.LEVEL_3));
        }

        public static List<Task> gettasksList(){
            return tasks;
        }
    }


}
