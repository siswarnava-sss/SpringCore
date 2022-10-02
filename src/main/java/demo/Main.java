package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext context  = new ClassPathXmlApplicationContext("spring.xml");
//        Doctor doctor = context.getBean(Doctor.class);
//        Nurse nurse = context.getBean(Nurse.class);
//        doctor.assist();
////        System.out.println(doctor.getQualification());
////        doctor.getNurse().assist();
//       nurse.assist();


       //Annotation based Config
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        doctor.setQualification("MD");
         System.out.println(doctor.getQualification());
         Doctor doctor1 = context.getBean(Doctor.class);
         doctor1.setQualification("MBBS");
        System.out.println(doctor1.getQualification());
    }
}
