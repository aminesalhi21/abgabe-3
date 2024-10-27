public class minmax {
    public static void main(String[] args) {
        if (args.length==0){
            System.out.println("ERROR: Bitte mindestens eine Zahl als Argument ubergeben!");
        }
        else if (args.length==1){
            System.out.println(args[0]);
            System.out.println(args[0]);
        }
        else{
            int min=Integer.parseInt(args[0]);
            int max=Integer.parseInt(args[0]);
            for(int i=0 ;i<args.length;i++){
                if(min>Integer.parseInt(args[i])){
                    min=Integer.parseInt(args[i]);
                }
                else if(max<Integer.parseInt(args[i])){
                    max=Integer.parseInt(args[i]);
                }
            }
            System.out.println(min);
            System.out.println(max);

        }
    }
}
