
public class PruebasConWhile
{
    /**
     * Metodo que devuelve los multiplos de 5 comprendidos entre 10 y 95.
     */
    public void multiplosDe5()
    {
        int index = 10;
        while (index <= 95){
            System.out.println(index);
            index = index + 5;
        }
    }

    /**
     * Metodo que suma los valores comprendidos entre 1 y 10 y despues imprime la misma.
     */
    public void sumaEntre1y10()
    {
        int index = 1;
        int suma = 0;
        while (index <= 10){
            suma = suma + index;
            index++;
        }
        System.out.println(suma);
    }
    
    /**
     * Metodo que suma los valores comprendidos entre a y b y despues imprime la misma.
     */
    public void sum(int a, int b)
    {
        int index = a;
        int suma = 0;
        while (index <= b){
            suma = suma + index;
            index++;
        }
        System.out.println(suma);
    }
    
    /**
     * Metodo que devuelve true si el numero introducido por parametro es primo
     */
    public boolean isPrime(int n)
    {
        int index = 2;
        boolean primo = true;
        while (primo && index != n){
            if (n % index == 0){
                primo = false;
            }
            index++;
        }
        return primo;
    }
}
