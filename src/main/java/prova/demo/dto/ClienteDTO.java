package prova.demo.dto;



public class ClienteDTO {
    private Long id;
    private String nome;
    private String cognome;
    private String email;

    public ClienteDTO() {}

    public ClienteDTO(Long id, String nome, String cognome, String email) {
        this.email = email;
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
