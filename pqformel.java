public class pqformel {
    public static void main(String[] args) {
        if(args.length==2){
            Double p=Double.parseDouble(args[0]);
            Double q=Double.parseDouble(args[1]);
            Double D=(p*p/4)-q;
            if(D>0){
                Double x1=-(p/2)+Math.sqrt(D);
                Double x2=-(p/2)-Math.sqrt(D);
                if (x1<x2){
                    System.out.println(x1);
                    System.out.println(x2);
                }
                else{
                    System.out.println(x2);
                    System.out.println(x1); 
                }
            }
            else if(D==0){
                Double x=-p/2;
                System.out.println(x);
            }
            else{
                System.out.println("Es gibt keine reellen Nullstellen.");
            }
        }
        else{
            System.out.println("ERROR: genau zwei Argumente erwartet");
        }
    }
}
