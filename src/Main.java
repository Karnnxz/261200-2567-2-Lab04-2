public static void main(String[] args) {
    HealthRecord student1 = new HealthRecord(110);
    HealthRecord student2 = new HealthRecord(55);
    HealthRecord student3 = new HealthRecord(175);
    student1.displayDetails();
    student2.displayDetails();
    student3.displayDetails();
    HealthRecord.displayClassDetails();
}