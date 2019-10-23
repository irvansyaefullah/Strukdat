package Tugas;

public class stack {

    private String data[];
    private int size;
    private int top;

    public stack(int volume) {
        size = volume;
        data = new String[size];
        top = -1;
    }
    public boolean isFull(){

        return top == --size;
    }

    public boolean isEmpty() {

        return top == -1;
    }
    public void push(String aja){
        if(isFull()){
            System.out.println(" stack sudah penuh ");
        }else{
            data[++top] = aja;
            System.out.println(aja+ "\t masuk ke dalam stack");
        }
    }

    public void pop (){
        if (isEmpty()){
            System.out.println("stack kosong");
        }else{
            String temp = data[top];
            data[top] = data[top--];
            System.out.println("data "+temp+" dihapus dari dalam stack");
    }}

    public void cetak(){
        System.out.println("\n--------data yang berada dalam stack-------");

        for (int i = 0; i < top+1 ; i++) {
            System.out.println("data stack ke "+i+" = "+data[i]);
        }
        System.out.println("\n");
    }
}
