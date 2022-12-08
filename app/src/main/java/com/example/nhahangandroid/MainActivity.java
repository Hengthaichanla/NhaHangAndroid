package com.example.nhahangandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView mainUsername;
    TextView txtPizza;
    ImageView mainProfileImg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainProfileImg = findViewById(R.id.mainProfileUsername);
        mainUsername = findViewById(R.id.mainUsername);
        txtPizza = findViewById(R.id.txtPizza);


        txtPizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(MainActivity.this, ListViewMonAn.class));
                startActivity(intent);
            }
        });

        mainProfileImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(MainActivity.this, LogoutProfile.class));
                startActivity(intent);
            }
        });



    //  showUserData();

        showProfileData();

    }

    private void showProfileData() {

        Intent intent = getIntent();
        String mMainUsername = intent.getStringExtra("username");
        mainUsername.setText(mMainUsername);
    }
}

   /* public void showUserData() {

        Intent intent = getIntent();
        String usernameUser = intent.getStringExtra("username");
        mainUsername.setText(usernameUser);

    }

    public void passUserData() {
        String mainUsername = mainProfileUsername.getText().toString().trim();

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("users");
        Query checkUserDatabase = reference.orderByChild("username").equalTo(mainUsername);

        checkUserDatabase.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {

                    String usernameFromDB = snapshot.child(mainUsername).child("username").getValue(String.class);


                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }*/
