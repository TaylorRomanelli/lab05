
/**
 * Write a description of class PersonCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonCreator
{
    // Your class begins here!
    private String firstName;//first name---Bill
    private String lastName;//last name---Nye
    private int age;//age---18
    private String sex;//Sex---Male
    private int feetH;//height feet part---6'
    private int inchesH;//height inches part---0''
    private int weight;//weight---165
    
    private String SocialSecurityNumber;//SSN
//     private int firstDigsSSN;
//     private int secondDigsSSN;
//     private int thirdDigsSSN;
    
    private int houseN;//adress variables
    private String roadN;
    
    private String phoneNumber;//phone number variable
//     private int aC;
//     private int fD;
//     private int sD;
     
    private int month;//month
    private int day;//day
    private int year;//year
    
    
    
    /*
    Description: Constructor
    Input: first and last name
    Output: purpose to constuct the class
    Example: -----
    */
    public PersonCreator(String myFirstName, String myLastName)//constructor
    {
        firstName = myFirstName;//sets first name
        lastName = myLastName;//sets last name
        phoneNumber ="000-000-0000";
        SocialSecurityNumber ="000-00-0000";
    } 
    
    
    /*
    Description: sets age
    Input: the age the person is
    Output: purpose is to set age
    Example: 18
    */
    public void setAge(int myAge)//sets age with input
    {
        age=myAge;//age now equals input
    }    
    
    /*
    Description: sets gender
    Input: user's gender
    Output: purpose is to set whatever the user put in as gender
    Example: Male
    */
    public void setSex(String gender)//sets gender
    {
        sex=gender;//sets gender to input
    }    
    
    /*
    Description: sets height 
    Input: user inputs their height in feet then inches
    Output: purpose is to set user's height in feet and user's height in inches
    Example:6'0''
    */
    public void setHeight(int feet, int inches)//sets height to input
    {
        feetH=feet;//sets feet to input
        if((0<= inches) && (inches<= 11))//sets the inches part but must be between 0-11
        {
            inchesH=inches;
        }    else{System.out.println("Error: Not inbetween 0 and 11");}//prints error if not
    }    
    
    /*
    Description: sets the weight of the user
    Input: the user inputs their weight
    Output: purpose is to set the user's weight
    Example:165
    */
    public void setWeight(int myWeight)//sets weight
    {
        weight=myWeight;//sets weight to input
    }
    
    
    
    
//     public void setSSN(int firstThreeDigits, int secondTwoDigits, int thirdFourDigits)//sets Social Security Number
//     {
//         if((100<= firstThreeDigits)&&(firstThreeDigits<= 999))
//         {
//             firstDigsSSN=firstThreeDigits;
//         }    else{System.out.println("Error: Not inbetween 100 and 999");}//prints error if not
//         if((10<= secondTwoDigits)&&(secondTwoDigits<= 99))
//         {
//             secondDigsSSN=secondTwoDigits;
//         }    else{System.out.println("Error: Not inbetween 10 and 99");}//prints error if not
//         if((1000<= thirdFourDigits)&& (thirdFourDigits<= 9999))
//         {
//             thirdDigsSSN=thirdFourDigits;
//         }    else{System.out.println("Error: Not inbetween 1000 and 9999");}//prints error if not
//     }    

    /*
    Description: sets adress variables
    Input: the user inputs their house number (int) and house name (String)
    Output: purpose is to set the house number and road name
    Example: 120 BlueJ Rd
    */
    public void setAdress(int houseNum, String road)//sets adress
    {
        houseN=houseNum;
        roadN=road;
    }    
    
