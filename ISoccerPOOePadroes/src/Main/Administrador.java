package Main;

import java.util.Scanner;

public class Administrador {

    Scanner input = new Scanner(System.in);
    public String contaUsuario;
    public String senha;

    public void setContaUsuario(String contaUsuario) {
        this.contaUsuario = contaUsuario;
    }

    public String getContaUsuario() {
        return this.contaUsuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return this.senha;
    }

    public void criarConta() {

        System.out.println("Digite o nome de usuário:");
        setContaUsuario(input.nextLine());

        System.out.println("Digite a senha:");
        setSenha(input.nextLine());

    }

    public boolean verificarConta() {

        System.out.println("Insira o nome de usuário:");
        String contaUsuario = input.nextLine();

        System.out.println("Digite a senha:");
        String senha = input.nextLine();

        if (this.contaUsuario.equals(contaUsuario) && this.senha.equals(senha)) {
            return true;
        }

        System.out.println("Conta ou senha incorreta, pressione Enter para continuar.");
        input.nextLine();

        return false;

    }
}