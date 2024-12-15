/* Домашнее задание
 1. Создать класс УчительСервис(TeacherService) и реализовать аналогично проделанному на
семинаре
2. Создать класс УчительВью(TeacherView) и реализовать аналогично проделанному на
семинаре
3. Создать класс УчительКонтроллер(TeacherController) и реализовать возможность создания,
редактирования конкретного учителя и отображения списка учителей
имеющихся в системе
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        TeacherController teacherController = new TeacherController();

        // Создаю учителей
        teacherController.createTeacher("Терэза", "Иштвановна", "Волхонская", 1L);
        teacherController.createTeacher("Любовь", "Алексеевна", "Попова", 2L);
        teacherController.createTeacher("Вероника", "Николаевна", "Кузнецова", 3L);

        System.out.println("========== Учителя ==========");

        // Вывожу всех учителей
        teacherController.getAllTeacher();

        // Редактирование учителя
        teacherController.editTeacher(1L, "Евгений", "Клюев", "Анатольевич");

        // Удаление учителя

        teacherController.removeTeacherByFIO("Любовь", "Алексеевна", "Попова");

        // Сортировка и вывод оставшихся учителей

        teacherController.getSortedTeachers();

        System.out.println("================================\n\n");



        // Создаю студентов
        Student student1 = new Student("Максим", "Бугров", "Дмитриевич");
        student1.setStudentId(1L);

        Student student2 = new Student("Андрей","Горбаченко", "Александрович");
        student2.setStudentId(2L);

        Student student3 = new Student("Владислав", "Громов", "Анатольевич");
        student3.setStudentId(3L);

        Student student4 = new Student("Владислав", "Герасимов", "Денисович");
        student4.setStudentId(4L);

        Student student5 = new Student("Ирина", "Звонарева", "Ивановна");
        student5.setStudentId(5L);

        Student student6 = new Student("Иван", "Супонев", "Андреевич");
        student6.setStudentId(6L);


        // Создаю группы и добавляю студентов
        StudentGroup group1 = new StudentGroup();
        group1.setStudentList(Arrays.asList(student1, student2));
        group1.setGroupName("АСОИ");
        group1.setGroupNumber(1);

        StudentGroup group2 = new StudentGroup();
        group2.setStudentList(Arrays.asList(student3, student4));
        group2.setGroupName("АСОИ");
        group2.setGroupNumber(2);

        StudentGroup group3 = new StudentGroup();
        group3.setStudentList(Arrays.asList(student5, student6));
        group3.setGroupName("БУХ");
        group3.setGroupNumber(1);

        // Создаю потоки
        Stream stream1 = new Stream(Arrays.asList(group1, group2));
        Stream stream2 = new Stream(Arrays.asList(group3));

        // Добавляю потоки в список
        List<Stream> streams = new ArrayList<>(Arrays.asList(stream1, stream2));

        // Сортирую потоки
        StudentControllerController controller = new StudentControllerController();
        controller.sortStreams(streams);

        // Вывожу студентов в каждой группе
        for (Stream stream : streams) {
            System.out.println("****** Новый поток ******");
            for (StudentGroup group : stream.getGroups()) {
                System.out.println("Группа " + group.getGroupNumber() + " (" + group.getGroupName() + "):");
                for (Student student : group.getStudentList()){
                    System.out.println(" " + student.getFirstName() + " " + student.getLastName()+ " " + student.getMiddleName() + " ");
                }
            }
        }

        // Вывожу результат с обработкой окончания
        for (Stream stream : streams) {
            int groupCount = stream.getGroups().size();
            String groupWord = getGroupWord(groupCount);
            System.out.println("================================");
            System.out.println("Поток с " + groupCount + " " + groupWord);
        }
    }

// Метод для выбора правильного окончания
    private static String getGroupWord(int count) {
        if (count == 1){
            return "группой";
        } else if (count >= 2 && count <= 4) {
            return "группами";
        } else {
            return "группами"; // для 5 и более использую множественное число
        }
    }
}