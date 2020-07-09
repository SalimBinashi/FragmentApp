package com.example.fragmentsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragmentsapp.fragments.CallsFragment;
import com.example.fragmentsapp.fragments.ChatsFragment;
import com.example.fragmentsapp.fragments.GroupsFragment;
import com.example.fragmentsapp.fragments.StatusFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // initialize views
    private Button btnChats, btnGroups, btnStatus, btnCalls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // view binding
        btnChats = findViewById(R.id.btnChats);
        btnGroups = findViewById(R.id.btnGroups);
        btnStatus = findViewById(R.id.btnStatus);
        btnCalls = findViewById(R.id.btnCalls);

        // create a listener for the click events
        btnChats.setOnClickListener(this);
        btnGroups.setOnClickListener(this);
        btnStatus.setOnClickListener(this);
        btnCalls.setOnClickListener(this);

        // home fragment transaction default
        ChatsFragment chatsFragment = new ChatsFragment();
        FragmentTransaction ft1 = getSupportFragmentManager().beginTransaction();
        ft1.replace(R.id.container, chatsFragment);
        ft1.commit();
    }

    @Override
    public void onClick(View view) {
        if (view.equals(btnChats)){
            // creating an instance of the fragment
            ChatsFragment chatsFragment = new ChatsFragment();
            // create a fragment transaction using a fragment object
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            // replace parent/ host layout with the fragment layout
            ft.replace(R.id.container, chatsFragment);
            //
            ft.addToBackStack(null);
            // commit transaction
            ft.commit();


        } else if (view.equals(btnGroups)){
            // creating an instance of the fragment
            GroupsFragment groupsFragment = new GroupsFragment();
            // create a fragment transaction using a fragment object
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            // replace parent/ host layout with the fragment layout
            ft.replace(R.id.container, groupsFragment);
            //
            ft.addToBackStack(null);
            // commit transaction
            ft.commit();


        } else if (view.equals(btnStatus)){
            // creating an instance of the fragment
            StatusFragment statusFragment = new StatusFragment();
            // create a fragment transaction using a fragment object
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            // replace parent/ host layout with the fragment layout
            ft.replace(R.id.container, statusFragment);
            //
            ft.addToBackStack(null);
            // commit transaction
            ft.commit();


        } else if (view.equals(btnCalls)){
            // creating an instance of the fragment
            CallsFragment callsFragment = new CallsFragment();
            // create a fragment transaction using a fragment object
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            // replace parent/ host layout with the fragment layout
            ft.replace(R.id.container, callsFragment);
            //
            ft.addToBackStack(null);
            // commit transaction
            ft.commit();


        }
    }
}