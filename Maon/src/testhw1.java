public class testhw1 {
    public static void main(String[] args) {
        if(Firsthw.add(1,2)!=3){
            System.out.println("Error: correct ans is 3 but code gives "+Firsthw.add(1,2));
        }
        if(Firsthw.add(0,1,2)!=3){
            System.out.println("Error: correct ans is 3 but code gives "+Firsthw.add(0,1,2));
        }
        if(Firsthw.add(0,1,2,3)!=6){
            System.out.println("Error: correct ans is 6 but code gives "+Firsthw.add(1,2));
        }
        if(Firsthw.add(0,1,2,3,4)!=3){
            System.out.println("Error: correct ans is 10 but code gives "+Firsthw.add(0,1,2,3,4));
        }
        if(Firsthw.subtract(4,1)!=3){
            System.out.println("Error: correct ans is 3 but code gives "+Firsthw.subtract(4,1));
        }
    }
}