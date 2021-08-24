public class checkPrime {

    public static void main(String[] args) {

        int num = 17;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
//    {
//        int n = 17;
//        boolean flag = false;
//
//        for(int i = 2; i <= n-1 ; i++)
//        {
//            if(n%i==0)
//            {
//                flag = false;
//                break;
//            }
//
//            else {
//                flag = true;
//            }
//        }
//
//        if(flag==true)
//        {
//            System.out.println("Prime no");
//        }
//        else
//        {
//            System.out.println("Not Prime no");
//        }
//    }
//





