
package sistema.exception;

public class ValorInvalidoException extends Exception {

    // mensagem de erro + campo + exception

    private String nomeCampo;

    public ValorInvalidoException(String mensagem, Exception origem, String nomeCampo) {
        this(mensagem, origem);
        this.nomeCampo = nomeCampo;


        // super(mensagem, origem);  super se refere a SuperClasse (PAI) no caso: Exception

        // super(); chama o construtor da SuperClasse;  
    }


    public ValorInvalidoException(String mensagem, Exception origem) {
        super(mensagem, origem); // super se refere a SuperClasse (PAI) Exception
        // super(); chama o construtor da SuperClasse;  
    }
    

}
