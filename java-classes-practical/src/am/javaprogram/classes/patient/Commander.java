package am.javaprogram.classes.patient;

import am.javaprogram.classes.patient.models.Patient;
import am.javaprogram.classes.patient.services.PatientService;
import am.javaprogram.classes.patient.interfaces.Commands;

import java.util.Scanner;

public class Commander implements Commands {
  PatientService patientService = new PatientService();

  public Commander() {}

  public void run() {
    Scanner scanner = new Scanner(System.in);
    printCommands();
    int command = scanner.nextInt();
    switch (command) {
      case EXIT:
        scanner.close();
        break;
      case FILTER_BY_DIAGNOSIS:
        processFilteringByDiagnosis();
        break;
      case FILTER_BY_INTERVAL_OF_NUMBER_CART_MEDICAL:
        getByIntervalOfMedicalCartNumberProcess();
        break;
      default:
        run();
        break;
    }
  }

  private void processFilteringByDiagnosis() {
    Scanner scanner = new Scanner(System.in);
    String diagnosis = scanner.nextLine();
    Patient[] byDiagnosis = patientService.getByDiagnosis(diagnosis);
    patientService.printData(byDiagnosis);
    scanner.close();
    run();
  }

  private void getByIntervalOfMedicalCartNumberProcess() {
    Scanner scanner = new Scanner(System.in);
    int startInterval = scanner.nextInt();
    int endInterval = scanner.nextInt();
    Patient[] filteredData =
        patientService.getListByIntervalOfMedicalNumberCart(startInterval, endInterval);
    patientService.printData(filteredData);
    scanner.close();
    run();
  }

  private void printCommands() {
    System.out.println("EXIT ---------------------------------------------------------> 0");
    System.out.println("FILTER_BY_DIAGNOSIS ------------------------------------------> 1");
    System.out.println("FILTER_BY_INTERVAL_OF_NUMBER_CART_MEDICAL --------------------> 2");
  }
}
