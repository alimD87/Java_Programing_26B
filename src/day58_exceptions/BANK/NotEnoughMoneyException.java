package day58_exceptions.BANK;



    public class NotEnoughMoneyException extends RuntimeException{

        // this is an unchecked exception now because the parent is the RuntimeException class

        public NotEnoughMoneyException(){
            super("Not enough money in the account");
        }

        public NotEnoughMoneyException(String msg){
            super(msg);
        }

    }
