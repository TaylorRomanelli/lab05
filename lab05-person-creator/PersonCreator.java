
/**
 * Write a description of class PersonCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonCreator
{
    // Your class begins here!
    private String firstName;//Bill
    private String lastName;//Nye
    private int age;//18
    private String sex;//Male
    private int feetH;
    private int inchesH;
    private int weight;//165
    
    private int firstDigsSSN;
    private int secondDigsSSN;
    private int thirdDigsSSN;
    private int houseN;
    private String roadN;
    private int aC;
    private int fD;
    private int sD;
    private int month;
    private int day;
    private int year;
    
    
    
    
    public PersonCreator(String myFirstName, String myLastName)
    {
        firstName = myFirstName;
        lastName = myLastName;
    } 
    
    
    
    public void setAge(int myAge)
    {
        age=myAge;
    }    
    
    public void setSex(String gender)
    {
        sex=gender;
    }    
    
    public void setHeight(int feet, int inches)
    {
        feetH=feet;
        if((01<= inches) && (inches<= 12))
        {
            inchesH=inches;
        }    else{System.out.println("Error: Not inbetween 01 and 12");}
    }    
    
    public void setWeight(int myWeight)
    {
        weight=myWeight;
    }
    
    
    
    
    public void setSSN(int firstThreeDigits, int secondTwoDigits, int thirdFourDigits)
    {
        if((100<= firstThreeDigits)&&(firstThreeDigits<= 999))
        {
            firstDigsSSN=firstThreeDigits;
        }    else{System.out.println("Error: Not inbetween 100 and 999");}
        if((10<= secondTwoDigits)&&(secondTwoDigits<= 99))
        {
            secondDigsSSN=secondTwoDigits;
        }    else{System.out.println("Error: Not inbetween 10 and 99");}
        if((1000<= thirdFourDigits)&& (thirdFourDigits<= 9999))
        {
            thirdDigsSSN=thirdFourDigits;
        }    else{System.out.println("Error: Not inbetween 1000 and 9999");}
    }    
    
    public void setAdress(int houseNum, String road)
    {
        houseN=houseNum;
        roadN=road;
    }    
    
    public void setPhoneNumber(int areaCode, int firstThreeDigitsPN, int secondFourDigitsPN)   
    {
        if((100<= areaCode)&&(areaCode<= 999))
        {
            aC=areaCode;
        }else{System.out.println("Error: Not inbetween 100 and 999");}
        if((100<= firstThreeDigitsPN)&&( firstThreeDigitsPN<= 999))
        {
            fD=firstThreeDigitsPN;
        }else{System.out.println("Error: Not inbetween 100 and 999");}
        if((000<= secondFourDigitsPN)&&(secondFourDigitsPN<= 9999))
        {
            sD=secondFourDigitsPN;
        }else{System.out.println("Error: Not inbetween 1000 and 9999");}
    }
    
    public void setDOB(int monthBirth, int dayBirth, int yearBirth)
    {
        if((01<= monthBirth)&&(monthBirth<= 12))
        {
            month=monthBirth;
        }    else{System.out.println("Error: Not inbetween 01 and 12");}
        if((01<= dayBirth)&&(dayBirth<= 31))
        {
            day=dayBirth;
        }    else{System.out.println("Error: Not inbetween 01 and 31");}
        if((0000<= yearBirth)&&(yearBirth<= 2016))
        {
            year=yearBirth;
        }    else{System.out.println("Error: Not inbetween 0000 and 2016");}
    }    
    
    
    public void PersonCreator()
    {
        System.out.println("Name: " + firstName + " " + lastName);
        
        System.out.println("Age: " + age);
        
        System.out.println("Sex: " + sex);
        
        System.out.println("Height: " + feetH + "' " + inchesH + "''");
        
        System.out.println("Weight: " + weight + "lbs");
        
        System.out.println("SSN: " + firstDigsSSN + "-" + secondDigsSSN + "-" + thirdDigsSSN);
        
        System.out.println("Adress: " + houseN + " " + roadN);
        
        System.out.println("Phone Number: " + "("+aC+")" + fD + "-" + sD);
        
        System.out.println("Date of Birth: " + month + " " + day + ", " + year);
    }
}
