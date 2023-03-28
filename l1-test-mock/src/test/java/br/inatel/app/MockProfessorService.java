package br.inatel.app;

public class MockProfessorService implements ProfessorService {

    public String listarProfessor(String nome) {
        if (nome == null) {
            return null;
        }

        if (nome.equals("Chris")) {
            return ProfessorConst.CHRIS;
        } else if (nome.equals("Renzo")) {
            return ProfessorConst.RENZO;
        } else if (nome.equals("Guilherme")) {
            return ProfessorConst.GUILHERME;
        } else if (nome.equals("Joao")) {
            return ProfessorConst.JOAO;
        } else if (nome.equals("Maria")) {
            return ProfessorConst.MARIA;
        } else if (nome.equals("Pedro")) {
            return ProfessorConst.PEDRO;
        } else if (nome.equals("Paulo")) {
            return ProfessorConst.PAULO;
        } else if (nome.equals("Carlos")) {
            return ProfessorConst.CARLOS;
        } else if (nome.equals("Ana")) {
            return ProfessorConst.ANA;
        } else if (nome.equals("Jose")) {
            return ProfessorConst.JOSE;
        } else {
            return null;
        }
    }
}
