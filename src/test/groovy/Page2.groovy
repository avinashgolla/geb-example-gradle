import geb.Page

/**
 * Created by avinashg on 02-03-2015.
 */
class Page2 extends Page {
    static content = {
        signout { $("text()==Sign out") }

    }
}