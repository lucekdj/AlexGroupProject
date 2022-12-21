package com.devxschool;

// TODO CONFIGURE THE CLASS
public class Samsung extends CellPhone{

    private String type,cameraSpec, security;

    private int externalStorage;

    public Samsung ( String type, String cameraSpec, String security, int externalStorage){
        this.type = type;
        this.cameraSpec = cameraSpec;
        this.security = security;
        this.externalStorage = externalStorage;

    }


    public  String getType(){
        return type;


    }
    public void setType(String type){
        this.type = type;
    }

    public  String getCameraSpecs(){
        return null;
    }

    public void setExternalStorage(int externalStorage) {
        this.externalStorage = externalStorage;
    }

    public int getExternalStorage() {
        return externalStorage;
    }

    public  void setCameraSpecs(String cameraSpecs){
        this.cameraSpec = cameraSpecs;
    }

    public  void call(String number){
        System.out.println("Calling to  " + number + "from" + type + "...");
    }

    public  void text(String number, String message){
        System.out.println("Sending message " + message + "to " + number + "from" + type + "...");

    }
    public void  takePhoto(){
        System.out.println("Takes a photo from iphone" + type +" with " + cameraSpec );
    }


    public void unlock(){
        System.out.println("Unlockig using " + security);
    }

    public void printExternalStorageSize(){
        System.out.println("Samsung " + type + " has external storage of size: " + externalStorage);
    }

}
