package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheesePrice;
    private int toppingPrice;

    private int takeAwayPrice;

    boolean isCheeseAdded;
    boolean isToppingAdded;

    boolean isTakeAwayAdded;

    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.cheesePrice = 80;
        this.takeAwayPrice = 20;

        if(isVeg==true){
            this.price=300;
            this.toppingPrice=70;

        }
        else{
            this.price=400;
            this.toppingPrice=120;
        }
        this.isCheeseAdded=false;
        this.isToppingAdded=false;
        this.isTakeAwayAdded=false;

        this.bill ="Base Price Of The Pizza: "+this.price + "/n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){
            this.price=this.price+cheesePrice;
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded==false){
            this.price=this.price+takeAwayPrice;
            isTakeAwayAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayAdded==false){
            this.price=this.price+takeAwayPrice;
            isTakeAwayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated==false) {
            if (isCheeseAdded == true) {
                this.bill = this.bill + "Extra Cheese Added: " + this.cheesePrice + "/n";
            }
            if (isToppingAdded == true) {
                this.bill = this.bill + "Extra Toppings Added: " + this.toppingPrice + "/n";
            }
            if (isTakeAwayAdded == true) {
                this.price = this.bill + "Paperbag Added: " + this.takeAwayPrice + "/n";
            }
            isBillGenerated = true;

            this.bill = this.bill + "Total Price: " + this.price + "/n";
        }
        return this.bill;
    }
}
