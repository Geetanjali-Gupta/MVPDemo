package com.generator.invoice.mvpdemo.signin.signin;

import com.generator.invoice.mvpdemo.R;
import com.generator.invoice.mvpdemo.signin.utils.Validation;

/**
 * Created by Geetanjali on 11/01/18.
 */

public class SignInPresenterImpl implements SignInPresenter, SignInInteractor.OnSuccessfullyValidatedListener {
    private SignInView signInView;
    private SignInInteractor signInInteracter;
    private boolean isViewStillAttach;

    /**
     * Constructor to initialise SignInView
     *
     * @param signInView View of signIn for further communication with Views
     */
    SignInPresenterImpl(final SignInView signInView) {
        this.signInView = signInView;
        signInInteracter = new SignInInteractorImpl();
    }

    /**
     * On Validate Button clicked
     *
     * @param email    email
     * @param password password
     */
    @Override
    public void onValidateClick(final String email, final String password) {
        if (Validation.isEmailEmpty(email)) {
            signInView.showErrorEmailEmpty(R.string.enter_email_id);
        } else if (!Validation.isValidEmail(email)) {
            signInView.showErrorInvalidEmail(R.string.invalid_email_id);
        } else if (Validation.isPasswordEmpty(password)) {
            signInView.showErrorPasswordEmpty(R.string.enter_password);
        } else if (!Validation.isPasswordValid(password)) {
            signInView.showErrorInvalidPassword(R.string.password_length_must_be_6);
        } else {
            signInInteracter.validate(email, password, this);
        }
    }

    /**
     * Called when the view has attached ( created )
     */
    @Override
    public void onAttach() {
        isViewStillAttach = true;
    }

    /**
     * Called when the view has detached ( destroyed )
     */
    @Override
    public void onDetach() {
        isViewStillAttach = false;
    }

    private boolean isViewStillAttached() {
        return isViewStillAttach;
    }

    @Override
    public void onSuccess() {
        if (isViewStillAttached()) {
            signInView.showSuccessFullyValidated(R.string.successfully_validated);
        }
    }
}
