public static void main(String[] args) {
    Employee[] e = new Employee[5];
    e[0] = new SalaryEmployee("simra", "sheikh", 34.4);
    e[1] = new HourlyEmployee("simra", "sheikh", 34.4, 5);
    e[2] = new SalaryEmployee("simra", "sheikh", 69.4);
    e[3] = new HourlyEmployee("simra", "sheikh", 34.4, 5);
    e[4] = new SalaryEmployee("simra", "sheikh", 78.4);

    for (int i = 0; i < 5; i++) {
         System.out.println("Employee " + i + " : " + e[i].toString());           
    }        
}
