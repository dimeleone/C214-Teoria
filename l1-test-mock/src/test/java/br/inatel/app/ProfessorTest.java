package br.inatel.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProfessorTest {

    private ProfessorService service;
    private BuscaProfessor buscaProfessor;

    @Before
    public void setup() {
        service = new MockProfessorService();
        buscaProfessor = new BuscaProfessor(service);
    }

    @Test
    public void testeListaProfessorChris() {
        Professor professor = buscaProfessor.buscaProfessor("Chris");

        assertEquals("Chris", professor.getNomeDoProfessor());
        assertEquals("08:00", professor.getHorarioDeAtendimento());
        assertEquals("Integral", professor.getPeriodo());
        assertEquals("1", professor.getSala());
        assertEquals("1", professor.getPredio());
    }

    @Test
    public void testeListaProfessorRenzo() {
        Professor professor = buscaProfessor.buscaProfessor("Renzo");

        assertEquals("Renzo", professor.getNomeDoProfessor());
        assertEquals("09:00", professor.getHorarioDeAtendimento());
        assertEquals("Integral", professor.getPeriodo());
        assertEquals("2", professor.getSala());
        assertEquals("1", professor.getPredio());
    }

    @Test
    public void testeListaProfessorGuilherme() {
        Professor professor = buscaProfessor.buscaProfessor("Guilherme");

        assertEquals("Guilherme", professor.getNomeDoProfessor());
        assertEquals("10:00", professor.getHorarioDeAtendimento());
        assertEquals("Integral", professor.getPeriodo());
        assertEquals("6", professor.getSala());
        assertEquals("2", professor.getPredio());
    }

    @Test
    public void testeListaProfessorJoao() {
        Professor professor = buscaProfessor.buscaProfessor("Joao");

        assertEquals("Joao", professor.getNomeDoProfessor());
        assertEquals("13:00", professor.getHorarioDeAtendimento());
        assertEquals("Integral", professor.getPeriodo());
        assertEquals("7", professor.getSala());
        assertEquals("2", professor.getPredio());
    }

    @Test
    public void testeListaProfessorMaria() {
        Professor professor = buscaProfessor.buscaProfessor("Maria");

        assertEquals("Maria", professor.getNomeDoProfessor());
        assertEquals("14:00", professor.getHorarioDeAtendimento());
        assertEquals("Integral", professor.getPeriodo());
        assertEquals("11", professor.getSala());
        assertEquals("3", professor.getPredio());
    }

    @Test
    public void testeListaProfessorPedro() {
        Professor professor = buscaProfessor.buscaProfessor("Pedro");

        assertEquals("Pedro", professor.getNomeDoProfessor());
        assertEquals("19:00", professor.getHorarioDeAtendimento());
        assertEquals("Noturno", professor.getPeriodo());
        assertEquals("12", professor.getSala());
        assertEquals("3", professor.getPredio());
    }

    @Test
    public void testeListaProfessorPaulo() {
        Professor professor = buscaProfessor.buscaProfessor("Paulo");

        assertEquals("Paulo", professor.getNomeDoProfessor());
        assertEquals("20:00", professor.getHorarioDeAtendimento());
        assertEquals("Noturno", professor.getPeriodo());
        assertEquals("16", professor.getSala());
        assertEquals("4", professor.getPredio());
    }

    @Test
    public void testeListaProfessorCarlos() {
        Professor professor = buscaProfessor.buscaProfessor("Carlos");

        assertEquals("Carlos", professor.getNomeDoProfessor());
        assertEquals("21:00", professor.getHorarioDeAtendimento());
        assertEquals("Noturno", professor.getPeriodo());
        assertEquals("17", professor.getSala());
        assertEquals("4", professor.getPredio());
    }

    @Test
    public void testeListaProfessorAna() {
        Professor professor = buscaProfessor.buscaProfessor("Ana");

        assertEquals("Ana", professor.getNomeDoProfessor());
        assertEquals("22:00", professor.getHorarioDeAtendimento());
        assertEquals("Noturno", professor.getPeriodo());
        assertEquals("20", professor.getSala());
        assertEquals("5", professor.getPredio());
    }

    @Test
    public void testeListaProfessorJose() {
        Professor professor = buscaProfessor.buscaProfessor("Jose");

        assertEquals("Jose", professor.getNomeDoProfessor());
        assertEquals("23:00", professor.getHorarioDeAtendimento());
        assertEquals("Noturno", professor.getPeriodo());
        assertEquals("21", professor.getSala());
        assertEquals("5", professor.getPredio());
    }

    @Test
    public void testeListaProfessorInexistente() {
        Professor professor = buscaProfessor.buscaProfessor("Inexistente");

        assertNull(professor);
    }

    @Test
    public void testeListaProfessorNomeNulo() {
        Professor professor = buscaProfessor.buscaProfessor(null);

        assertNull(professor);
    }

    @Test
    public void testeListaProfessorNomeVazio() {
        Professor professor = buscaProfessor.buscaProfessor("");

        assertNull(professor);
    }

    @Test
    public void testePredioInvalidoProfessorChris() {
        Professor professor = buscaProfessor.buscaProfessor("Chris");

        assertNotEquals("2", professor.getPredio());
    }

    @Test
    public void testePredioInvalidoProfessorRenzo() {
        Professor professor = buscaProfessor.buscaProfessor("Renzo");

        assertNotEquals("3", professor.getPredio());
    }

    @Test
    public void testePredioInvalidoProfessorGuilherme() {
        Professor professor = buscaProfessor.buscaProfessor("Guilherme");

        assertNotEquals("1", professor.getPredio());
    }

    @Test
    public void testePredioInvalidoProfessorJoao() {
        Professor professor = buscaProfessor.buscaProfessor("Joao");

        assertNotEquals("1", professor.getPredio());
    }

    @Test
    public void testePredioInvalidoProfessorMaria() {
        Professor professor = buscaProfessor.buscaProfessor("Maria");

        assertNotEquals("2", professor.getPredio());
    }

    @Test
    public void testePredioInvalidoProfessorPedro() {
        Professor professor = buscaProfessor.buscaProfessor("Pedro");

        assertNotEquals("4", professor.getPredio());
    }

    @Test
    public void testePredioInvalidoProfessorPaulo() {
        Professor professor = buscaProfessor.buscaProfessor("Paulo");

        assertNotEquals("3", professor.getPredio());
    }
}
