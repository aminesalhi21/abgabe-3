public class Newton {

    public static void main(String[]args) {
        if (args.length==0) {
            System.out.println("ERROR: keine Argumente uebergeben");
            return;
        }
        Double c;
        try{
            c= Double.parseDouble(args[0]);
        }catch (NumberFromatException e){
            System.out.println("ERROR: Argument ist keine gültige Zahl");
            return;
        }
        if (c < 0) {
            System.out.println("ERROR: kann keine Wurzel aus negativen Zahlen ziehen");
        }
        else if(c==0){
            System.out.println(0.0);
        }
        else{
            double t = c;
            while (Math.abs(t * t - c) > 0.0001) {
                t = (t + c/ t)/ 2;
        }
            System.out.println(t);
        }
    }
    
}
