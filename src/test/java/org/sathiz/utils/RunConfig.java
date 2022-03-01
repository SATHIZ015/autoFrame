package org.sathiz.utils;





//Decide Browser , env variables , configurations
//Collect from edit configurations
//Use properties files to get all details

public class RunConfig {
    public static String browser=getenv("browser");
    //Url should be provided
    public static String website=getenv("website");
    public static String device =getenv("device");


    public static String getenv(String name){
        if(name!=null) {
            return System.getenv().get(name);
        }
        //use default env variables if not provided
        else {
            if(name.equalsIgnoreCase("browser")){
                browser="chrome";
            }
            else if(name.equalsIgnoreCase("device")){
                device="Desktop";
            }

        }
        return name+ "is not found in the env variables & Please provide env variables correctly";
    }


}
