package com.devxschool;

// TODO CONFIGURE THE CLASS
public class IPhone extends CellPhone {

    private String type,cameraSpec, security;

    IPhone( String type, String cameraSpec, String security){
        this.type = type;
        this.cameraSpec = cameraSpec;
        this.security = security;

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

}
