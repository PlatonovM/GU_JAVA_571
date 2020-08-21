public class Lesson5 {
    public static void main(String[] args) {
        Employee[] empPersArray = new Employee[5];
        empPersArray[0] = new Employee("IIIvanov","GenDir","iiv@mail.com", "987654321", 300000,30);
        empPersArray[1] = new Employee("PPPetrov","DirEconomicEvolution","ppet@mail.com", "987654320", 130000,30);
        empPersArray[2] = new Employee("SSSidorov","DirClining","ssid@mail.com", "987654322", 93000,41);
        empPersArray[3] = new Employee("KKKomov","DirMarketing","kkom@mail.com", "987654323", 92000,43);
        empPersArray[4] = new Employee("PPPersov","DirLogistick","pper@mail.com", "987654324", 83000,45);

        /**
         * Делал стандартную fori с условием i < empPersArray.length,
         * ИДЕЯ предложила заменить на следующее выражение: (Employee employee : empPersArray).
         * Понравилось. Но описания подобной конструкции я так и не нашёл.
         */

        for (Employee employee : empPersArray) {
            if (employee.age > 40) System.out.println(employee.toString());
        }
    }
}
