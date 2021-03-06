package WorkingWithAbstraction.Lab.StudentSystem;

public class Show {
        public static String print(Student student) {
        String view = String.format("%s is %s years old.", student.getName(), student.getAge());
        if (student.getGrade() >= 5.00) {
            view += " Excellent student.";
        } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
            view += " Average student.";
        } else {
            view += " Very nice person.";
        }

        return view;
    }
}
