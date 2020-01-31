package com.gamification.digigame.gameengine;



public class GenerateAnimal {


    public Animal getAnimal(User userdetails, boolean isLoyalCustomer){

        Animal animal = null;
        int taskCount = userdetails.getTasksCompletedInCurrentLevel();

        switch (userdetails.getCurrentLevel()){
            case Constants.LEVELS.LEVEL_1: {
                animal = isLoyalCustomer?
                        findAndGetAnimal(taskCount,Rules.VALUED_CUSTOMER.LEVEL_1) :
                        findAndGetAnimal(taskCount,Rules.NON_VALUED_CUSTOMER.LEVEL_1);
                break;
            }
            case Constants.LEVELS.LEVEL_2: {
                animal = isLoyalCustomer?
                        findAndGetAnimal(taskCount,Rules.VALUED_CUSTOMER.LEVEL_2) :
                        findAndGetAnimal(taskCount,Rules.NON_VALUED_CUSTOMER.LEVEL_2);
                break;
            }
            case Constants.LEVELS.LEVEL_3: {
                animal = isLoyalCustomer?
                        findAndGetAnimal(taskCount,Rules.VALUED_CUSTOMER.LEVEL_3) :
                        findAndGetAnimal(taskCount,Rules.NON_VALUED_CUSTOMER.LEVEL_3);
                break;
            }
            default: {

            }


        }
        return animal;
    }

    private Animal findAndGetAnimal(int taskCount ,String[] rules){
        Animal animal = null;
        switch (rules[taskCount]){
            case Constants.CATEGORY.LOW: {
                animal = Constants.ANIMALS_CATEGORY.LOW_ANIMALS[0];
                break;
            }
            case Constants.CATEGORY.MEDIUM: {
                animal = Constants.ANIMALS_CATEGORY.MEDIUM_ANIMALS[Utils.getRandomNumberBetweenTwo(0,2)];
                break;
            }
            case Constants.CATEGORY.HIGH: {
                animal = Constants.ANIMALS_CATEGORY.HIGH_ANIMALS[0];
                break;
            }
            default: {

            }
        }
        return animal;
    }


}
