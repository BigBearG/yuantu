package com.bigbearg.yuantu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mUserName;
    private EditText mUserPwd;
    private CheckBox mRemPwd;
    private CheckBox mAutoLog;
    private Button mLogin;
    private Button mRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        mUserName = findViewById(R.id.username);
        mUserPwd = findViewById(R.id.userpwd);
        mRemPwd = findViewById(R.id.rem_pwd);
        mAutoLog = findViewById(R.id.auto_log);
        mLogin = findViewById(R.id.login);
        mLogin.setOnClickListener(this);
        mRegister = findViewById(R.id.register);
        mRegister.setOnClickListener(this);
    }

    private void submit() {
        String usernameString = mUserName.getText().toString().trim();
        if (TextUtils.isEmpty(usernameString)) {
            Toast.makeText(this, "usernameString不能为空", Toast.LENGTH_SHORT).show();
            return;
        }
        String userpwdString = mUserPwd.getText().toString().trim();
        if (TextUtils.isEmpty(userpwdString)) {
            Toast.makeText(this, "userpwdString不能为空", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login:
                   // submit();
                    login();
                break;
            case R.id.register:

                break;
        }
    }

    private void login() {
        startActivity(new Intent(LoginActivity.this,MainActivity.class));
        finish();
    }
}
