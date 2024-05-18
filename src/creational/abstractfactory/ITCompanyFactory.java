package creational.abstractfactory;

public abstract class ITCompanyFactory {
    protected ITCompanyFactory(){}
    public abstract Developer getDeveloper();
    public abstract Database getDatabase();
    public abstract GraphicDesigner getGraphicDesigner();

}
