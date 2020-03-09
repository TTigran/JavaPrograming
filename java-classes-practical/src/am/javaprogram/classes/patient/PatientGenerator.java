package am.javaprogram.classes.patient;


import am.javaprogram.classes.patient.models.Patient;

import java.util.Random;

public class PatientGenerator {

    private final String[] NAMES = {
                "Tigran", "Vardan", "Ashot", "Vahram", "Valod", "Gurgen", "Ishxan", "Varazdat", "Gevorg"
        };

        public PatientGenerator() {}

        public Patient generatePatient() {
            Patient generate =
                    new Patient(
                             NAMES[getRangeByMinMax(0, NAMES.length - 1)],
                             getRangeByMinMax( 100, 999),
                             "diagnosis"+getRangeByMinMax( 100, 999)
                            );

            return generate;
        }

        private int getRangeByMinMax(int min, int max) {
            Random r = new Random();
            return r.nextInt((max - min) + 1) + min;
        }


}
