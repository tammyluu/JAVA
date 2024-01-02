package org.example.inheritance.ParentsChildV2.data;

public class Child extends Parents {
    private String assetThree;

    public Child(String assetOne, String c, String assetThree) {
        // call to super must be first statement in constructor
        super(assetOne,assetOne );
        this.assetThree = assetThree;
    }

    public String getAssetThree() {
        return assetThree;
    }

    public void setAssetThree(String assetThree) {
        this.assetThree = assetThree;
    }

    @Override
    public void showProfile(){
        System.out.println("CHILD have " + " assetOne: " + assetOne + " and assetTwo: " + asserTwo+ " and assetThree: " + assetThree);
    }
    public void sayHi(){
        System.out.println("I'm a child. I'm a rich kid");
        System.out.println("By the way, my 3rd asset is : "  + assetThree);
    }
}
