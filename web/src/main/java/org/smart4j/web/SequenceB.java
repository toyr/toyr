package org.smart4j.web;

/**
 * @author unisk1123
 * @Description
 * @create 2019/6/1
 */
public class SequenceB implements Sequence {

    private static ThreadLocal<Integer> numberContainer = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    public int getNumber() {
        numberContainer.set(numberContainer.get() + 1);
        return numberContainer.get();
    }

    public static void main(String[] args) {
        Sequence sequence = new SequenceB();
        ClientThread client1 = new ClientThread(sequence);
        ClientThread client2 = new ClientThread(sequence);
        ClientThread client3 = new ClientThread(sequence);

        client1.start();
        client2.start();
        client3.start();
    }
}
