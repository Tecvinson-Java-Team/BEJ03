public class Main {
    public static void main(String[] args) {

        //Create an object of the employee class
        Employee employee = new Employee("Mr", "Tinubu", "Emilokon", "Agbado@gmail.com", "08064870677", "Nigeria", new Allowance( 399.00, 2321, 4446, 2323,99), new Vacation(23, 7));

        //Display employee details
        employee.displayPersonalInfo();
        employee.allowance.displayAllowanceDetails();
        employee.vacation.displayVacationDetails();

        //Update employee details
       employee.setTitle("Mr");
        employee.setFirstName("John");
        employee.setLastName("Okoro");
        employee.setEmail("Johnoko24@gmail.com");
        employee.setPhone("07055614212");
        employee.setNationality("Nigeria");
        employee.allowance.setBasic(512.29);
        employee.allowance.setTransportation(200.22);
        employee.allowance.setWardrobe(58.14);
        employee.allowance.setEducation(698.1);
        employee.allowance.setFeeding(991.43);
        employee.vacation.setVacationDays(30);
        employee.vacation.setUsedVacationDays(10);

        //Display updated employee details
        employee.displayPersonalInfo();
        employee.allowance.displayAllowanceDetails();
        employee.vacation.displayVacationDetails();

    }

}
