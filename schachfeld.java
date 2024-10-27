public class schachfeld {
    public static void main(String[] args) {
        if (args.length==0){
            System.out.println("ERROR: BITTE  die Größe des Feldes als Argument übergeben!");
        }
        else{
            for(int i=0;i<Integer.parseInt(args[0]);i++){
                if (i%2==0){
                    for(int j=0;j<Integer.parseInt(args[0]);j+=2){
                        System.out.print("*");
                        System.out.print(" ");
                    }
            }
                else{
                    for(int j=1;j<Integer.parseInt(args[0]);j+=2){
                        System.out.print(" ");
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }
}
