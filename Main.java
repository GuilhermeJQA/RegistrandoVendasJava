package RegistrandoVendas;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        DecimalFormat x = new DecimalFormat("0.00");
        //– Criar um produto que não está em promoção
        //– Criar um vendedor
        //– Criar uma venda
        //– Setar o produto e o vendedor na venda
        //– Informar que a venda é referente a dois itens
        //– Calcular o valor da venda
        //– Imprimir o valor da comissão do vendedor
        //– Imprimir a venda
        Produto Product1 = new Produto(001,"Relógio de pulso da Shopee",200,100,false);
        Vendedor Vendedor1 = new Vendedor("Carlos", "Bessa",2193);
        Venda Vendanumero1 = new Venda();
        Vendanumero1.setProduto(Product1);
        Vendanumero1.setVendedor(Vendedor1);
        Vendanumero1.setQuantidadedeItens(2);
        Vendanumero1.calcularValor();
        Vendanumero1.calcularComissao();
        System.out.println("Comissao do vendedor: R$" +(x.format(Vendanumero1.getVendedor().getComissao())));
        Vendanumero1.imprimir();

        //– Criar um produto que está em promoção, com valor
        //de custo = 80 e valor de venda = 100
        //– Criar outro vendedor
        //– Criar outra venda
        //– Setar o produto e o vendedor na venda
        //– Informar que a venda é referente a três itens
        //– Efetuar um desconto de 10%
        //– Calcular o valor da venda
        //– Imprimir o valor da comissão do vendedor
        //– Imprimir a venda

        Produto Product2 = new Produto(002,"Camisa do Brasil 2022 Amarela",100,80,true);
        Vendedor Vendedor2 = new Vendedor("Jorge","Tambiá",2103);
        Venda VendaNumero2 = new Venda();
        VendaNumero2.setVendedor(Vendedor2);
        VendaNumero2.setProduto(Product2);
        VendaNumero2.setQuantidadedeItens(3);
        VendaNumero2.setDesconto(10);
        VendaNumero2.efetuarDesconto(VendaNumero2.getDesconto());
        VendaNumero2.calcularValor();
        VendaNumero2.calcularComissao();
        System.out.println("A comissão do vendedor foi: R$"+(x.format(VendaNumero2.getVendedor().getComissao())));
        VendaNumero2.imprimir();

        //– Criar outra venda
        //– Setar o produto e o vendedor do slide anterior na
        //nova venda
        //– Informar que a venda é referente a dois itens
        //– Efetuar um desconto de 30% (perceba que esse
        //desconto vai fazer com que o produto seja vendido
        //abaixo do preço de custo!!!!!)
        //– Calcular o valor da venda
        //– Imprimir o valor da comissão do vendedor
        //– Imprimir a venda

        Venda VendaNumero3 = new Venda();
        VendaNumero3.setVendedor(Vendedor2);
        VendaNumero3.setProduto(Product2);
        VendaNumero3.setQuantidadedeItens(2);
        VendaNumero3.setDesconto(30);
        VendaNumero3.efetuarDesconto(VendaNumero3.getDesconto());
        VendaNumero3.calcularValor();
        VendaNumero2.calcularComissao();
        System.out.println("O valor da comissão do vendedor foi: R$"+(x.format(VendaNumero3.getVendedor().getComissao())));
        VendaNumero3.imprimir();
    }
}
