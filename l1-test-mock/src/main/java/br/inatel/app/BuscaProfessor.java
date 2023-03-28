package br.inatel.app;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaProfessor {

    ProfessorService professorService;

    public BuscaProfessor(ProfessorService professorService) {
        this.professorService = professorService;
    }

    public Professor buscaProfessor(String nome) {
        String professorJson = professorService.listarProfessor(nome);

        if (professorJson == null) {
            return null;
        }

        JsonObject jsonObject = JsonParser.parseString(professorJson).getAsJsonObject();

        return new Professor(jsonObject.get("nomeDoProfessor").getAsString(),
            jsonObject.get("horarioDeAtendimento").getAsString(),
            jsonObject.get("periodo").getAsString(),
            jsonObject.get("sala").getAsString(),
            jsonObject.get("predio").getAsString());
    }
}
