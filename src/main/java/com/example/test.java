package com.example;
public class test {
    public static void main(String[] args){
        Integer counter = 0;
        AnotherLuckyIterator iterator = new AnotherLuckyIterator();
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
