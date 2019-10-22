package Tugas;

public class queue {
    private int data [] ;

    public queue(int array) {
        data = new int[array];
    }

    public void push (int antrian){
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 0){
                data [i] = antrian;
                System.out.println("no antrian "+i+" = "+data[i]); break;
            }
        }
    }

    public void pop () {
        for (int i = 0; i < data.length ; i++) {
            if (data[i]!=0){
                System.out.println("panggil nomor antrian = "+data[i]);
                data[i]=0;break;
            }
        }
    }

    public void print(){
        System.out.println("\n==========(Nomor yang ada di ruang tunggu)===========");
        for (int i = 0; i < data.length; i++){
            if (data[i]!=0){
            System.out.println("no : "+data[i]);
            }
        }
        System.out.println("====================================================\n");
    }
}
