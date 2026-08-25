public class FirstPerson extends Person{
    String skinColor;
    String maritalStatus;
    double salary;

    //set the skin color
    public void setSkinColor(String skinColor){
        this.skinColor = skinColor;
    }
    //get the skin color
    public String getSkinColor(){
        return skinColor;
    }
    //set martial status
    public void setMaritalStatus(String maritalStatus){
        this.maritalStatus = maritalStatus;
    }
    //return martial status
    public String getMaritalStatus(){
        return maritalStatus;
    }

}
