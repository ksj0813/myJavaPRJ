public class TEST {
        public static void main(String[] args) {
            int size=5;

            for(int i=0; i<size; i++){
                for(int j=0; j<size-i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j=0; j<2*i-1;j++) {
                    System.out.print(" ");
                }
                if(i !=0){
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i=0; i<2*size+1; i++) {
                System.out.print("*");
            }
            System.out.println();

            for (int i =size-1; i>=0 ;i--) {
                for (int j=0; j < size-i ;j++){
                    System.out.print(" ");
                }

                System.out.print("*");
                for (int j=0; j<2*i-1; j++){
                    System.out.print(" ");
                }


                if(i !=0){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }


