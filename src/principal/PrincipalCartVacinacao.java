
package principal;

import conexao.Conexao;
import view.InicialView;
import view.LoginView;

public class PrincipalCartVacinacao {

    Conexao objconexao;
    InicialView inicialView;
    LoginView loginView;

    public PrincipalCartVacinacao() {
        objconexao = new Conexao();
        // inicialView = new InicialView();
        loginView = new LoginView();
    }

    public static void main(String[] args) {
        PrincipalCartVacinacao cartVacinacao = new PrincipalCartVacinacao();
    }

}


// Desenvolvimento de uma aplicação com interface gráfico em Java Swing, e conceitos fundamentais de POO, como encapsulamento, herança, MVC, DAO, entre outros e gravação automática em um Banco de Dados SQLite, que simula uma carteirinha de vacinação contra COVID-19.

