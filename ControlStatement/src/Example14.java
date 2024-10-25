public class Example14 {
    public static void main(String[] args) {
        // 매개변수로 전달한 문자의 범위안에 모음의 갯수를 리턴하는 메서드
        // 모든 문자는 유니코드상의 숫자로 치환됨
        // 영어의 모음 A E I O U a e i o u
        // 대문자 'A'=65 ~ 'Z'=90
        // 소문자 'a'=97 ~ 'z'=122
        // 91=[, 92=\, 93=], 94=^, 95=_, 96=`
        System.out.println(findVowelCount('A', 'Z')); // 5
        System.out.println(findVowelCount('b', 'p')); // 3
        System.out.println(findVowelCount('j', 'n')); // 0
    }

    public static int findVowelCount(char x, char y) {
        char[] chars = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        for (int i = x; i <= y; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (i == chars[j]) {
                    count = count + 1;
                }
            }
        } return count;
    }
}




//    public static int findVowelCount(char x, char y) {
//        int count = 0;
//        for (int i = x; i <= y; i++) {
//            switch (i) {
//                case 'A':
//                case 'E':
//                case 'I':
//                case 'O':
//                case 'U':
//                case 'a':
//                case 'e':
//                case 'i':
//                case 'o':
//                case 'u':
//                    count = count + 1;
//                    break;
//            }
//        } return count;
//    }
//        }
//            if (i >= 91 && i <= 96) {
//                continue;
//            }
//            if (i == 'A' || i == 'E' || i == 'I' || i == 'O' || i == 'U' || i == 'a' || i == 'e' ||
//                    i == 'i' || i == 'o' || i == 'u') {
//                count = count + 1;
//            }
//        } return count;







    /*public static int findVowelCount(char x, char y){
        int count = 0;
        for (int i=x; i<=y; i++) {
            if (i >= 91 && i <= 96) {
                continue;
            }
            if (i == 'A') {
                count = count + 1;
            }
            if (i == 'E') {
                count = count + 1;
            }
            if (i == 'I') {
                count = count + 1;
            }
            if (i == 'O') {
                count = count + 1;
            }
            if (i == 'U') {
                count = count + 1;
            }
            if (i == 'a') {
                count = count + 1;
            }
            if (i == 'e') {
                count = count + 1;
            }
            if (i == 'i') {
                count = count + 1;
            }
            if (i == 'o') {
                count = count + 1;
            }
            if (i == 'u') {
                count = count + 1;
            }
        } return count;
    }
}*/