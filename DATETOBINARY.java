/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class DATETOBINARY
{
    public static String datetobinary(String date)
    {
        String[] part = date.split("-");
        
        int year = Integer.parseInt(part[0]);
        int month = Integer.parseInt(part[1]);
        int day = Integer.parseInt(part[2]);
        
        String byear = Integer.toBinaryString(year);
        String bmonth = Integer.toBinaryString(month);
        String bday = Integer.toBinaryString(day);
        return byear+"-"+bmonth+"-"+bday;
     }
	public static void main(String[] args) {
	      String date1 = "2024-09-17";
		System.out.println(datetobinary(date1));
	}
}
