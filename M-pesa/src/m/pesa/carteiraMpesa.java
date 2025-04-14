
/*

CRIADOR: Edylson Luis Temporario dos santos
PROFISSAO: Desenvolvedor de software, web e mobile
Localizaca: Moazmbique
Cidade: Quelimane
Contacto: +258 869955418
Enderreco: edylsondossantos02@gmail.com

*/
package m.pesa;

import java.util.Scanner;

//aqui contem o metodo todod que iremos usar com suas variaveis

public class carteiraMpesa {

    private static double saldo = 100.00; //saldo com variavel constante
    private static String metical = "MZ"; //referencia de moeda do seu pais
    private static long PIN = 8522;
    
    public static void main(String[] args) {
  
        menu();
        Scanner scanner = new Scanner(System.in);
        
    }
      
    public static void menu(){
       
      while(true){
          
          //COLOUE A SUA PREFERENCIA
        
        System.out.println("Menu do M-pesa"); 
        System.out.println("Digite a opcao que deseja");
        System.out.println("1. Adicionar fundo na carteira");
        System.out.println("2. Levantar dinheiro");
        System.out.println("3. Transferir dinheiro");       
        System.out.println("4. Verificar saldo");
        System.out.println("");
        System.out.println("0. Voltar");
        
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        
        switch (opcao){
            case 1:
            System.out.println("Digite o valor o valor que deseja adicionar:");
            double adicionar = scanner.nextInt();
            adicionarFundo(adicionar);
            break;
            
            case 2:
            System.out.println("Digite o valor que pretende levantar:");
            int levantar = scanner.nextInt();
            levantarDinheiro(levantar);
            break;
            
            case 3:
            System.out.println("Adicionar o numero de telefone:");
            double transferir = scanner.nextInt();
            transferirDinheiro(transferir);
            break;
            
            case 4:
            System.out.println("Digite seu pin:");
            double consultarSaldo = scanner.nextInt();
            consultarSaldo(consultarSaldo);
            break;
            
            case 0:
            System.exit(0);
            System.out.println(cancelar);
            break;
            default:
                System.out.println("Opcao invalida.");
               
        }
      }
    }
    public static void adicionarFundo(double valor){
        //METODO DE ADCICONAR DINHEIRO
        if(valor >  0){
            saldo += valor;
            System.out.println("Confirmado adinheiro adicionado na sua conta no valor de " + valor + metical + ". Seu saldo actual e de " + saldo + metical  + ". Tudo bom pra ti.");
            System.exit(0);
        }else{
            System.out.println(errorException);
            System.exit(0);
        }
        
    }
    
    public static void levantarDinheiro(double levantar){
        //METODO DE LEVANTAR DINHEIRO
        Scanner input = new Scanner(System.in);
        
        if(levantar <= saldo){
            saldo -= levantar;
            System.out.println("Digite seu pin");
            int code = input.nextInt();
        if(code == PIN){
            System.out.println("Confirmado levantaste " + levantar + metical + " no agete CLEYTON MARCOS. Seu saldo actual de " + saldo + metical + ". Tudo bom pra ti.");
            System.exit(0);
        }else{
            System.out.println(errorPIN);
            System.exit(0);
        
        }
        
        }else{
            System.out.println("Digite seu pin");
            int code = input.nextInt();
            if(code == PIN){
            System.out.println(saldoInsuficiente);
            System.exit(0);
        }else{
            System.out.println(errorPIN);
            System.exit(0);
        
        }
            
        }
        
         
    }
    
    public static void transferirDinheiro(double transferir){
        
        //COLOQUE AQUI SEU CODIGO DE TRANSFERENCIA DE DINHEIRO
        
        
    }
    
    public static void consultarSaldo(double consultarSaldo){
        
        //METODO DE CONSULATAR SALDO
        
        if(consultarSaldo==PIN){
            System.out.println("Confirmado seu saldo actua e de " + saldo + metical + " referencia IIR/869955418E. Tudo bom pra ti.");
            System.exit(0);
        }else{
            System.out.println(errorPIN);
            System.exit(0);
        }
        
    }
    
    public static void errorException(){
        System.out.println("Error USSD");
    }
    
    //VARIAVEIS DE MESSAGEM DE ERRO E SUCESSO
    
    private static String errorPIN = "Falhou pin, verifique e tente novamente.";
    private static String errorException = "Operacao sem sucesso.";
    private static String saldoInsuficiente = "Operacao sem sucesso, saldo insuficiente.";
    private static String cancelar = "Operacao cancelada.";
}
