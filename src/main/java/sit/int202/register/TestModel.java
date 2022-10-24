package sit.int202.register;

import sit.int202.register.models.CourseRegistered;
import sit.int202.register.models.CourseRepository;
import sit.int202.register.models.Subject;

import java.util.List;

public class TestModel {
    public static void main(String[] args) {
//        List<Subject> subjectList = CourseRepository.getSubjects(2);
//        subjectList.forEach(subject -> System.out.println(subject));
//        System.out.println("---------");
//
//        subjectList = CourseRepository.getSubjects(9);
//        for (Subject subject : subjectList){
//            System.out.println(subject);
//        }
//        System.out.println("---------");
//
//        CourseRepository.getSubjects(3).forEach(s -> System.out.println(s));

        CourseRegistered cr = new CourseRegistered();

        cr.registerSubject(1, CourseRepository.getSubject(1, "INT101"));
        cr.registerSubject(1, CourseRepository.getSubject(1, "GEN111"));

        cr.registerSubject(5, CourseRepository.getSubject(5, "INT222"));
        cr.registerSubject(5, CourseRepository.getSubject(5, "INT305"));

        cr.getRegisteredCourse(1).forEach(s -> System.out.println(s));
        System.out.println("---------");
        cr.getRegisteredCourse(5).forEach(s -> System.out.println(s));
        List<Subject> s3 = cr.getRegisteredCourse(3);
        if(s3 == null) {
            System.out.println("No Subject in semester 3");
        }
        else {
            s3.forEach(s -> System.out.println(s));
        }
    }
}
