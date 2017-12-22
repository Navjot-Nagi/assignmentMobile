package ca.on.conestogac.navjot.nnmidterm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Toast btnAddCommentClicked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAddCommentClicked = Toast.makeText(this, "Navjot Nagi", Toast.LENGTH_SHORT);
    }

    public void onClickAddComment(View view) {
        btnAddCommentClicked.show();
        Intent activity_second = new Intent(this, SecondActivity.class);
        startActivity(activity_second);
    }

    public void onClickContactUs(View view) {
        Intent sms = new Intent(Intent.ACTION_MAIN);
        sms.addCategory(Intent.CATEGORY_APP_MESSAGING);
        startActivity(sms);
    }
}
