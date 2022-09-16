class Withoutloop1 {

    public static void WithoutLoop(int n) {
        if (n <= 10) {
            System.out.println(n);
            WithoutLoop(n + 1);
        }
    }

    public static void main(String[] args){
        WithoutLoop(1);
    }
}
