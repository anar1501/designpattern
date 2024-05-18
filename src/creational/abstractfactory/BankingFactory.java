package creational.abstractfactory;

public class BankingFactory extends ITCompanyFactory {
    @Override
    public Developer getDeveloper() {
        return new PythonDeveloper();
    }

    @Override
    public Database getDatabase() {
        return new PostgreSql();
    }

    @Override
    public GraphicDesigner getGraphicDesigner() {
        return new UxDesigner();
    }
}
