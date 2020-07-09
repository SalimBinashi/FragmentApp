package com.example.fragmentsapp.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fragmentsapp.R;

public class ChatsFragment extends Fragment implements View.OnClickListener {

    // initialize views
    private EditText editTName, editTMessage;
    private Button btnSend;
    private TextView txtMessage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chats, container, false);

        // view binding
        editTName = view.findViewById(R.id.editTName);
        editTMessage = view.findViewById(R.id.editTMessage);
        btnSend = view.findViewById(R.id.btnSend);
        txtMessage = view.findViewById(R.id.txtMessage);

        // create listener for the click event
        btnSend.setOnClickListener(this);

        return view;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View view) {
        if (view.equals(btnSend)){
            if (validate()){
                String name = editTName.getText().toString();
                String message = editTMessage.getText().toString();

                txtMessage.setText("Name: "+name+"\nMessage: "+message);

            }
        }

    }

    private boolean validate() {
        if (TextUtils.isEmpty(editTName.getText().toString())){
            Toast.makeText(getActivity(), "Kindly enter Name", Toast.LENGTH_SHORT).show();
            return false;
        } else if (TextUtils.isEmpty(editTMessage.getText().toString())){
            Toast.makeText(getActivity(), "Enter the Message to send", Toast.LENGTH_SHORT).show();
            return  false;
        } else return  true;
    }
}