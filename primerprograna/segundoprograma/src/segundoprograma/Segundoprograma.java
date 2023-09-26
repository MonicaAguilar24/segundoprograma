package segundoprograma;
public class Segundoprograma {
public static void main(String[] args) {
Scanner leer=new Scanner (System.in);
float num1,num2,res;

System.out.print("Ingresa el primer valor: ");
num1=leer.nextFloat();
 
 System.out.print("Ingresa el segundo numero: ");  
 num2=leer.nextFloat();
         
 res=num1+num2;
 
 System.out.print("La suma es: "+ res);
    }
}
