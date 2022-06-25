public class AboutPage extends Page {
    String Disclaimer;

    public void getDeveloperName() {
        System.out.println("Mary Johns");


    }

    public String getDisclaimer() {
        return Disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        Disclaimer = disclaimer;
    }

}
