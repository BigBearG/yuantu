package com.bigbearg.yuantu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.bigbearg.yuantu.fragment.AddFragment;
import com.bigbearg.yuantu.fragment.HomeFragment;
import com.bigbearg.yuantu.fragment.MessageFragment;
import com.bigbearg.yuantu.fragment.SetFragment;
import com.bigbearg.yuantu.fragment.UserGroupFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView mMessImg;
    private ImageView mSetImg;
    private ImageView mUsergroupImg;
    private ImageView mSetting;
    private ImageView mHomeImg;
    private ImageView mAddImg;
    private FrameLayout mFragMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mMessImg = findViewById(R.id.mess_img);
        mMessImg.setOnClickListener(this);
        mSetImg = findViewById(R.id.set_img);
        mSetImg.setOnClickListener(this);
        mUsergroupImg = findViewById(R.id.usergroup_img);
        mUsergroupImg.setOnClickListener(this);
        mSetting = findViewById(R.id.setting);
        mSetting.setOnClickListener(this);
        mHomeImg = findViewById(R.id.home_img);
        mHomeImg.setOnClickListener(this);
        mAddImg = findViewById(R.id.add_img);
        mAddImg.setOnClickListener(this);
        mFragMain = findViewById(R.id.frag_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.frag_main, new HomeFragment()).commit();
    }

    private void onClickHome() {
        getSupportFragmentManager().beginTransaction().replace(R.id.frag_main, new HomeFragment()).commit();
        mHomeImg.setBackgroundResource(R.mipmap.home_black);
    }

    private void onClickMess() {
        getSupportFragmentManager().beginTransaction().replace(R.id.frag_main, new MessageFragment()).commit();
        mMessImg.setBackgroundResource(R.mipmap.message_black);
    }

    private void onClickAdd() {
        getSupportFragmentManager().beginTransaction().replace(R.id.frag_main, new AddFragment()).commit();
        mAddImg.setBackgroundResource(R.mipmap.add_black);
    }

    private void onClickSet() {
        getSupportFragmentManager().beginTransaction().replace(R.id.frag_main, new SetFragment()).commit();
        mSetImg.setBackgroundResource(R.mipmap.set_black);
    }

    private void onClickUserGroup() {
        getSupportFragmentManager().beginTransaction().replace(R.id.frag_main, new UserGroupFragment()).commit();
        mUsergroupImg.setBackgroundResource(R.mipmap.usergroup_black);
    }

    private void noClickHome() {
        mHomeImg.setBackgroundResource(R.mipmap.home_grey);
    }

    private void noClickMess() {
        mMessImg.setBackgroundResource(R.mipmap.message_grey);
    }

    private void noClickAdd() {
        mAddImg.setBackgroundResource(R.mipmap.add_grey);
    }

    private void noClickSet() {
        mSetImg.setBackgroundResource(R.mipmap.set_grey);
    }

    private void noClickUserGroup() {
        mUsergroupImg.setBackgroundResource(R.mipmap.usergroup_grey);
    }
    @Override
    public void onClick(View v) {
        System.out.println("HAHA");
        switch (v.getId()) {
            case R.id.message: {
            }
            break;
            case R.id.setting: {
            }
            break;
            case R.id.home_img: {
                System.out.println("home");
                onClickHome();
                noClickAdd();
                noClickMess();
                noClickSet();
                noClickUserGroup();
            }
            break;
            case R.id.mess_img: {
                System.out.println("img");
                onClickMess();
                noClickHome();
                noClickAdd();
                noClickSet();
                noClickUserGroup();
            }
            break;
            case R.id.add_img: {
                System.out.println("add");
                onClickAdd();
                noClickHome();
                noClickMess();
                noClickSet();
                noClickUserGroup();

            }
            break;
            case R.id.set_img: {
                System.out.println("set");
                onClickSet();
                noClickHome();
                noClickAdd();
                noClickMess();
                noClickUserGroup();
            }
            break;
            case R.id.usergroup_img: {
                System.out.println("usergroup");
                onClickUserGroup();
                noClickHome();
                noClickAdd();
                noClickMess();
                noClickSet();
            }
            break;

        }
    }
}
