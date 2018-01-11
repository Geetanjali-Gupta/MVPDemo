package com.generator.invoice.mvpdemo.signin.signin;

/**
 * Created by Geetanjali on 11/01/18.
 */

public interface SignInPresenter {

    /**
     * On Validate Button clicked
     *
     * @param email    email
     * @param password password
     */
    void onValidateClick(final String email, final String password);

    /**
     * Called when the view has attached ( created )
     */
    void onAttach();

    /**
     * Called when the view has detached ( destroyed )
     */
    void onDetach();

}
