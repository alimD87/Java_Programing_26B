package day58_exceptions.BANK;



    public class InvalidCredentialsException extends Exception{
        // this is a checked exception now because the parent is the Exception class

        public InvalidCredentialsException(String msg){
            super(msg);
        }
}
