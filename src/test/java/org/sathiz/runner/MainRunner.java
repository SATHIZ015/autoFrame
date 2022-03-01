package org.sathiz.runner;

import io.cucumber.java.eo.Se;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class MainRunner {
    public static void main(String[] args){

        //System.out.println(System.getenv("browser"));
        //System.out.println(System.getProperty("user.dir"));
        //Map<String, String> map=System.getenv();
        //System.out.println(map);
        //System.out.println(System.getProperties());
        //String path=System.getProperty("user.dir");
        //String canonicalPath=path+"src/test/resource/elements/home.json";
        //C:\Users\SATHIZKUMAR.C7\FrameWork Design\src\test\resource\elements\home.json
        //File file=new File("C:\\Users\\SATHIZKUMAR.C7\\FrameWork Design\\src\\test\\resource\\elements\\home.json");
        //File file=new File("src/test/resource/elements/home.json");
        //System.out.println(file.exists());
        /*String s=System.getenv().get("browser");
        String device=System.getenv().get("device");
        SecurityManager sw=new SecurityManager();
        System.out.println(s);
        System.out.println(device);
        SecurityManager sm=System.getSecurityManager();
        sm.checkPermission(new RuntimePermission("getenv."+"browser"));
        //sm.checkPermission(new RuntimePermission("getenv."+name));*/
        //RunConfig.init();
        //setBeforeHooks();
        //afterHooks();




    }

    private static void setBeforeHooks() {

    }

    private static void afterHooks(){

    }

    /*public static String getEnv(String name){
        name="browser";
        SecurityManager sm=System.getSecurityManager();
        sm.checkPermission(new RuntimePermission("getenv."+"browser"));
        return System.getenv(name);
    }*/
}
