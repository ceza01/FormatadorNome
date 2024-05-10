public class Respeitoso implements FormatadorNome{
    private String genero;

    public Respeitoso(String genero) {
        this.genero = genero;
    }

    @Override
    public String formatarNome(String nome, String sobrenome) {
        return genero.equals("masculino") ? "Sr." + " " + sobrenome : "Sra." + " " + sobrenome;
    }
}
