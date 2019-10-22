package Tugas;

public class testqueue {
    public static void main(String[] args) {

        queue objek = new queue(5);

        objek.push(4);
        objek.push(7);
        objek.push(9);
        objek.push(10);
        objek.push(3);
        objek.print();

        objek.pop();
        objek.pop();
        objek.pop();
        objek.print();

    }
}
