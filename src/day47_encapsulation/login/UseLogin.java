package day47_encapsulation.login;

import day47_encapsulation.login.Login;

public class UseLogin {
    public static void main(String[] args) {

        Login obj = new Login();
//        obj.username = "jamesbond";
//        obj.password = "1234";
        // cannot access private variables directly

        obj.setUsername("jamesbond");
        obj.setPassword("1234");

//        System.out.println(obj.username);
//        System.out.println(obj.password);

        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());

        obj.setPassword("james0007bond");
        System.out.println(obj.getPassword());

    }
}
