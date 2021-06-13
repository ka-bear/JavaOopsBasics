public class Main {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(Firsthw.add(i,j)!=i+j){
                    System.out.println("Fail");
                }
            }
        }
    }
}
