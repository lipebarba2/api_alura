package med.voll.api.paciente.Paciente;

import med.voll.api.Endereco.EnderecoMedico;

public record Pacientes(String nome, String email, EnderecoMedico endereco) {
}
