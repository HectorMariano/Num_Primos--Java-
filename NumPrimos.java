import java.util.Scanner;

public class NumPrimos {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num; 

        System.out.printf("\nIngrese el numero hasta el que quieres calcular los numeros primos: ");
        num = entrada.nextInt();
        System.out.print("\n 2");
        entrada.close();
        
        for(int i = 2; i<num; i++){

            for(int y = 2; y<9; y++){
                int aux;
                aux = i;

                if(aux % y == 0 ){
                    break;
                }
                else{
                    System.out.print(", " + aux);
                    break;
                }
            }
            if(i % 40 == 0){
                System.out.print("\n");
            }
        }
    }
}
