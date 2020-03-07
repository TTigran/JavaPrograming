package am.javaprogram.classes.patient.models;

public class Patient {
    private int id;
    private String name;
    private int  medicalCardNumber;
    private  String diagnosis;
    static int noOfObjects = 0;

    {
        noOfObjects += 1;
    }

    public Patient(String name, int medicalCardNumber, String diagnosis) {
        this.id =noOfObjects;
        this.name = name;
        this.medicalCardNumber = medicalCardNumber;
        this.diagnosis = diagnosis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public void setMedicalCardNumber(int medicalCardNumber) {
        this.medicalCardNumber = medicalCardNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", medicalCardNumber=" + medicalCardNumber +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
