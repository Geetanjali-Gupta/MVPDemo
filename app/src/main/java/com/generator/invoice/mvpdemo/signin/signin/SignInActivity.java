package com.generator.invoice.mvpdemo.signin.signin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Toast;

import com.generator.invoice.mvpdemo.R;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener, SignInView {
    private AppCompatEditText etEmailId, etPassword;
    private SignInPresenter mSignInPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        mSignInPresenter = new SignInPresenterImpl(this);
        mSignInPresenter.onAttach();
        initViews();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mSignInPresenter.onDetach();
    }

    /**
     * Used to initialise views
     */
    private void initViews() {
        etEmailId = findViewById(R.id.etEmailId);
        etPassword = findViewById(R.id.etPassword);

        findViewById(R.id.btnValidate).setOnClickListener(this);
    }

    @Override
    public void onClick(final View view) {
        switch (view.getId()) {
            case R.id.btnValidate:
                mSignInPresenter.onValidateClick(etEmailId.getText().toString().trim(),
                        etPassword.getText().toString().trim());
                break;
            default:
                break;
        }
    }

    /**
     * Used to show Error When Email Field is Empty
     *
     * @param errorMessageId message Id
     */
    @Override
    public void showErrorEmailEmpty(final int errorMessageId) {
        showToast(errorMessageId);
    }

    /**
     * Used to show Error When Email is Invalid
     *
     * @param errorMessageId message Id
     */
    @Override
    public void showErrorInvalidEmail(final int errorMessageId) {
        showToast(errorMessageId);
    }

    /**
     * Used to show Error When Password Field is Empty
     *
     * @param errorMessageId message Id
     */
    @Override
    public void showErrorPasswordEmpty(final int errorMessageId) {
        showToast(errorMessageId);
    }

    /**
     * Used to show Error When Password is Invalid
     *
     * @param errorMessageId message Id
     */
    @Override
    public void showErrorInvalidPassword(final int errorMessageId) {
        showToast(errorMessageId);
    }

    /**
     * Used to show Message When All Fields has valid data
     *
     * @param messageId message Id
     */
    @Override
    public void showSuccessFullyValidated(final int messageId) {
        showToast(messageId);
    }

    /**
     * Used to show Toast message
     *
     * @param message Message Id
     */
    private void showToast(final int message) {
        Toast.makeText(this, getString(message), Toast.LENGTH_SHORT).show();
    }
}
