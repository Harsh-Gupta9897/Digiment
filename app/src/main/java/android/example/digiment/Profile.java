package android.example.digiment;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Profile extends AppCompatActivity {

    private EditText editText1, editText2, editText3, editText4, editText5, editText6, editText7, editText8, editText9, editText10;

    private TextInputLayout textInput1, textInput2, textInput3, textInput4, textInput5, textInput6, textInput7, textInput8, textInput9, textInput10;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        save =  findViewById(R.id.save_btn);

        editText1 = findViewById(R.id.edit_text_branch);
        editText2 = findViewById(R.id.edit_text_rno);
        editText3 = findViewById(R.id.edit_text_lib_id);
        editText4 = findViewById(R.id.edit_text_sec);
        editText5 = findViewById(R.id.edit_text_mob);
        editText6 = findViewById(R.id.edit_text_email);
        editText7 = findViewById(R.id.edit_text_dob);
        editText8=findViewById(R.id.edit_text_f_name);
        editText9=findViewById(R.id.edit_text_m_name);
        editText10 = findViewById(R.id.edit_text_add);


        textInput1 = findViewById(R.id.text_layout_branch);
        textInput2 = findViewById(R.id.text_layout_rno);
        textInput3 = findViewById(R.id.text_layout_lib_id);
        textInput4 = findViewById(R.id.text_layout_sec);
        textInput5 = findViewById(R.id.text_layout_mob);
        textInput6 = findViewById(R.id.text_layout_email);
        textInput7 = findViewById(R.id.text_layout_dob);
        textInput8=findViewById(R.id.text_layout_f_name);
        textInput9=findViewById(R.id.text_layout_m_name);
        textInput10 = findViewById(R.id.text_layout_add);


//        private void ifAnyDetailIsEmpty() {
//            int branch = editText1.getText().toString().trim().length();
//            int rno = editText2.getText().toString().trim().length();
//            int lib_id = editText3.getText().toString().trim().length();
//            int sec = editText4.getText().toString().trim().length();
//            int  mob= editText5.getText().toString().trim().length();
//            int email = editText6.getText().toString().trim().length();
//            int dob = editText7.getText().toString().trim().length();
//            int f_name = editText8.getText().toString().trim().length();
//            int m_name = editText9.getText().toString().trim().length();
//            int add = editText10.getText().toString().trim().length();


//            int flag = 0;
//
//            if (branch == 0 || rno == 0 || lib_id == 0 || sec==0|| mob==0|| email == 0 || dob == 0 || f_name == 0 || m_name==0|| add==0) {
//                if (branch == 0) {
//                    textInput1.setError("This field needs to be filled");
//
//                }
//                if (lib_id==0) {
//
//
//                    textInput2.setError("This field needs to be filled");
//                }
//                if (sec== 0)
//                {
//
//                    textInput3.setError("This field needs to be filled");
//                }
//
//                if (mob == 0) {
//
//                    textInput4.setError("This field needs to be filled");
//                }
//
//                if (email == 0) {
//
//                    textInput5.setError("This field needs to be filled");
//                }
//                if (email == 0) {
//
//                    textInput6.setError("This field needs to be filled");
//                }
//
//                if (dob == 0) {
//
//                    textInput7.setError("This field needs to be filled");
//                }
//
//                if (f_name == 0) {
//
//                    textInput8.setError("This field needs to be filled");
//                }
//
//                if (m_name == 0) {
//
//                    textInput9.setError("This field needs to be filled");
//                }
//
//                if (add == 0) {
//
//                    textInput10.setError("This field needs to be filled");
//                }
//
////                if (imageUri==null) {
////
////                    Toast.makeText(this, "You need to add your Picture", Toast.LENGTH_SHORT).show();
////                }
//            }
////            else
////            {
////                createPicKey();
////                loadingBar.setTitle("Saving data");
////                loadingBar.setMessage("Please Wait..");
////                loadingBar.show();
////
////            }
//
////
//        }

    }
}
