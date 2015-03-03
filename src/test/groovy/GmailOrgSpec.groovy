import geb.spock.GebReportingSpec

class GmailOrgSpec extends  GebReportingSpec{

    def "login to the gmail application"() {
        when:
        to PageObjects


        then:
      //  def getCellValue("C:\\Users\\avinashg\\Desktop\\Data.xls", "Sheet1",0,0);
       browser.driver.manage().window().maximize();
      browser.$("input",id:"Email")<<"avinash.golla@imaginea.com"
        browser.$("input",id:"Passwd")<<"pramati123"
        browser.$("input",id:"signIn").click();
        /*
         public static String getCellValue(String path, String sheetName,
                                      int rowNum, int cellNum){
         */
 //     println getCellValue("C:\\Users\\avinashg\\Desktop\\Data.xls", "Sheet1",0,0)   */
   }


}



