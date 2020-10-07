package com.example;

public class AnotherLuckyImpl implements Lucky {
    private final boolean lucky;
    private final String normalChars;
    AnotherLuckyImpl(Integer number){
        this.lucky = isLucky(number) ;
        this.normalChars = addChars(number);
    }
    @Override
    public boolean getLucky() {
        return this.lucky;
    }

    @Override
    public String getNormalChars() {
        return this.normalChars;
    }

    @Override
    public String addChars(Integer number) {
        String normalChars = number.toString();
        switch (number.toString().length()){
            case 3:
                normalChars="0"+normalChars;
                break;
            case 2:
                normalChars="00"+normalChars;
                break;
            case 1:
                normalChars="000"+normalChars;
                break;
        }
        return normalChars;
    }

    @Override
    public boolean isLucky(int digit) {
        int number1=digit/1000%10;
        int number2=digit/100%10;
        int number3=digit/10%10;
        int number4=digit%10;
        return comparable(number1, number2, number3, number4);
    }

    @Override
    public boolean comparable(int... digits) {
        return digits[0] + digits[1]== digits[2] + digits[3];
    }
}
