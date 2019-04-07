package com.example.numbertoword;

public class Tens {
    private String tens, one;

    public String getTens(){
        return tens + one;
    }

    public void setTens(int ten) {
        tens = "";
        one = "";
        if (ten >= 10 && ten < 20) {

            switch (ten){
                case 10:
                    this.tens = "Ten";
                    break;
                case 11:
                    this.tens = "Eleven";
                    break;
                case 12:
                    this.tens = "Twelve";
                    break;
                case 13:
                    this.tens = "Thirteen";
                    break;
                case 14:
                    this.tens = "Fourteen";
                    break;
                case 15:
                    this.tens = "Fifteen";
                    break;
                case 16:
                    this.tens = "Sixteen";
                    break;
                case 17:
                    this.tens = "Seventeen";
                    break;
                case 18:
                    this.tens = "Eighteen";
                    break;
                case 19:
                    this.tens = "Nineteen";
                    break;
            }
        } else {
            if (ten % 10 > 0) {
                int modu = ten % 10;
                switch (modu) {
                    case 1:
                        this.one = " One";
                        break;
                    case 2:
                        this.one = " Two";
                        break;
                    case 3:
                        this.one = " Three";
                        break;
                    case 4:
                        this.one = " Four";
                        break;
                    case 5:
                        this.one = " Five";
                        break;
                    case 6:
                        this.one = " Six";
                        break;
                    case 7:
                        this.one = " Seven";
                        break;
                    case 8:
                        this.one = " Eight";
                        break;
                    case 9:
                        this.one = " Nine";
                        break;
                    case 0:
                        this.one = "asd";
                        break;
                }
            }
            if (ten / 10 >= 0) {
                int div = ten / 10;
                switch (div) {
                    case 1:
                        this.tens = "";
                        break;
                    case 2:
                        this.tens = "Twenty";
                        break;
                    case 3:
                        this.tens = "Thirty";
                        break;
                    case 4:
                        this.tens = "Fourty";
                        break;
                    case 5:
                        this.tens = "Fivty";
                        break;
                    case 6:
                        this.tens = "Sixty";
                        break;
                    case 7:
                        this.tens = "Seventy";
                        break;
                    case 8:
                        this.tens = "Eighty";
                        break;
                    case 9:
                        this.tens = "Ninety";
                        break;
                }

            }
        }
    }

}
