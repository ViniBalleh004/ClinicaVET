package br.edu.Unicesumar.classe;

public class Agendamento {
    private Animal animal;
    private Medico medico;
    private String data;
    private String hora;

    public Agendamento() {}

    public Animal getAnimal() { return animal; }
    public void setAnimal(Animal animal) { this.animal = animal; }
    public Medico getMedico() { return medico; }
    public void setMedico(Medico medico) { this.medico = medico; }
    public String getData() { return data; }
    public void setData(String data) { this.data = data; }
    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    @Override
    public String toString() {
        String a = (animal != null && animal.getNome() != null) ? animal.getNome() : "(não definido)";
        String m = (medico != null && medico.getNome() != null) ? medico.getNome() : "(não definido)";
        String d = (data != null && !data.trim().isEmpty()) ? data : "(não definido)";
        String h = (hora != null && !hora.trim().isEmpty()) ? hora : "(não definido)";
        return "Agendamento{ animal=" + a + ", medico=" + m + ", data=" + d + ", hora=" + h + " }";
    }
}
