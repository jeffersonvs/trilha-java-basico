import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner Ler = new Scanner(System.in);

        System.out.println("Por favor digite a agencia:");
        String Agencia = Ler.nextLine();
        System.out.println("Entre com sua conta:");
        int Numero = Ler.nextInt();
        System.out.println("Vamos conhecer você, digite seu nome:");
        String NomeCliente = Ler.nextLine();
        System.out.println("Quase lá, falta o seu saldo:");
        Double Saldo = Ler.nextDouble();

        Ler.close();


        System.out.println("Olá "+ NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo "+ Saldo +" já está disponível para saque");
    }
}
