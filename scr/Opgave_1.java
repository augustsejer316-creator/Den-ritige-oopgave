
//Opgave 1

     /*
void main(){
    / VariableBasic();
    //Operators();
    //Naming();

double milk = 25.50;
double cake = 15.00;
double bread = 30.00;
double subTotal = (milk+cake+bread);
      double taxRate = 25.0;
      double totalPrice = subTotal+(subTotal*taxRate)/100;
     

                                System.out.println(subTotal);
                                System.out.println(totalPrice);
      }


//Opgave 2: Split resturant bill
 /*
void main() {

      double food = 450.0;
      double drinks = 120.0;
      double tips = 50.0;
      int people = 4;
      double sumTotal = (food + drinks + tips);

      double totalEach = (sumTotal) / people;

      System.out.println(sumTotal);
      System.out.println(totalEach);
}



  */

  //Opgave 3: Discount calculation
/*

double price = 300;
double discount = 20.0;
double tax = 25.0;




void main(){

      System.out.println(price);
      System.out.println(discount);    
      double priceDiscount = price=(price)*.80;
      System.out.println(price);
      double finalPrice = (priceDiscount)*1.25;
      System.out.println(finalPrice);



}

 */



 //Opgave 4: Part planning


int guest = 15;
int cupCake = 40;
int cupcakeEace = cupCake/guest;
//double rest = cupCake-(guest*cupcakeEace);
int rest = cupCake % guest;

void main (){

 System.out.println(cupcakeEace);
 System.out.println(rest);







//opgave 5: Build greeting messege


      StringBuilder sb = new StringBuilder();

              String name = "Anna";
      int age = 25;


      sb.append("Hello,");
              sb.append(name);
              sb.append("!");
              sb.append("how old are you?");
                      sb.append(age);
                      sb.append("Nice");

                              System.out.println(sb.toString());



 // Opgave 6

    int procent = 100;

    System.out.println(procent);

    procent=procent+50;
        System.out.println(procent);
        procent=procent+25;
    System.out.println(procent);


                    // opgave 7
    int health = 100;
    health=health-15;
    System.out.println(health);

    // opgave 8

    health=health-20;
    System.out.println(health);

    int price = 50;
    price = price*2;

    System.out.println(price);


    //opgave 9

    int sizeChart = 10;
    int plus = (sizeChart)++;
     sizeChart++;      
     sizeChart++;    
                     



    System.out.println(sizeChart);
    sizeChart--;
    System.out.println(sizeChart);


   //Opgave 10

    int newNumber= 10;
    newNumber +=5;
 System.out.println(newNumber); 
    newNumber -=5;
    System.out.println(newNumber);
        newNumber++;
    System.out.println(newNumber);
     newNumber--;
     System.out.println(newNumber);

     //opgave 11

   String Sale = "Laptop";
   double price1 = 7999.99;
   boolean IsStocked = true;
   int left = 15;
   double discount1 = 10;
   String category = "electronics";

   // Opgave 12

   String name1 = "Anna";
   int test = 85;
   int point = 92;
  int gennemsnit = (test+point)/2;
  System.out.println(gennemsnit);
  
     //opgave 13 Booking

    String guestName = "Peter Hansen";
            int room = 204;
    int night = 3;
            double priceRoom = 899.00;
    boolean inkludes = true;
    double payTotal = night*priceRoom;
    System.out.println(payTotal);

          int steps = 8547;
          int MaxSteps = 10000;
          int done = 62;
          int forbrændt = 420;
          boolean mål = false;

          System.out.println(steps);
          System.out.println(MaxSteps);
          System.out.println();
          System.out.println();
          System.out.println();

          //Opgave 15

    String title = "morgensol";
    String name2 = "Hanna";
    int isbn = 123456789;
    int siderIbog = 123;
    boolean lent = true;
    String lender = name;
    String dageTilbage = "25";
    int gebyt = 100;
    Boolean bestSeller = true;
    int[]score ={1,2,3,4,5};
            System.out.println(title);
            System.out.println(name2);
            System.out.println(isbn);
            System.out.println(siderIbog);
             System.out.println(lent);
            System.out.println(lender);
            System.out.println(dageTilbage);
            System.out.println(gebyt);
            System.out.println(bestSeller);
            System.out.println(score[4]);









            




}

