package pe.edu.ulima.caliprofesulima.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import pe.edu.ulima.caliprofesulima.Beans.Usuario.UsuarioUL;
import pe.edu.ulima.caliprofesulima.R;


public class LoginActivity extends AppCompatActivity implements LoginView {

    EditText eteEmail;
    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        eteEmail = (EditText)findViewById(R.id.txtEmail);

        setPresenter(new LoginPresenterImpl(this));
    }

    @Override
    public void setPresenter(LoginPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void loginCorrecto() {
      /*  Toast.makeText(this, "Login Correcto", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, ListaEquiposActivity.class);
        startActivity(intent);*/
    }
    
    @Override
    public void loginIncorrecto() {
        Toast.makeText(this, "Login incorrecto, Verifique usuario o contraseña", Toast.LENGTH_LONG).show();
    }

    public void onLoginClicked(View view){
       UsuarioUL user = new UsuarioUL(
                eteEmail.getText().toString()
        );
        presenter.loginUsuario(user);
    }


}
