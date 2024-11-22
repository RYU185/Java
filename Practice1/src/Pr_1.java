class Pr_1 {
    public static void main(String[] args) {
        int numOfApples = 123; // 사과의 개수
        int sizeOfBucket = 10; // ( ) 바구니의 크기 바구니에 담을 수 있는 사과의 개수
        int numOfBucket = ( (numOfApples/sizeOfBucket) +1) ; // 모든 사과를 담는데 필요한 바구니의 수
        System.out.println(" :"+numOfBucket);  // 필요한 바구니의 수

        int num = 10;
        System.out.println(num > 0 ? "양수": (num<0 ? 0:"음수") );

        int num2 = 111;
        System.out.println( num2/100*100 );

        int num3 = 778;
        System.out.println( num3/10*10+1 );

        int num4 = 24;
        System.out.println( 10-num4%10 );

        int sum = 0;
        int total = 0;
        for (int i=1; i<=10; i++){
            sum = sum+i;
            total = sum+sum;
        }
        System.out.println(total);

        int x;
        int y;
        
    }
}
