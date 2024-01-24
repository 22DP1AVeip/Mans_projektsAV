package rvt;

public class PaymentTerminal {
        private double money;  // amount of cash
        private int affordableMeals; // number of sold affordable meals
        private int heartyMeals;  // number of sold hearty meals
    
        public PaymentTerminal() {
            this.money = 1000.0;
        }
    
        public double eatAffordably(double payment) {

            double affordableMealPrice = 2.50;
            
            if (payment >= affordableMealPrice) {
                this.money += affordableMealPrice;
                this.affordableMeals++;
                return payment - affordableMealPrice;
            } else {
                return payment;
            }
        }
    
        public double eatHeartily(double payment) {
            double heartyMealPrice = 4.30;
    
            if (payment >= heartyMealPrice) {
                this.money += heartyMealPrice;
                this.heartyMeals++;
                return payment - heartyMealPrice;
            } else {
                return payment; 
            }
        }
    
        public String toString() {
            return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
        }
    
    

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        double affordableMealPrice = 2.50;

        if (card.takeMoney(affordableMealPrice)) {
            this.affordableMeals++;
            return true;
        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        double heartyMealPrice = 4.30;

        if (card.takeMoney(heartyMealPrice)) {
            this.heartyMeals++;
            return true;
        } else {
            return false;
        }
    }

public void addMoneyToCard(PaymentCard card, double sum) {
    if (sum > 0) {
        this.money += sum;
        card.addMoney(sum);
    }
}
}