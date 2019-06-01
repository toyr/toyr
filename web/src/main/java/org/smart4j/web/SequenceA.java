package org.smart4j.web;

/**
 * @author unisk1123
 * @Description
 * @create 2019/6/1
 */
public class SequenceA implements Sequence {

    private static int number = 0;

    public int getNumber() {
        number = number + 1;
        return number;
    }

    public static void main(String[] args) {
        final SequenceA sequenceA = new SequenceA();
        final ClientThread clientThread1 = new ClientThread(sequenceA);
        final ClientThread clientThread2 = new ClientThread(sequenceA);
        final ClientThread clientThread3 = new ClientThread(sequenceA);

        clientThread1.start();
        clientThread2.start();
        clientThread3.start();
    }

}
