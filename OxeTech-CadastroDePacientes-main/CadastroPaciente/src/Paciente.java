class Paciente {
    public String nome;
    public String cpf;
    public String cartaoSUS;
    public String especialidade;

    public Paciente(String nome, String cpf, String cartaoSUS, String especialidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.cartaoSUS = cartaoSUS;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCartaoSUS() {
        return cartaoSUS;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}
