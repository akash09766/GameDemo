package skylightdeveloper.com.gamedemo;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static skylightdeveloper.com.gamedemo.R.id.btn_none_id;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtn01;
    private Button mBtn02;
    private Button mBtn03;

    private Button mBtn04;
    private Button mBtn05;
    private Button mBtn06;

    private Button mBtn07;
    private Button mBtn08;
    private Button mBtnNone;

    private int mUserAttempts = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        setIdsToViews();
        setListenerToViews();
    }

    private void setIdsToViews() {

        mBtn01 = (Button) findViewById(R.id.btn_01_id);
        mBtn02 = (Button) findViewById(R.id.btn_02_id);
        mBtn03 = (Button) findViewById(R.id.btn_03_id);

        mBtn04 = (Button) findViewById(R.id.btn_04_id);
        mBtn05 = (Button) findViewById(R.id.btn_05_id);
        mBtn06 = (Button) findViewById(R.id.btn_06_id);

        mBtn07 = (Button) findViewById(R.id.btn_07_id);
        mBtn08 = (Button) findViewById(R.id.btn_08_id);
        mBtnNone = (Button) findViewById(btn_none_id);
    }

    private void setListenerToViews() {

        mBtn01.setOnClickListener(this);
        mBtn02.setOnClickListener(this);
        mBtn03.setOnClickListener(this);


        mBtn04.setOnClickListener(this);
        mBtn05.setOnClickListener(this);
        mBtn06.setOnClickListener(this);

        mBtn07.setOnClickListener(this);
        mBtn08.setOnClickListener(this);
        mBtnNone.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.btn_01_id:

                if (mBtn02.getText().toString().isEmpty()) {
                    String mBtn01Txt = mBtn01.getText().toString();
                    mBtn01.setText("");
                    mBtn02.setText(mBtn01Txt);
                    mUserAttempts ++;
                } else if (mBtn04.getText().toString().isEmpty()) {
                    String mBtn01Txt = mBtn01.getText().toString();
                    mBtn01.setText("");
                    mBtn04.setText(mBtn01Txt);
                    mUserAttempts ++;
                }

                if(userWinsOrNot()){
                    restartDialog();
                }
                break;

            case R.id.btn_02_id:

                if (mBtn01.getText().toString().isEmpty()) {
                    String mBtn02Txt = mBtn02.getText().toString();
                    mBtn02.setText("");
                    mBtn01.setText(mBtn02Txt);
                    mUserAttempts ++;

                } else if (mBtn05.getText().toString().isEmpty()) {
                    String mBtn02Txt = mBtn02.getText().toString();
                    mBtn02.setText("");
                    mBtn05.setText(mBtn02Txt);
                    mUserAttempts ++;

                } else if (mBtn03.getText().toString().isEmpty()) {
                    String mBtn02Txt = mBtn02.getText().toString();
                    mBtn02.setText("");
                    mBtn03.setText(mBtn02Txt);
                    mUserAttempts ++;

                }

                if(userWinsOrNot()){
                    restartDialog();
                }
                break;

            case R.id.btn_03_id:

                if (mBtn02.getText().toString().isEmpty()) {
                    String mBtn03Txt = mBtn03.getText().toString();
                    mBtn03.setText("");
                    mBtn02.setText(mBtn03Txt);
                    mUserAttempts ++;

                } else if (mBtn06.getText().toString().isEmpty()) {
                    String mBtn03Txt = mBtn03.getText().toString();
                    mBtn03.setText("");
                    mBtn06.setText(mBtn03Txt);
                    mUserAttempts ++;

                }

                if(userWinsOrNot()){
                    restartDialog();
                }
                break;


            case R.id.btn_04_id:

                if (mBtn01.getText().toString().isEmpty()) {
                    String mBtn04Txt = mBtn04.getText().toString();
                    mBtn04.setText("");
                    mBtn01.setText(mBtn04Txt);
                    mUserAttempts ++;

                } else if (mBtn05.getText().toString().isEmpty()) {
                    String mBtn04Txt = mBtn04.getText().toString();
                    mBtn04.setText("");
                    mBtn05.setText(mBtn04Txt);
                    mUserAttempts ++;

                } else if (mBtn07.getText().toString().isEmpty()) {
                    String mBtn02Txt = mBtn04.getText().toString();
                    mBtn04.setText("");
                    mBtn07.setText(mBtn02Txt);
                    mUserAttempts ++;

                }

                if(userWinsOrNot()){
                    restartDialog();
                }
                break;

            case R.id.btn_05_id:
                if (mBtn02.getText().toString().isEmpty()) {
                    String mBtn05Txt = mBtn05.getText().toString();
                    mBtn05.setText("");
                    mBtn02.setText(mBtn05Txt);
                    mUserAttempts ++;

                } else if (mBtn06.getText().toString().isEmpty()) {
                    String mBtn05Txt = mBtn05.getText().toString();
                    mBtn05.setText("");
                    mBtn06.setText(mBtn05Txt);
                    mUserAttempts ++;

                } else if (mBtn04.getText().toString().isEmpty()) {
                    String mBtn05Txt = mBtn05.getText().toString();
                    mBtn05.setText("");
                    mBtn04.setText(mBtn05Txt);
                    mUserAttempts ++;

                } else if (mBtn08.getText().toString().isEmpty()) {
                    String mBtn05Txt = mBtn05.getText().toString();
                    mBtn05.setText("");
                    mBtn08.setText(mBtn05Txt);
                    mUserAttempts ++;

                }

                if(userWinsOrNot()){
                    restartDialog();
                }
                break;

            case R.id.btn_06_id:

                if (mBtn03.getText().toString().isEmpty()) {
                    String mBtn06Txt = mBtn06.getText().toString();
                    mBtn06.setText("");
                    mBtn03.setText(mBtn06Txt);
                    mUserAttempts ++;

                } else if (mBtn05.getText().toString().isEmpty()) {
                    String mBtn06Txt = mBtn06.getText().toString();
                    mBtn06.setText("");
                    mBtn05.setText(mBtn06Txt);
                    mUserAttempts ++;

                } else if (mBtnNone.getText().toString().isEmpty()) {
                    String mBtn06Txt = mBtn06.getText().toString();
                    mBtn06.setText("");
                    mBtnNone.setText(mBtn06Txt);
                    mUserAttempts ++;

                }

                if(userWinsOrNot()){
                    restartDialog();
                }
                break;

            case R.id.btn_07_id:

                if (mBtn04.getText().toString().isEmpty()) {
                    String mBtn07Txt = mBtn07.getText().toString();
                    mBtn07.setText("");
                    mBtn04.setText(mBtn07Txt);
                    mUserAttempts ++;

                } else if (mBtn08.getText().toString().isEmpty()) {
                    String mBtn07Txt = mBtn07.getText().toString();
                    mBtn07.setText("");
                    mBtn08.setText(mBtn07Txt);
                    mUserAttempts ++;

                }

                if(userWinsOrNot()){
                    restartDialog();
                }
                break;

            case R.id.btn_08_id:

                if (mBtn07.getText().toString().isEmpty()) {
                    String mBtn08Txt = mBtn08.getText().toString();
                    mBtn08.setText("");
                    mBtn07.setText(mBtn08Txt);
                    mUserAttempts ++;

                } else if (mBtn05.getText().toString().isEmpty()) {
                    String mBtn08Txt = mBtn08.getText().toString();
                    mBtn08.setText("");
                    mBtn05.setText(mBtn08Txt);
                    mUserAttempts ++;

                } else if (mBtnNone.getText().toString().isEmpty()) {
                    String mBtn08Txt = mBtn08.getText().toString();
                    mBtn08.setText("");
                    mBtnNone.setText(mBtn08Txt);
                    mUserAttempts ++;

                }

                if(userWinsOrNot()){
                    restartDialog();
                }
                break;

            case btn_none_id:
                if (mBtn06.getText().toString().isEmpty()) {
                    String mBtnNoneTxt = mBtnNone.getText().toString();
                    mBtnNone.setText("");
                    mBtn06.setText(mBtnNoneTxt);
                    mUserAttempts ++;

                } else if (mBtn08.getText().toString().isEmpty()) {
                    String mBtnNoneTxt = mBtnNone.getText().toString();
                    mBtnNone.setText("");
                    mBtn08.setText(mBtnNoneTxt);
                    mUserAttempts ++;

                }

                if(userWinsOrNot()){
                    restartDialog();
                }
                break;
        }
    }

    private void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    private boolean userWinsOrNot(){

        if(!mBtn01.getText().toString().equalsIgnoreCase("1")){
            return false;
        }
        if(!mBtn02.getText().toString().equalsIgnoreCase("2")){
            return false;
        }
        if(!mBtn03.getText().toString().equalsIgnoreCase("3")){
            return false;
        }

        if(!mBtn04.getText().toString().equalsIgnoreCase("4")){
            return false;
        }
        if(!mBtn05.getText().toString().equalsIgnoreCase("5")){
            return false;
        }
        if(!mBtn06.getText().toString().equalsIgnoreCase("6")){
            return false;
        }

        if(!mBtn07.getText().toString().equalsIgnoreCase("7")){
            return false;
        }
        if(!mBtn08.getText().toString().equalsIgnoreCase("8")){
            return false;
        }
        if(!mBtnNone.getText().toString().equalsIgnoreCase("")){
            return false;
        }

        return true;
    }

    private void restartDialog() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle(getString(R.string.game_over));
        alert.setMessage("You took "+mUserAttempts+"attempts."+"\n"+getString(R.string.play_again_msg));
        alert.setPositiveButton(getString(R.string.dialog_ok),
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        doRestart();
                    }
                }
        );
        alert.setNegativeButton(getString(R.string.dialog_cancel),
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        dialog.dismiss();
                    }
                }
        );
        AlertDialog dialog = alert.create();
        dialog.show();

        Button cancelBtn = dialog.getButton(DialogInterface.BUTTON_NEGATIVE);
        cancelBtn.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
        Button okBtn = dialog.getButton(DialogInterface.BUTTON_POSITIVE);
        okBtn.setTextColor(ContextCompat.getColor(this, R.color.colorAccent));
    }

    private void doRestart() {
        Intent restartIntent = getBaseContext().getPackageManager()
                .getLaunchIntentForPackage(getBaseContext().getPackageName());
        restartIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(restartIntent);
    }
}
