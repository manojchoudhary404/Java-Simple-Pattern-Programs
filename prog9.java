public class prog9 {
    public static void main(String args[]){
        int rows = 5;
        for(int i =1 ;i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");

                }
                
            }
            System.out.println("");
        }
    }
    
}
