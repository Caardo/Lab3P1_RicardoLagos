//Lab3P1_RicardoLagos
//Laboratorio numero 3

package lab3p1_ricardolagos;

import java.util.Scanner;

public class Lab3P1_RicardoLagos {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("B I E N V E N I D O (A/E)");
        System.out.println("1.¡Seseciones y mas suseciones!");
        System.out.println("2.Poket Monster >:D");
        System.out.println("3.¡Asteriscos en CASA!");
        System.out.println("Ingrese una opcion: ");
        int opcion=leer.nextInt();
        while(opcion>0&&opcion<4){
            switch (opcion){
                case 1:
                    System.out.println("Bienvenido (a/e) sucesiones");
                    System.out.println("Ingrese un numero: ");
                    int num=leer.nextInt();
                    System.out.println("Ingrese un diferencia: ");
                    int d=leer.nextInt();
                    System.out.println("Diferencia: "+d);
                    System.out.println("Inicial: "+num);
                    for (int i= 0; i < 10; i++) {
                        System.out.print(num+",");
                        i=num+d;
                        System.out.print(i+",");
                        num=i+d+1;
                        System.out.print(num+" ");
                        
                    }
                break;
                
                case 2:
                    System.out.println("Bienvenido a Poket Monster");
                    System.out.println("Ingrese el modo de pelea pokemon desea: \n1-.Hasta la muerte\n2.Por rondas");
                    int modo =leer.nextInt();
                    System.out.println("Estadisticas de los Pokemones: ");
                    System.out.println("Sylveon Vida:280 Ataque:80 Defensa:15%");
                    System.out.println("Gyarados Vida:300 Ataque:50 Dfensa:10%");
                    System.out.println("Giratina Vida:300 Ataque:70 Defensa:25%");
                    System.out.println("Dragonite Vida:250 Ataque:75 Dfensa:20%");
                    System.out.println("\n Ingrese una Pelea determinada: ");
                    System.out.println("1-.Sylveon VRS Dragonite");
                    System.out.println("2-.Gyarados VRS Giratina ");
                    System.out.println("3-.Dragonite VRS Giratina");
                    System.out.println("4-.Giratina VRS Sylveon");
                    int pelea =leer.nextInt();

                    switch(modo){
                        case 1:
                            if(pelea==1){
                                System.out.println("-------------Ronda 1---------------");
                                System.out.println("Pokemon 1 ha atacado!");
                                System.out.println("Pokemon 2 ha atacado!");
                                double vida1=280;
                                double vida2=250;
                                double ataque1, ataque2;
                                ataque1=vida1-75*0.15;
                                ataque2=vida2-70*0.20;
                                System.out.println("Vida pokemon 1: "+ataque1);
                                System.out.println("Vida pokemon 2: "+ataque2);
                                
                                System.out.println("-------------Ronda 2---------------");
                                System.out.println("Pokemon 1 ha atacado!");
                                System.out.println("Pokemon 2 ha atacado!");
                                double vidaa1=ataque1;
                                double vidaa2=ataque2;
                                double ataquee1, ataquee2;
                                ataquee1=vidaa1-75*0.15;
                                ataquee2=vidaa2-70*0.20;
                                System.out.println("Vida pokemon 1: "+ataquee1);
                                System.out.println("Vida pokemon 2: "+ataquee2);
                                
                                System.out.println("-------------Ronda 3---------------");
                                System.out.println("Pokemon 1 ha atacado!");
                                System.out.println("Pokemon 2 ha atacado!");
                                double vidaaa1=ataquee1;
                                double vidaaa2=ataquee2;
                                double ataqueee1, ataqueee2;
                                ataqueee1=vida1-75*0.15;
                                ataqueee2=vida2-70*0.20;
                                System.out.println("Vida pokemon 1: "+ataqueee1);
                                System.out.println("Vida pokemon 2: "+ataqueee2);
                            }
                            break;
                        case 2:
                            break;
                        default:
                            break;
                    }
                    
                case 3:
                    System.out.println("Ingrese los lados del rectangulo: ");
                    int lados=leer.nextInt();
                    if (lados>=7||lados%2==1){
                    for(int m=0;m<lados;m++){
                        System.out.print(" *");
                    }
                    System.out.println("");
                    for(int p=0;p<lados-2;p++){
                        System.out.print(" *");
                        System.out.print("|");
                        for(int m=0;m<lados-2;m++){
                            System.out.print("  ");
                        }
                        System.out.println("*");
                        }
 
                    
                    for(int m=0;m<lados;m++){
                        System.out.print(" *");
                    }
                    System.out.println("");
                    }
                    else{
                        if(opcion<7&&lados%2==1){
                            System.out.println("No puedes ingresar un numero par y menor que 7");
                        }
                    }
                break;
            }
            System.out.println("\n---------M E N U---------");   
            System.out.println("1.¡Seseciones y mas suseciones!");
            System.out.println("2.Poket Monster >:D");
            System.out.println("3.¡Asteriscos en CASA!");
            System.out.println("0.Para Salir");
            System.out.println("Ingrese una opcion: ");
            opcion=leer.nextInt();
        }
    }
    
}
