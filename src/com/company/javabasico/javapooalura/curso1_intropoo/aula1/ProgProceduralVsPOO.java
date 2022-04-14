package com.company.javapooalura.curso1_intropoo.aula1;

public class ProgProceduralVsPOO {
    public static void main(String[] args) {
        /*

    Imagina que você trabalha no sistema de uma padaria, onde vc tem um formulário pra cadastro e mais uns 36 outros formulários. Em todos eles tem um campo de cpf pro usuário (seja o consumidor ou o
    funcionário da padaria) cadastrar cpfs. O paradigma utilizado pra desenvolver esse sistema é o da programação procedural/estruturada, que tem como base o desenvolvimento orientado a procedimentos,
    em suma: pra cada solução que eu quiser encontrar, um procedimento. Sendo assim, o código desses formulários deve parecer com isso:

    //campos do formulário:
    var nome = db.form1.nome;
    var cpf = db.form1.cpf;
    var cidade = db.form1.cidade;

    (db = database);

    var sucesso = validaCpf(cpf)

    if(sucesso) {
        gravarNoBanco(nome, cpf, cidade);
    } else {
        mostrarErro();
    }

    Isso é uma boa solução, mas não é reutilizável. Digamos que antes esse form não tinha uma regra de negócio pra validar cpf, mas agora tem. Suponha tb que depois de um tempo TODOS os formulários
    vão precisar cumprir essa regra também. O complicado aqui é que PRA CADA FORMULÁRIO, vai ter que ser feito um ctrl c ctrl v dessa regra de validar o cpf + o if, e substituir oq precisa no código, e etc.
    E o dev vai ter que ir pesquisando todos os formulários através do ctrl f, oq vai demandar tempo e trabalho. Além disso imagina se chega uma pessoa nova que nem sabia dessa regra de negócio, aí vai ser feito
    um manualzao das regras do desenvolvimento? Complicado sabe. E outra, o dev novo vai lá e vai acabar implementando em mais um lugar a validação de CPF, gerando outro local que vai precisar de alteração mais
    pra frente se alguma regra for alterada ou adicionada. Por isso que é procedural, pq vai sempre se multiplicando o trabalho.

    Aí é por isso que a Orientação em Objetos entra em jogo. Ela vai facilitar tudo isso por meio de concentrar todos os requisitos desse código dentro de um único protótipo, que é a classe. Aí caso entrem
    regras novas, é só um único dev ir lá, mexer na classe e acrescentar o método validarCpf() pro atributo cpf, dentro dessa classe. E tá pronto, o restante foi alterado e pode validar cpf a partir dessa
    classe.

    -> Na POO dado e funcionalidade andam juntos.

*/
    }

}
