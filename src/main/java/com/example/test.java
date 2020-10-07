package com.example;
import java.util.function.Consumer;
import java.util.function.Function;
public class test {
    public static void main(String[] args){
        Integer counter = 0;
        AnotherLuckyIterator iterator = new AnotherLuckyIterator();
        Consumer<Integer> consumer = aInt -> aInt++;
        Function<Integer,Integer> function = aInt -> ++aInt;
        while (iterator.hasNext()){
            Lucky next = iterator.next();
            if (next.getLucky()){
                System.out.println(next.getNormalChars());
                counter++;
            }
        }
        System.out.println(counter);
    }
    /**
     * Возвращает экземпляр для проверки
     * @param i номер
     * @return обьект, реализующий (@Link Lucky)
     */
    private static LuckyImpl getCandidate(int i) {
        return new LuckyImpl(i);
    }
}
