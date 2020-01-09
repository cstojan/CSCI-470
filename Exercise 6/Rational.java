/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2  In Class Example 6       Summer 2019  *
 *                                                          *
 *  Class Name:  Rational                                   *
 *                                                          *
 *  Programmer:  Cory Stojan                                *
 *               Z1804761                                   *
 *                                                          *
 *  Purpose:   Calculates and displays arithmetic operation *
 *                  for two rational numbers                *
 ************************************************************/ 
public class Rational
{
  private int numerator, denominator;
  
  /************************************************************
 *                                                          *
 *  Method Name:  Rational Constructor                      *
 *                                                          *
 *  Purpose:  Rational Constructor involving two ints for   *
 *              paramaters                                  *
 *                                                          *
 ************************************************************/
  public Rational(int numerator, int denominator){
    this.numerator = numerator;
    this.denominator = denominator;
    if(numerator % denominator == 0){
      this.numerator = numerator / denominator;
      this.denominator = 0;
    }
    else{
      for(int j = 2; j < numerator && j < denominator; j++){
        for(int i = 2; i < numerator && i < denominator; i++){
          if(numerator % i == 0){
            if(denominator % i == 0){
              this.numerator = (numerator / i);
              this.denominator = (denominator / i);
              
            }
          }
        }
      }
    }
  }
  
/************************************************************
 *                                                          *
 *  Method Name:  Rational Constructor                      *
 *                                                          *
 *  Purpose:  Default constructor                           *
 *                                                          *
 ************************************************************/
  public Rational(){
    this.numerator = 0;
    this.denominator = 0;
  }
  
/************************************************************
 *                                                          *
 *  Method Name:  reduceRat                                 *
 *                                                          *
 *  Purpose:  Reduces rational to lowest common denominator *
 *                                                          *
 ************************************************************/
  private Rational reduceRat(Rational rat){
    for(int j = 2; j < rat.getNumerator() && j < rat.getDenominator(); j++){
      for(int i = 2; i < rat.getNumerator() && i < rat.getDenominator(); i++){
        if(rat.getNumerator() % i == 0){
          if(rat.getDenominator() % i == 0){
            rat.setNumerator(rat.getNumerator() / i);
            rat.setDenominator(rat.getDenominator() / i);
          }
        }
      }
    }
    return rat;
  }
  
/************************************************************
 *                                                          *
 *  Method Name: getNumerator                               *
 *                                                          *
 *  Purpose:  returns value for the numerator               *
 *                                                          *
 ************************************************************/
  public int getNumerator(){
    return this.numerator;
  }
  
 /************************************************************
 *                                                          *
 *  Method Name: getNumerator                               *
 *                                                          *
 *  Purpose:  returns value for the denominator             *
 *                                                          *
 ************************************************************/
  public int getDenominator(){
    return this.denominator;
  }
  
 /************************************************************
 *                                                          *
 *  Method Name: setNumerator                               *
 *                                                          *
 *  Purpose:  sets value for the numerator               *
 *                                                          *
 ************************************************************/
  public void setNumerator(int numerator){
    this.numerator = numerator;
  }
  
/************************************************************
 *                                                          *
 *  Method Name: setDenominator                             *
 *                                                          *
 *  Purpose:  returns value for the denominator             *
 *                                                          *
 ************************************************************/
  public void setDenominator(int denominator){
    this.denominator = denominator;
  }

/************************************************************
 *                                                          *
 *  Method Name: addRationals                               *
 *                                                          *
 *  Purpose:  Adds two rational numbers                     *
 *                                                          *
 ************************************************************/
  public Rational addRationals(Rational rat1, Rational rat2){
    Rational result = new Rational();
    if(rat1.getDenominator() == rat2.getDenominator()){
      result.setNumerator(rat1.getNumerator() + rat2.getNumerator());
      result.setDenominator(rat1.getDenominator());
    }
    else{
      result.setDenominator(rat1.getDenominator());
      rat1.setDenominator(rat1.getDenominator() * rat2.getDenominator());
      rat1.setNumerator(rat2.getDenominator() * rat1.getNumerator());
      rat2.setDenominator(rat1.getDenominator());
      rat2.setNumerator(result.getDenominator() * rat2.getNumerator());
      result.setNumerator(rat1.getNumerator() + rat2.getNumerator());
      result.setDenominator(rat1.getDenominator());
    }
    this.reduceRat(result);
      return result;
  }
 
/************************************************************
 *                                                          *
 *  Method Name: subRationals                               *
 *                                                          *
 *  Purpose:  subtracts two rationals                       *
 *                                                          *
 ************************************************************/  
  public Rational subRationals(Rational rat1, Rational rat2){
    Rational result = new Rational();
    if(rat1.getDenominator() == rat2.getDenominator()){
      result.setNumerator(rat1.getNumerator() - rat2.getNumerator());
      result.setDenominator(rat1.getDenominator());
    }
    else{
      result.setDenominator(rat1.getDenominator());
      rat1.setDenominator(rat1.getDenominator() * rat2.getDenominator());
      rat1.setNumerator(rat2.getDenominator() * rat1.getNumerator());
      rat2.setDenominator(rat1.getDenominator());
      rat2.setNumerator(result.getDenominator() * rat2.getNumerator());
      result.setNumerator(rat1.getNumerator() - rat2.getNumerator());
      result.setDenominator(rat1.getDenominator());
    }
    this.reduceRat(result);
    return result;
  }
  
/************************************************************
 *                                                          *
 *  Method Name: mulRationals                               *
 *                                                          *
 *  Purpose:  multiplies two rationals                      *
 *                                                          *
 ************************************************************/
  public Rational mulRationals(Rational rat1, Rational rat2){
    Rational result = new Rational();
    result.setNumerator(rat1.getNumerator() * rat2.getNumerator());
    result.setDenominator(rat1.getDenominator() * rat2.getDenominator());
    this.reduceRat(result);
    return result;
  }
  
/************************************************************
 *                                                          *
 *  Method Name: dibRationals                               *
 *                                                          *
 *  Purpose:  divides two rationals                         *
 *                                                          *
 ************************************************************/
  public Rational divRationals(Rational rat1, Rational rat2){
    Rational result = new Rational();
    result.setNumerator(rat1.getNumerator() * rat2.getDenominator());
    result.setDenominator(rat1.getDenominator() * rat2.getNumerator());
    this.reduceRat(result);
    return result;
  }
  
}