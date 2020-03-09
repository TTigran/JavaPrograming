package am.javaprogram.classes.patient.services;

import am.javaprogram.classes.patient.PatientGenerator;
import am.javaprogram.classes.patient.models.Patient;

public class PatientService {
  private Patient[] patientsData = new Patient[10];

  public PatientService() {
    PatientGenerator generator =new PatientGenerator();
     for (int i = 0; i < patientsData.length; i++) {
       patientsData[i] = generator.generatePatient();
    }
  }

  public Patient[] getListByIntervalOfMedicalNumberCart(int intervalStart, int intervalEnd) {
    int size = 0;
    Patient[] resultData = new Patient[patientsData.length];
    for (Patient patient : patientsData) {
      if (patient.getMedicalCardNumber() > intervalStart
          && patient.getMedicalCardNumber() < intervalEnd) {
        resultData[size++] = patient;
      }
    }
    return resultData;
  }

  public Patient[] getByDiagnosis(String diagnosis) {
    int size = 0;
    Patient[] resultData = new Patient[patientsData.length];
    for (Patient patient : patientsData) {
      if (patient.getDiagnosis().equals(diagnosis)) {
        resultData[size++] = patient;
      }
    }
    return resultData;
  }

  public void printData(Patient[] array) {
    for (Patient patient : array) {
     if(patient != null){
       System.out.println(patient.toString());
     }
    }
  }
}