//     public void setPhoneNumber(int areaCode, int firstThreeDigitsPN, int secondFourDigitsPN)   //sets phone number
//     {
//         if((100<= areaCode)&&(areaCode<= 999))
//         {
//             aC=areaCode;
//         }else{System.out.println("Error: Not inbetween 100 and 999");}//prints error if not
//         if((100<= firstThreeDigitsPN)&&( firstThreeDigitsPN<= 999))
//         {
//             fD=firstThreeDigitsPN;
//         }else{System.out.println("Error: Not inbetween 100 and 999");}//prints error if not
//         if((1000<= secondFourDigitsPN)&&(secondFourDigitsPN<= 9999))
//         {
//             sD=secondFourDigitsPN;
//         }else{System.out.println("Error: Not inbetween 1000 and 9999");}//prints error if not
//     }
//     
    
    
    /*
    Description:  changes the phone number
    Input: user inputs their area code and next three digits then next four digits
    Output: Only outputs if error but purpose is to change to phone number from 000-000-0000 to something the user wants
    Example: "123-123-1234"
    */
    public void changeNumber(int areaC, int numBegin, int numEnd)//changes phone number
    {
        //if areaC is bad, tell user
        if(areaC < 100 || areaC > 999)
        {
            System.err.println("Please use a valid number.");
        }
        else if(numBegin < 100 || numBegin > 999)
        {
            System.err.println("Please use a valid number.");
        }
        else if(numEnd < 1000 || numEnd > 9999)
        {
            System.err.println("Please use a valid number.");
        }
        else
        {
            phoneNumber = areaC + "-" + numBegin + "-" + numEnd;
        }
    }
    
    /*
    Description: changes the SSN
    Input: user inputs their SSN in three different boxes - 00-000-0000
    Output: Only outputs if error but purpose is to change to SSN from 000-00-0000 to something the user wants
    Example:"123-12-1234"
    */
    public void changeSSN(int firstThreeDigits, int secondTwoDigits, int thirdFourDigits)//changes SSN
    {
        
        if(firstThreeDigits < 100 || firstThreeDigits > 999)
        {
            System.err.println("Please use a valid number.");
        }
        else if(secondTwoDigits < 10 || secondTwoDigits > 99)
        {
            System.err.println("Please use a valid number.");
        }
        else if(thirdFourDigits < 1000 || thirdFourDigits > 9999)
        {
            System.err.println("Please use a valid number.");
        }
        else
        {
            SocialSecurityNumber = firstThreeDigits + "-" + secondTwoDigits + "-" + thirdFourDigits;
        }
    }
    
    
    
    
    /*
    Description: sets date of birth
    Input: user inputs their DOB in three different boxes - 00-00-0000
    Output: Only outputs if error but purpose is to change to DOB from 0-0-0 to something the user wants
    Example:"1-12-1234"
    */
    public void setDOB(int monthBirth, int dayBirth, int yearBirth)//sets date of birth
    {
        if((01<= monthBirth)&&(monthBirth<= 12))
        {
            month=monthBirth;
        }    else{System.out.println("Error: Not inbetween 01 and 12");}//prints error if not
        if((01<= dayBirth)&&(dayBirth<= 31))
        {
            day=dayBirth;
        }    else{System.out.println("Error: Not inbetween 01 and 31");}//prints error if not
        if((0000<= yearBirth)&&(yearBirth<= 2016))
        {
            year=yearBirth;
        }    else{System.out.println("Error: Not inbetween 0000 and 2016");}//prints error if not
    }    
    
    /*
    Description: prints all information
    Input: no input
    Output: all information
    Example:"Name: Bill Nye Age: 18 .....
    */
    public void PersonCreator()//prints out all information
    {
        System.out.println("Name: " + firstName + " " + lastName);
        
        System.out.println("Age: " + age);
        
        System.out.println("Sex: " + sex);
        
        System.out.println("Height: " + feetH + "' " + inchesH + "''");
        
        System.out.println("Weight: " + weight + "lbs");
        
//         System.out.println("SSN: " + firstDigsSSN + "-" + secondDigsSSN + "-" + thirdDigsSSN);
        System.out.println("SSN: " + SocialSecurityNumber);
        
        System.out.println("Adress: " + houseN + " " + roadN);
        
//         System.out.println("Phone Number: " + "(" +aC+ ")" + fD + "-" + sD);
        System.out.println("Phone Number: " + phoneNumber);

        
        System.out.println("Date of Birth: " + month + " " + day + ", " + year);
    }
}
