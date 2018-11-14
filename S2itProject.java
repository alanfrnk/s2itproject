package s2itproject;

/**
 *
 * @author alanfrank
 */
public class S2itProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Transform trans = (a, b) -> {
            String saida = "";
            
            char[] digitosPrimeiroElemento = String.valueOf( a ).toCharArray();
            char[] digitosSegundoElemento = String.valueOf( b ).toCharArray();
            
            if (digitosPrimeiroElemento.length > digitosSegundoElemento.length) {
                for (int i = 0; digitosPrimeiroElemento.length > i; i++) {
                    
                    saida += digitosPrimeiroElemento[i];
                    
                    if (digitosSegundoElemento.length > i)
                        saida += digitosSegundoElemento[i];
                }
            } else {
                for (int i = 0; digitosPrimeiroElemento.length > i; i++) {
                    
                    saida += digitosPrimeiroElemento[i];
                                        
                    saida += digitosSegundoElemento[i];
                    
                    if (digitosPrimeiroElemento.length - 1 == i) {
                        i++;
                        while (digitosSegundoElemento.length > i) {
                            saida += digitosSegundoElemento[i++];
                        }
                    }
                }
            }
            
            Integer c = Integer.valueOf(saida);
            if (c > 1000000)
                return -1;
            else
                return c;
        }; 
        
        // ### Mudar entradas aqui para testar ####
        System.out.println("" + trans.transform(545, 123) );
    }
    
    public interface Transform { 
        Integer transform(int a, int b); 
    } 
}
