package com.primeiro.primeiro_app_springboot;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
    private ArrayList<PacienteModel> pacientes = new ArrayList<PacienteModel>();

    @GetMapping
    public ArrayList<PacienteModel> getPacientes() {
        return pacientes;
    }

    @GetMapping("/{pacienteId}")
    public Optional<PacienteModel> getPacienteById(@PathVariable UUID pacienteId) {
        return pacientes.stream().filter(p -> p.getId().equals(pacienteId)).findFirst();
    }

    @PostMapping
    public PacienteModel createPaciente(@RequestBody PacienteModel payload) {
        pacientes.add(payload);
        return payload;
    }

    @PutMapping("/{pacienteId}")
    public Optional<PacienteModel> updatePaciente(@PathVariable UUID pacienteId, @RequestBody PacienteModel payload) {
        Optional<PacienteModel> paciente = pacientes.stream().filter(p -> p.getId().equals(pacienteId)).findFirst();
        paciente.ifPresent(p -> {
            p.setNome(payload.getNome());
            p.setIdade(payload.getIdade());
            p.setEndereco(payload.getEndereco());
        });
        return paciente;
    }

    @DeleteMapping("/{pacienteId}")
    public void deletePaciente(@PathVariable UUID pacienteId) {
        Optional<PacienteModel> paciente = pacientes.stream().filter(p -> p.getId().equals(pacienteId)).findFirst();
        paciente.ifPresent(p -> pacientes.remove(p));
        return;
    }

}
