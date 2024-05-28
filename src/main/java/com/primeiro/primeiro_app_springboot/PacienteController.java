package com.primeiro.primeiro_app_springboot;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
    private ArrayList<PacienteModel> pacientes = new ArrayList<PacienteModel>();

    @GetMapping
    public ArrayList<PacienteModel> getPacientes() {
        return pacientes;
    }

    @PostMapping
    public PacienteModel createPaciente(@RequestBody PacienteModel payload) {
        pacientes.add(payload);
        return payload;
    }
}
