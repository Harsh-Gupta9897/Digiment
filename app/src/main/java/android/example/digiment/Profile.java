package android.example.digiment;

import android.app.ProgressDialog;
import android.example.digiment.Data.Student;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class Profile extends AppCompatActivity {

    private EditText editText,editText1, editText2, editText3, editText4, editText5, editText6, editText7, editText8, editText9, editText10;

    private TextInputLayout textInput,textInput1, textInput2, textInput3, textInput4, textInput5, textInput6, textInput7, textInput8, textInput9, textInput10;
    private Button save;
    private Student studentinfo;
    private ProgressDialog loadingBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        studentinfo=new Student();

        save =  findViewById(R.id.save_btn);


        editText=findViewById(R.id.edit_text_Name);
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

        textInput=findViewById(R.id.text_layout_Name);
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
        loadingBar=new ProgressDialog(this);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifAnyDetailIsEmpty();
            }
        });


    }
           private void ifAnyDetailIsEmpty() {
            int branch = editText1.getText().toString().trim().length();
            int rno = editText2.getText().toString().trim().length();
            int lib_id = editText3.getText().toString().trim().length();
            int sec = editText4.getText().toString().trim().length();
            int  mob= editText5.getText().toString().trim().length();
            int email = editText6.getText().toString().trim().length();
            int dob = editText7.getText().toString().trim().length();
            int f_name = editText8.getText().toString().trim().length();
            int m_name = editText9.getText().toString().trim().length();
            int add = editText10.getText().toString().trim().length();


            int flag = 0;

            if (branch == 0 || rno == 0 || lib_id == 0 || sec==0|| mob==0|| email == 0 || dob == 0 || f_name == 0 || m_name==0|| add==0) {
                if (branch == 0) {
                    textInput1.setError("This field needs to be filled");

                }
                if (lib_id==0) {


                    textInput2.setError("This field needs to be filled");
                }
                if (sec== 0)
                {

                    textInput3.setError("This field needs to be filled");
                }

                if (mob == 0) {

                    textInput4.setError("This field needs to be filled");
                }

                if (email == 0) {

                    textInput5.setError("This field needs to be filled");
                }
                if (email == 0) {

                    textInput6.setError("This field needs to be filled");
                }

                if (dob == 0) {

                    textInput7.setError("This field needs to be filled");
                }

                if (f_name == 0) {

                    textInput8.setError("This field needs to be filled");
                }

                if (m_name == 0) {

                    textInput9.setError("This field needs to be filled");
                }

                if (add == 0) {

                    textInput10.setError("This field needs to be filled");
                }

//                if (imageUri==null) {
//
//                    Toast.makeText(this, "You need to add your Picture", Toast.LENGTH_SHORT).show();
//                }
            }
            else
            {

                loadingBar.setTitle("Please Wait");
                loadingBar.setMessage("Uploading data");
                loadingBar.setCanceledOnTouchOutside(false);
                loadingBar.show();
                saveData();
            }


        }

    private void saveData() {
        final String name,branch,rollno,libid,sec,mobno,mail,dob,fname,mname,addr;
        name=editText.getText().toString();
        branch=editText1.getText().toString();
        rollno=editText2.getText().toString();
        libid=editText3.getText().toString();
        sec=editText4.getText().toString();
        mobno=editText5.getText().toString();
        mail=editText6.getText().toString();
        dob=editText7.getText().toString();
        fname=editText8.getText().toString();
        mname=editText9.getText().toString();
        addr=editText10.getText().toString();


       // studentinfo.setName(name);
        studentinfo.setBranch(branch);
        studentinfo.setRollno(rollno);
        studentinfo.setLibid(libid);
        studentinfo.setSec(sec);
        studentinfo.setMobno(mobno);
        studentinfo.setMail(mail);
        studentinfo.setDob(dob);
        studentinfo.setFname(fname);
        studentinfo.setMname(mname);
        studentinfo.setAddr(addr);

        final DatabaseReference studentRef=FirebaseDatabase.getInstance().getReference().child("Students");

        studentRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.child(studentinfo.getLibid()).exists())
                {
                    Toast.makeText(Profile.this, "Lib id already exists", Toast.LENGTH_LONG).show();
                    loadingBar.dismiss();
                }
                else
                {
                    HashMap<String,Object>studentData=new HashMap<>();
                    studentData.put("name",studentinfo.getName());
                    studentData.put("branch",studentinfo.getBranch());
                    studentData.put("rollno",studentinfo.getRollno());
                    studentData.put("libid",studentinfo.getLibid());
                    studentData.put("sec",studentinfo.getSec());
                    studentData.put("mobno",studentinfo.getMobno());
                    studentData.put("mail",studentinfo.getMail());
                    studentData.put("dob",studentinfo.getDob());
                    studentData.put("fname",studentinfo.getFname());
                    studentData.put("mname",studentinfo.getMname());
                    studentData.put("Addr",studentinfo.getAddr());

                    studentRef.child(studentinfo.getLibid()).updateChildren(studentData)
                            .addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {

                                    Toast.makeText(Profile.this, "Data Added", Toast.LENGTH_SHORT).show();
                                    loadingBar.dismiss();
                                }
                            });
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });






    }

}
