package devops.numbers;

public class NumberWords {
        int inputnumber;
        public String toWords( int number ) {
//Storing the numbers from one to nineteen and numbers divisible by 10
            final String[] OneNum= {""," one"," two"," three"," four"," five"," six"," seven"," eight"," nine"};
            final String[] TenNum= {" ten"," eleven"," twelve"," thirteen"," fourteen"," fifteen"," sixteen"," seventeen",
" eighteen"," nineteen"};
            final String[] Tens= {"",""," twenty"," thirty"," forty"," fifty"," sixty"," seventy"," eighty"," ninty"};
            String result = "";
            int temp = 0;
 //Handling out of range nos
            if (number > 9999999 ||number == -1) {
                result = "Number out of range";
                return result.trim() ;
             }
 //Conversion of number in lakh
            if ((temp = number/100000) >0) {
                if(temp<10)
                        return toWords(temp).concat(" lakh").concat(toWords(number%100000));
 //Conversion of number in million
                else
                        return toWords(temp/10).concat(" million").concat(toWords(number%1000000));
            }
 //Conversion of number in thousands
            if ((temp = number/1000) >0)
                return toWords(temp).concat(" thousand").concat(toWords(number%1000));
 //Conversion of number in hundreds
            if ((temp = number/100) >0)
                return OneNum[temp].concat(" hundred").concat(toWords(number%100));
 //Conversion of number for double digit
            else if((temp = number/10) >0) {
                if( temp >1)
                        return Tens[temp].concat(OneNum[(number%10)]);
                else
                        return TenNum[(number%10)];
            }
//Conversion of number in single digit
            else
                return OneNum[number];
        }
}
