package cab.fairs;
import java.util.Scanner;
public class CabFairs {
int price;
    int d;      //distance travelled by user

    public CabFairs() {
        price = 30;
    }
//parameterized constructor
    public CabFairs(int amt) {
        price = amt;
    }
    void showFare() {
        System.out.println("Total Fare: Rs " + price);
    }
}  
class RideCab{
    public static void main(String[] args) {
       int cd;     //distance of cab from user
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the cab distance from user: ");
        cd = sc.nextInt();
        
        if(cd > 5) {
            Cab ob = new Cab(30 + 10 * (cd - 5));
            System.out.print("Enter the distance travelled: ");
            ob.d = sc.nextInt();
            
            ob.Cost = ob.Cost + 10 * ob.d;
            
            ob.showFare();
        }
        else {
            Cab ob = new Cab();
            System.out.print("Enter the distance travelled: ");
            ob.d = sc.nextInt();
            ob.Cost = ob.Cost + 10 * ob.d;
            ob.showFare();
            
            Cab ob = new Cab(ob);
            ob.showFare();
        }
    }
}
