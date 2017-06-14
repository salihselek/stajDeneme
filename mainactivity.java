package com.salihs3.toasts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calistir(View v){
        if(v.getId()==R.id.button){
            Toast.makeText(this,"ben bir mesajım",Toast.LENGTH_LONG).show();
        }
        else {
            Toast t=new Toast(this);
            //xml layoutları bu tarafta kullanmak için çevirici
            LayoutInflater lin=getLayoutInflater();
            //view olarak aldık.. root personal_toast taki layoutun id si
            View view=lin.inflate(R.layout.personal_toast,(ViewGroup)findViewById(R.id.root));
            t.setGravity(Gravity.CENTER,0,0);
            t.setView(view);
            t.show();
        }
    }

}
