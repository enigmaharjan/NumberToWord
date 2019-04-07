package com.example.numbertoword;

public class Ones {
    private String one;

    public String getOne() {
        return one;
    }

    public void setOne(int one) {
        switch (one) {
            case 1:
                this.one = "One";
                break;
            case 2:
                this.one = "Two";
                break;
            case 3:
                this.one = "Three";
                break;
            case 4:
                this.one = "Four";
                break;
            case 5:
                this.one = "Five";
                break;
            case 6:
                this.one = "Six";
                break;
            case 7:
                this.one = "Seven";
                break;
            case 8:
                this.one = "Eight";
                break;
            case 9:
                this.one = "Nine";
                break;

        }
    }


}
