package com.company;

interface Food {
    public void prepare();
}

class Hamburger implements Food {

    @Override
    public void prepare() {
        System.out.println("Making Hamburger");
    }

}

class Pizza implements Food {

    @Override
    public void prepare() {
        System.out.println("Making Pizza");
    }
}

class FoodFactory {
    public Food getFood(String nameFood) {
        if (nameFood == null) {
            return null;
        } else if (nameFood == "Pizza") {
            return new Pizza();
        } else if (nameFood == "Hamburger") {
            return new Hamburger();
        }
        return null;
    }

}


class OrderFood {


    public Food processOrder(String foodType) {
        return new FoodFactory().getFood(foodType);
    }
}

