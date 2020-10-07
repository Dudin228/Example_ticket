package com.example;
public class LuckyImpl implements Lucky {
    private final boolean lucky;
    private final String sixChar;
    LuckyImpl(Integer number){
        this.lucky = isLucky(number) ;
        this.sixChar = addChars(number);
    }
    @Override
    public boolean getLucky() {
        return lucky;
    }
    @Override
    public String getNormalChars() {
        return sixChar;
    }
    @Override
    public String addChars(Integer number){ // Добавление нулей в начало числа, если знаков меньше 6
        String normalChars = number.toString();
        switch (number.toString().length()){
            case 1:
                normalChars="00000"+normalChars;
                break;
            case 2:
                normalChars="0000"+normalChars;
                break;
            case 3:
                normalChars="000"+normalChars;
                break;
            case 4:
                normalChars="00"+normalChars;
                break;
            case 5:
                normalChars="0"+normalChars;
                break;
        }
        return normalChars;
    }
    @Override
    public boolean isLucky(int digit){ //Определение счастливый ли билет
        int number1=digit/100000%10;
        int number2=digit/10000%10;
        int number3=digit/1000%10;
        int number4=digit/100%10;
        int number5=digit/10%10;
        int number6=digit%10;
        return comparable(number1, number2, number3, number4, number5, number6);
    }
    @Override
    public boolean comparable(int... digits){ //Сравнение первых и последних 3х чисел
        return digits[0] + digits[1] + digits[2] == digits[3] + digits[4] + digits[5];
    }
}
