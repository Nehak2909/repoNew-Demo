package Java8classes;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class IndiaLocaleJava8 {
    public static void main(String[] args) {
        Locale localIn=new Locale("en","IN");
        DateFormat df=DateFormat.getDateInstance(DateFormat.LONG,localIn);
        String formaterdate=df.format(new Date());
        System.out.println("formated dATE(INDIA)"+formaterdate);

        NumberFormat currencyFormatter=NumberFormat.getCurrencyInstance(localIn);
        String formattedCurrency=currencyFormatter.format(2453244545355.44);
        System.out.println("currency formatted : "+formattedCurrency);

        NumberFormat numberFormatter=NumberFormat.getNumberInstance(localIn);
        String formattedNum=numberFormatter.format(47598265.535);
        System.out.println("Fromateed number :"+formattedNum);
    }
}
