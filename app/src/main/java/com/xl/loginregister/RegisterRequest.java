package com.xl.loginregister;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by XL on 2018/3/4.
 */

public class RegisterRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL="app-1519830828.000webhostapp.com/Register.php";
    private Map<String,String> params;

    //constructor
    public RegisterRequest(String name, String username, String email, String password, Response.Listener<String> listener){
        super(Method.POST,REGISTER_REQUEST_URL,listener,null);
        params= new HashMap<>();
        params.put("name",name);
        params.put("username",username);
        params.put("email",email);
        params.put("password",password);
    }

    @Override
    public Map<String,String> getParams(){
        return params;
    }

}
