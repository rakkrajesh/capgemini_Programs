package programs;

//class DollarFigure {
//    public static void main(String[] args) {
//        for(int i = 1; i <= 7; i++) {
//            for(int j = 0; j < 2 * i - 2; j++)
//                System.out.print("*");
//                
//            for(int j = 0; j < -i + 8; j++)
//                System.out.print("$");
//                
//            for(int j = 0; j < -2 * i + 16; j++)
//                System.out.print("*");
//                
//            for(int j = 0; j < -i + 8; j++)
//                System.out.print("$");
//                
//            for(int j = 0; j < 2 * i - 2; j++)
//                System.out.print("*");
//                
//            System.out.println();
//        }
//    }
//}

public class DollarFigure {
    public static void main(String[] args) {

        int n = 0;
        int m = 0;

        for (int i = 0 ; i < 7 ; i++) {
            for (int l = 0 ; l < n ; l++) {
                System.out.print('*');
            }
            for (int j = 0 ; j < 7-m ; j++) {
                System.out.print('$');
            }
            for (int k = 0 ; k < 14-n ; k++) {
                System.out.print('*');
            }
            for (int j = 0 ; j < 7-m ; j++) {
                System.out.print('$');
            }
            for (int l = 0 ; l < n ; l++) {
                System.out.print('*');
            }
            System.out.println();
            m+=1;
            n+=2;
        }
    }
}