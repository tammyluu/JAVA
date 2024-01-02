package org.example.inheritance.ParentsChild.data;

public class Parents {
    protected String assetOne;
    protected String asserTwo;

    public Parents(String assetOne, String asserTwo) {
        this.assetOne = assetOne;
        this.asserTwo = asserTwo;
    }

    public String getAssetOne() {
        return assetOne;
    }

    public void setAssetOne(String assetOne) {
        this.assetOne = assetOne;
    }

    public String getAsserTwo() {
        return asserTwo;
    }

    public void setAsserTwo(String asserTwo) {
        this.asserTwo = asserTwo;
    }

    @Override
    public String toString() {
        return "Parents{" +
                "assetOne='" + assetOne + '\'' +
                ", asserTwo='" + asserTwo + '\'' +
                '}';
    }
    public void showProfile(){
        System.out.println("PARENTS have " + " assetOne: " + assetOne + " and assetTwo: " + asserTwo);
    }
}
