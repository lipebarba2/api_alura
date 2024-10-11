package med.voll.api.controller;


import med.voll.api.paciente.Paciente.Pacientes;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController  {

    @PostMapping
    public void cadastroPacientes(@RequestBody Pacientes pacientes) {
        System.out.println(pacientes);
    }
}
