/************************************************************
 *                                                          *
 *  CSCI 470-2/502-2       Assignment 2        Summer 2019  *
 *                                                          *
 *  Class Name:  Destination                                *
 *                                                          *
 *  Programmer:  CORY STOJAN                                *
 *                                                          *
 *  Purpose:  A Destination Calss, used to keep track of    *
               various data for a travel client             *
 *                                                          *
 ************************************************************/
public class Destination
{
  private String destinationCity;
  private int normMilesReq,
              freqFlyMiles,
              upgrageMiles,
              startMonth,
              endMonth;

/************************************************************
 *                                                          *
 *  Method Name:  Destination                               *
 *                                                          *
 *  Purpose:  A string constructor                          *
 *                                                          *
 ************************************************************/
  public Destination (String str) {
    // Split the data
    String[] splitData = str.split(";");
    // Split the date ranges
    String[] splitDate = splitData[4].split("-");
    // Set the data
    this.setDestinationCity(splitData[0]);
    this.setMilesReq(Integer.parseInt(splitData[1]));
    this.setUpgrageMiles(Integer.parseInt(splitData[2]));
    this.setFreqFlyMiles(Integer.parseInt(splitData[3]));
    this.setStartMonth(Integer.parseInt(splitDate[0]));
    this.setEndMonth(Integer.parseInt(splitDate[1]));
  }
  
  /************************************************************
 *                                                          *
 *  Method Name:  Destination                               *
 *                                                          *
 *  Purpose:  A Destination constructor with no paramaters  *
 *                                                          *
 ************************************************************/
  public Destination () {
    this.setDestinationCity(" ");
    this.setMilesReq(0);
    this.setFreqFlyMiles(0);
    this.setUpgrageMiles(0);
    this.setStartMonth(0);
    this.setEndMonth(0);
  }

/************************************************************
 *                                                          *
 *  Method Name:  Destination                               *
 *                                                          *
 *  Purpose:  A Destination constructor with paramaters     *
 *                                                          *
 ************************************************************/
  public Destination (String city, int normMilesReq, int freqFlyMiles, int upgrageMiles, int startMonth, int endMonth) {
    this.setDestinationCity(destinationCity);
    this.setMilesReq(normMilesReq);
    this.setFreqFlyMiles(freqFlyMiles);
    this.setUpgrageMiles(upgrageMiles);
    this.setStartMonth(startMonth);
    this.setEndMonth(endMonth);
  }

/************************************************************
 *                                                          *
 *  Method Name:  Destination                               *
 *                                                          *
 *  Purpose:  A Destination constructor with a destination  *
 *               paramater                                  *
 *                                                          *
 ************************************************************/
  public Destination(Destination dest) {
    this.setDestinationCity(dest.getDestinationCity());
    this.setMilesReq(dest.getMilesReq());
    this.setUpgrageMiles(dest.getUpgrageMiles());
    this.setFreqFlyMiles(dest.getFreqFlyMiles());
    this.setStartMonth(dest.getStartMonth());
    this.setEndMonth(dest.getEndMonth());
 }

/************************************************************
 *                                                          *
 *  Method Name:  getDestinationCity                        *
 *                                                          *
 *  Purpose:  Gets destinationCity variable                 *
 *                                                          *
 ************************************************************/ 
  public String getDestinationCity(){
    return this.destinationCity;
  }

/************************************************************
 *                                                          *
 *  Method Name:  getMilesReq                               *
 *                                                          *
 *  Purpose:  Gets milesReq variable                        *
 *                                                          *
 ************************************************************/ 
  public int getMilesReq(){
    return this.normMilesReq;
  }

/************************************************************
 *                                                          *
 *  Method Name:  getFreqFlyMiles                           *
 *                                                          *
 *  Purpose:  Gets freqFlyMiles variable                    *
 *                                                          *
 ************************************************************/  
  public int getFreqFlyMiles(){
    return this.freqFlyMiles;
  }

/************************************************************
 *                                                          *
 *  Method Name:  getUpgrageMiles                           *
 *                                                          *
 *  Purpose:  Gets upgrageMiles variable                    *
 *                                                          *
 ************************************************************/  
  public int getUpgrageMiles(){
    return this.upgrageMiles;
  }

/************************************************************
 *                                                          *
 *  Method Name:  getStartMonth                             *
 *                                                          *
 *  Purpose:  Gets startMonth variable                      *
 *                                                          *
 ************************************************************/  
  public int getStartMonth(){
    return this.startMonth;
  }

/************************************************************
 *                                                          *
 *  Method Name:  getEndMonth                               *
 *                                                          *
 *  Purpose:  Gets endMonth variable                        *
 *                                                          *
 ************************************************************/  
  public int getEndMonth(){
    return this.endMonth;
  }

/************************************************************
 *                                                          *
 *  Method Name:  setDestinationCity                        *
 *                                                          *
 *  Purpose:  Sets destinationCity variable                 *
 *                                                          *
 ************************************************************/
  public void setDestinationCity(String destinationCity){
    this.destinationCity = destinationCity;
  }

/************************************************************
 *                                                          *
 *  Method Name:  setMilesReq                               *
 *                                                          *
 *  Purpose:  Sets milesReq variable                        *
 *                                                          *
 ************************************************************/  
  public void setMilesReq(int milesReq){
    this.normMilesReq = milesReq;
  }

/************************************************************
 *                                                          *
 *  Method Name:  setFreqFlyMiles                           *
 *                                                          *
 *  Purpose:  Sets freqFlyMiles variable                    *
 *                                                          *
 ************************************************************/  
  public void setFreqFlyMiles(int freqFlyMiles){
    this.freqFlyMiles = freqFlyMiles;
  }

/************************************************************
 *                                                          *
 *  Method Name:  setUpgrageMiles                           *
 *                                                          *
 *  Purpose:  Sets upgrageMile variable                     *
 *                                                          *
 ************************************************************/  
  public void setUpgrageMiles(int upgrageMiles){
    this.upgrageMiles = upgrageMiles;
  }

/************************************************************
 *                                                          *
 *  Method Name:  setStartMonth                             *
 *                                                          *
 *  Purpose:  Sets startMonth variable                      *
 *                                                          *
 ************************************************************/  
  public void setStartMonth(int startMonth){
    this.startMonth = startMonth;
  }

/************************************************************
 *                                                          *
 *  Method Name:  setEndMonth                               *
 *                                                          *
 *  Purpose:  Sets endMoth variable                         *
 *                                                          *
 ************************************************************/  
  public void setEndMonth(int endMonth){
    this.endMonth = endMonth;
  }
}