import Montagem.Dos.computadores.Computador;
import Montagem.Dos.computadores.MemoriaUSB;
import Clientes.Cliente;
import java.util.Scanner;

//Ian Romancini Marques
//392
//GES
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Cliente[] clientes = new Cliente[1];

       clientes[0] = new Cliente();
       clientes[0].setNome("Ian");
       clientes[0].setCpf(123456789l);


        Computador Promoção1 = new Computador();
        MemoriaUSB MemoriaP1 = new MemoriaUSB();

        Computador Promoção2 = new Computador();
        MemoriaUSB MemoriaP2 = new MemoriaUSB();

        Computador Promoção3 = new Computador();
        MemoriaUSB MemoriaP3 = new MemoriaUSB();


        MemoriaP1.setNome("Pen-Drive");
        MemoriaP1.setCapacidade(16);
        Promoção1.addMemoriaUSB(MemoriaP1);

        MemoriaP2.setNome("Pen-Drive");
        MemoriaP2.setCapacidade(32);
        Promoção2.addMemoriaUSB(MemoriaP2);

        MemoriaP3.setNome("HD Externo");
        MemoriaP3.setCapacidade(1000);
        Promoção3.addMemoriaUSB(MemoriaP3);

        Promoção1.setMarca("Apple");
        Promoção1.setPreco(5000f);
        Promoção1.setHb("Pentium Core i3 (2200 Mhz)", 8);
        Promoção1.setSo("Linux Ubuntu", 32);

        Promoção2.setMarca("Samsung");
        Promoção2.setPreco(6234f);
        Promoção2.setHb("Pentium Core i5 (3370 Mhz)", 16);
        Promoção2.setSo("Windows 8", 64);

        Promoção3.setMarca("Dell");
        Promoção3.setPreco(10678f);
        Promoção3.setHb("Pentium Core i7 (4500 Mhz)", 32);
        Promoção3.setSo("Windows 10", 64);

        System.out.println(" ");
        System.out.println("Temos 3 modelos de computador, escolha-os de sua preferência, para finalizar a compra, digite 0.");
        System.out.println("Você poderá escolher mais de um.");

         float total = 0f;
    for (int i = 0; i < 15; i++)
        {
            System.out.println(" ");
            System.out.println("Digite qual PC você deseja?  (Para finalizar a compra, digite 0)");
            int modelo = entrada.nextInt();

            if (modelo == 1) {
                System.out.println("Modelo 1 selecionado");
                Promoção1.mostraPCConfigs();
                total += clientes[0].calculaTotalCompra(Promoção1);

            } else if (modelo == 2) {
                System.out.println("Modelo 2 selecionado");
                Promoção2.mostraPCConfigs();
                total += clientes[0].calculaTotalCompra(Promoção2);

            } else if (modelo == 3) {
                System.out.println("Modelo 3 selecionado");
                Promoção3.mostraPCConfigs();
                total += clientes[0].calculaTotalCompra(Promoção3);

            } else if (modelo == 0) {
                entrada.close();
                System.out.println("Nome: " + clientes[0].getNome());
                System.out.println("CPF: " + clientes[0].getCpf());
                System.out.printf("Total da compra: R$" + total);
                break;

            }
            else {
                System.out.println("Digito não reconhecido");

            }

        }


    }
}