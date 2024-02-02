
package encriptador;
import java.util.Scanner;

public class Encriptador {
     static char menu(Scanner te)
    {
        char op;
        System.out.println("\na.- Registro de información\nb.- Mostrar información\nc.- Mostrar total de hombres y mujeres\n"
                + "d.- Calificación mas baja...\ne.-Agregar un punto a las mujeres\nf.-Cambiarle el sexo a los reprobados\ng.-Mostrar el promedio grupal\nx.- Salir");
        op=te.nextLine().charAt(0);
        
        return op;
    }
    static String encriptar(String tex){
        String texEn="";
        for(int i=0; i<tex.length();i++){
            if(tex.charAt(i)=='a' && tex.charAt(i) != ' '){
                texEn+=tex.charAt(i)+"i";
            }else if(tex.charAt(i)=='e' && tex.charAt(i) != ' '){
                texEn+=tex.charAt(i)+"nter"; 
            }else if(tex.charAt(i)=='i' && tex.charAt(i) !=' '){
                texEn+=tex.charAt(i)+"mes"; 
            }else if(tex.charAt(i)=='o' && tex.charAt(i) !=' '){
                texEn+=tex.charAt(i)+"ber"; 
            }else if(tex.charAt(i)=='u' && tex.charAt(i) !=' '){
                texEn+=tex.charAt(i)+"fat"; 
            }else{
              texEn+=tex.charAt(i);  
            }
        }
        
        return texEn;
    }
    /*static String desencriptar(String encriptado){
        String desencriptado=" ";
        a= ai
          e=enter
          i=imes
          o=ober
          u=ufat 
      
    }*/
    static String desencriptar(String encriptado) {
    String desencriptado = "";
    
    for (int i = 0; i < encriptado.length(); i++) {
        if (i < encriptado.length() - 1) {
            if (encriptado.charAt(i) == 'a' && encriptado.charAt(i + 1) == 'i') {
                desencriptado += 'a';
                i++;
            } else if (encriptado.charAt(i) == 'e' && encriptado.charAt(i + 1) == 'n' && encriptado.charAt(i + 2) == 't' && encriptado.charAt(i + 3) == 'e' && encriptado.charAt(i + 4) == 'r') {
                desencriptado += 'e';
                i += 4;
            } else if (encriptado.charAt(i) == 'i' && encriptado.charAt(i + 1) == 'm' && encriptado.charAt(i + 2) == 'e' && encriptado.charAt(i + 3) == 's') {
                desencriptado += 'i';
                i += 3;
            } else if (encriptado.charAt(i) == 'o' && encriptado.charAt(i + 1) == 'b' && encriptado.charAt(i + 2) == 'e' && encriptado.charAt(i + 3) == 'r') {
                desencriptado += 'o';
                i += 3;
            } else if (encriptado.charAt(i) == 'u' && encriptado.charAt(i + 1) == 'f' && encriptado.charAt(i + 2) == 'a' && encriptado.charAt(i + 3) == 't') {
                desencriptado += 'u';
                i += 3;
            } else {
                desencriptado += encriptado.charAt(i);
            }
        } else {
            desencriptado += encriptado.charAt(i);
        }
    }

    return desencriptado;
}
    static String Desencriptar(String tex){
        String texDes="";
        for(int i=0; i<tex.length();i++){
            if(i<tex.length()-1){
                if(tex.charAt(i)=='a' && tex.charAt(i+1)=='i' ){
                texDes+='a';
                i++;
                 }else if(tex.charAt(i)=='e' && tex.charAt(i+1)=='n' && tex.charAt(i+2) == 't' && tex.charAt(i+3) == 'e'&& tex.charAt(i+4) == 'r'){
                    texDes+='e';
                    i+=4;
                }else if(tex.charAt(i)=='i' && tex.charAt(i+1)=='m' && tex.charAt(i+2) == 'e' && tex.charAt(i+3) == 's' ){
                    texDes+='i';
                    i+=3;
                }else if(tex.charAt(i)=='o' && tex.charAt(i+1)=='b' && tex.charAt(i+2) == 'e' && tex.charAt(i+3) == 'r' ){
                texDes+='o'; 
                i+=3;
                }else if(tex.charAt(i)=='u' && tex.charAt(i+1)=='f' && tex.charAt(i+2) == 'a' && tex.charAt(i+3) == 't' ){
                texDes+='u'; 
                i+=3;
                }else{
                texDes+=tex.charAt(i);
                }
           
            }else
                 texDes+=tex.charAt(i); 
          
               
        }
            
        
        return texDes;
    }
        
    public static void main(String[] args) {
      Scanner tec = new Scanner (System.in);
      String textoEn,textoDes;
        System.out.println("Ingresa el texto a encriptar: ");
        textoEn=tec.nextLine();
        System.out.println("El texto encriptado es: "+encriptar(textoEn));
        System.out.println("Ingresa el texto a desencriptar: ");
        textoDes=tec.nextLine();
       
       System.out.println("El texto desencriptado es: "+Desencriptar(textoDes));
      
    }
 
}
