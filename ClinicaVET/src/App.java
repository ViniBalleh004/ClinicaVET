import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para armazenar os dados
        String nomeAnimal = "", tipoAnimal = "", donoAnimal = "";
        String nomeMedico = "", especialidadeMedico = "", crmvMedico = "";
        String dataConsulta = "", horaConsulta = "";
        boolean animalCadastrado = false, medicoCadastrado = false, consultaAgendada = false;

        int opcao;
        do {
            System.out.println("\n--- CLÍNICA VETERINÁRIA (SIMPLIFICADA) ---");
            System.out.println("1. Cadastrar Animal");
            System.out.println("2. Cadastrar Médico");
            System.out.println("3. Agendar Consulta");
            System.out.println("4. Visualizar Dados");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1: // Cadastro do Animal
                    System.out.println("\n--- CADASTRO DO ANIMAL ---");
                    System.out.print("Nome do animal: ");
                    nomeAnimal = scanner.nextLine();
                    System.out.print("Tipo (ex: Cachorro, Gato): ");
                    tipoAnimal = scanner.nextLine();
                    System.out.print("Nome do dono: ");
                    donoAnimal = scanner.nextLine();
                    animalCadastrado = true;
                    System.out.println("Animal cadastrado com sucesso!");
                    break;

                case 2: // Cadastro do Médico
                    System.out.println("\n--- CADASTRO DO MÉDICO ---");
                    System.out.print("Nome do médico: ");
                    nomeMedico = scanner.nextLine();
                    System.out.print("Especialidade: ");
                    especialidadeMedico = scanner.nextLine();
                    System.out.print("CRMV: ");
                    crmvMedico = scanner.nextLine();
                    medicoCadastrado = true;
                    System.out.println("Médico cadastrado com sucesso!");
                    break;

                case 3: // Agendamento
                    if (!animalCadastrado || !medicoCadastrado) {
                        System.out.println("\nERRO: Cadastre o animal e o médico antes de agendar!");
                    } else {
                        System.out.println("\n--- AGENDAMENTO DE CONSULTA ---");
                        System.out.print("Data (DD/MM/AAAA): ");
                        dataConsulta = scanner.nextLine();
                        System.out.print("Hora (HH:MM): ");
                        horaConsulta = scanner.nextLine();
                        consultaAgendada = true;
                        System.out.println("\nConsulta agendada com sucesso!");
                    }
                    break;

                case 4: // Visualizar Dados
                    System.out.println("\n--- DADOS CADASTRADOS ---");
                    if (animalCadastrado) {
                        System.out.println("\nANIMAL:");
                        System.out.println("Nome: " + nomeAnimal);
                        System.out.println("Tipo: " + tipoAnimal);
                        System.out.println("Dono: " + donoAnimal);
                    } else {
                        System.out.println("\nANIMAL: Nenhum cadastrado.");
                    }

                    if (medicoCadastrado) {
                        System.out.println("\nMÉDICO:");
                        System.out.println("Nome: " + nomeMedico);
                        System.out.println("Especialidade: " + especialidadeMedico);
                        System.out.println("CRMV: " + crmvMedico);
                    } else {
                        System.out.println("\nMÉDICO: Nenhum cadastrado.");
                    }

                    if (consultaAgendada) {
                        System.out.println("\nAGENDAMENTO:");
                        System.out.println("Data: " + dataConsulta);
                        System.out.println("Hora: " + horaConsulta);
                        System.out.println("Animal: " + nomeAnimal);
                        System.out.println("Médico: " + nomeMedico);
                    } else {
                        System.out.println("\nAGENDAMENTO: Nenhum agendamento registrado.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);

        scanner.close();
    }
}