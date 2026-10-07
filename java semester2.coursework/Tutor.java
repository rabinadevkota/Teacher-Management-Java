public class Tutor extends Teacher { 
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;

    public Tutor(int teacherID, String teacherName, String address, String workingType, String employmentStatus, int workingHours, double salary, String specialization, String academicQualifications, int performanceIndex) {
        super(teacherID, teacherName, address, workingType, employmentStatus, workingHours);
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;
    }

    public double getSalary() {
        return salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getAcademicQualifications() {
        return academicQualifications;
    }

    public int getPerformanceIndex() {
        return performanceIndex;
    }

    public boolean isCertified() {
        return isCertified;
    }

    public void setSalaryAndCertify(double newSalary, int newPerformanceIndex) {
    if (!isCertified) {
        System.out.println("Cannot approve salary. Tutor is not certified yet.");
    } else if (newPerformanceIndex > 5 && setWorkingHours() > 20) {
        double appraisalPercentage;
        if (newPerformanceIndex >= 5 && newPerformanceIndex <= 7) {
            appraisalPercentage = 0.05;
        } else if (newPerformanceIndex >= 8 && newPerformanceIndex <= 10) {
            appraisalPercentage = 0.10;
        } else {
            appraisalPercentage = 0.20;
        }
        double appraisalAmount = newSalary * appraisalPercentage;
        this.salary = newSalary + appraisalAmount;
        isCertified = true;
    }
}

    public void removeTutor() {
        if (!isCertified) {
            this.salary = 0;
            this.specialization = "";
            this.performanceIndex = 0;
            this.academicQualifications = "";
            this.isCertified = false;
        }
    }

    @Override
    public void display() {
        if (isCertified) {
            super.display();
            System.out.println("Salary: $" + salary);
            System.out.println("Specialization: " + specialization);
            System.out.println("Academic Qualifications: " + academicQualifications);
            System.out.println("Performance Index: " + performanceIndex);
        } else {
            super.display();
        }
    }
}