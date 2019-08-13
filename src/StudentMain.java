import proxy.StudentProxy;
import service.StudentService;
import service.impl.StudentServiceImpl;

public class StudentMain {
    public static void main(String[] args) {
        StudentService agent = (StudentService) StudentProxy.agent(StudentService.class, new StudentServiceImpl());
        agent.study();
    }
}
