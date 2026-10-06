// Write a Java program to demonstrate the use of final class.//
final class DiyaSecureData
 {
    void ShowData()
    {
        System.out.println("Secure Confidential Recordd for Diya");
    }
 }

// class Diya extends DiyaSecureData{}
 
 class U2_P8_3
 {
    public static void main(String[] args)
     {
      DiyaSecureData d = new DiyaSecureData();

      d.ShowData();  
    }
 }
