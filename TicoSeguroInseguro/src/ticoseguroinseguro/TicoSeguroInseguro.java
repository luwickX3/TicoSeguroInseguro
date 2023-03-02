package ticoseguroinseguro;
import java.util.Scanner;

public class TicoSeguroInseguro 
{
    public static void main(String[] args) 
    {
        Scanner Scan = new Scanner(System.in);
        int impresoras;
        int sacacopias;
        int computadoras;
        int total[] = new int [3];
        int necesidades[][] = new int [3][3];
        System.out.print("ingrese la cantidad de impresoras:");
        impresoras = Scan.nextInt();
        System.out.print("ingrese la cantidad de sacacopias:");
        sacacopias = Scan.nextInt();
        System.out.print("ingrese la cantidad de computadoras:");
        computadoras = Scan.nextInt();
        //lili
        System.out.print("impresoras que necesita lili:");
        necesidades[0][0] = Scan.nextInt();
        System.out.print("sacacopias que necesita lili:");
        necesidades[0][1] = Scan.nextInt();
        System.out.print("computadoras que necesita lili:");
        necesidades[0][2] = Scan.nextInt();
        //lolo
        System.out.print("impresoras que necesita lolo:");
        necesidades[1][0] = Scan.nextInt();
        System.out.print("sacacopias que necesita lolo:");
        necesidades[1][1] = Scan.nextInt();
        System.out.print("computadoras que necesita lolo:");
        necesidades[1][2] = Scan.nextInt();
        //lulu
        System.out.print("impresoras que necesita lulu:");
        necesidades[2][0] = Scan.nextInt();
        System.out.print("sacacopias que necesita lulu:");
        necesidades[2][1] = Scan.nextInt();
        System.out.print("computadoras que necesita lulu:");
        necesidades[2][2] = Scan.nextInt();
        total[0] = impresoras;
        for (int i = 0; i < 3; i++)
        {
            if(total[0] > 0)
            {
                total[0] = total[0]-Math.abs(necesidades[i][0]);
            }
        }
        if (total[0] < 0)
        {
            System.out.print("Error, no hay suficientes impresoras"); 
        }
        else
        {
            total[1] = sacacopias;
            for (int i = 0; i < 3; i++)
            {
                if(total[1] > 0)
                {
                    total[1] = total[1]-Math.abs(necesidades[i][1]);
                }
            }
            if (total[1] < 0)
            {
                System.out.print("Error, no hay suficientes sacacopias"); 
            }
            else
            {
                total[2] = computadoras;
                for (int i = 0; i < 3; i++)
                {
                    if(total[2] > 0)
                    {
                        total[2] = total[2]-Math.abs(necesidades[i][2]);
                    }
                }
                if (total [2] < 0)
                {
                    System.out.print("Error, no hay suficientes computadoras");
                }
                else
                {
                    System.out.println("Despues de cubrir las necesidades de los trabajadores, los resultados son:");
                    System.out.print("impresoras: "+total[0]+", sacacopias:"+total[1]+", computadoras:"+total[2]);
                }
            }
            
        }
        
    }
    
}
