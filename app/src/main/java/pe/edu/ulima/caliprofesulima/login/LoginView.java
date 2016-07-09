package pe.edu.ulima.caliprofesulima.login;


public interface LoginView {
    public void setPresenter(LoginPresenter presenter);
    public void loginCorrecto();
    public void loginIncorrecto();
}
