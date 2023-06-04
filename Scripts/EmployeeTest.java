package Scripts;

public class EmployeeTest {
    public static void main(String[] args){
        /* 使用构造器创建两个对象 */
        Employee empOne = new Employee("RUN001");
        Employee empTwo = new Employee("RUN002");

        // 调用两个对象的成员方法
        empOne.empAge(25);
        empOne.empDesignation("测试开发工程师");
        empOne.empSalary(15000.88);
        empOne.printEmployee();

        empTwo.empAge(26);
        empTwo.empDesignation("Java开发");
        empTwo.empSalary(16000.05);
        empTwo.printEmployee();
    }
}
