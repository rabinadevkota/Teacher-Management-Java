class Teacher{
 int teacherID;
 String teachername;
 String address;
 String workingtype;
 String employmentstatus;
 int workinghours;

 Teacher(int TeacherID,String Teachername,String Address,String
WorkingType,String EmploymentStatus,int workinghours)
 {
 this. teacherID=TeacherID;
 this. teachername=Teachername;
 this. address=Address;
 this. workingtype=WorkingType;
 this.employmentstatus=EmploymentStatus;
 this.workinghours=0;
 }
 public int getTeacherID()
 {
 return teacherID;
 }
 public String getTeachername()
 {
 return teachername;
 }
 public String getAddress()
 {
 return address;
 }
 public String getWorkingType()
 {
 return workingtype;
 }
 public String getEmploymentStatus(){
 return employmentstatus;
 }
 public void setWorkingHours(int newWorkingHours)
 {
 workinghours=newWorkingHours;
 }
 public void display()
 {
 System.out.println("Teacher ID:"+teacherID);
 System.out.println("Teacher name:"+teachername);
 System.out.println("Address:"+address);
 System.out.println("Working Type:"+workingtype);
 System.out.println("Employment Status:"+employmentstatus);
 if (workinghours==0){
 System.out.println("WorkingHours:not assigned");
 }
 else {
 System.out.println("WorkingHours:"+workinghours);
}
}
}
