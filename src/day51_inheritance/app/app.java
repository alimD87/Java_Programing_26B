package day51_inheritance.app;

public class app {

    String name;
    double version;

    public app(String name, double version){
        this.name = name;
        this.version = version;
    }

    public void download(){
        System.out.println(name + " is downloading version " + version);
    }

}

/*
Create an App class

    - create variables:
        name (app name), version

    - create constructor to initialize the variables

    - create method:
        download()
            Example output: prints $name is downloading version $version

 */

