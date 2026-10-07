class Lecturer extends Teacher
{
 private String Department;
 private int YearsOfExperience;
 private int GradedScore;
 private boolean hasGraded;

 public Lecturer(int teacherID,String teachername,String address,String
workingtype,String employmentstatus,int workinghours,String Department,int
YearsOfExperience){

super(teacherID,teachername,address,workingtype,employmentstatus,workinghours);
 this.Department=Department;
 this. YearsOfExperience=YearsOfExperience;
 this. GradedScore=0;
 this. hasGraded=false;
 }
 public void setDepartment(String department)
 {
 this. Department=department;
 }
 public void setYearsOfExperience(int yearsofexperience)
 {
 this. YearsOfExperience=yearsofexperience;
 }
 public void GradedScore(int gradedscore)
 {
 this. GradedScore=gradedscore;
 }
 public void gradeassignment(int GradedScore, String Department, int
YearsOfExperience)
 {
 if (!hasGraded && YearsOfExperience>=5 &&
this.Department.equals(Department))
{
 if (GradedScore>=70){
 System.out.println("GradedScore=A");
 }else if (GradedScore>=60){
 System.out.println("GradedScore=B+");
 }else if (GradedScore>=50){
 System.out.println("GradedScore=B");
 }else if (GradedScore>=40){
 System.out.println("GradedScore=C+");
 }else{
 System.out.println("GradedScore=C");
 }
 hasGraded=true;
 }else{
 System.out.println("Unable to grade at this time");
 }

 }
 public void display()
 {
 super.display();
 System.out.println("Department:"+Department);
 System.out.println("Years Of Experience:" +YearsOfExperience);
 if(hasGraded){
 System.out.println("Graded Score:"+GradedScore);
 }else{
 System.out.println("Score has not been graded yet");
}
}
}
