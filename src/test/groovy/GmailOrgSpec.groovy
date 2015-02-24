import geb.spock.GebReportingSpec

/**
 * Created by avinashg on 23-02-2015.
 */
class GmailOrgSpec extends  GebReportingSpec{

    def "login to the gmail application"() {
        when:
        to HomePage

      /*  and: //hover over to expand the menu
        interact {
            moveToElement(manualsMenu.toggle)
        }

        then: //first link is for the current manual
        manualsMenu.links[0].text().endsWith("- CURRENT")

        when:
        manualsMenu.links[0].click()

        then:
        at TheBookOfGebPage  */
        then:
        browser.driver.manage().window().maximize();
        browser.$("input",id:"Email")<<"avinash.golla@imaginea.com"
        browser.$("input",id:"Passwd")<<"pramati1234"
        browser.$("input",id:"signIn").click();
    }
}
