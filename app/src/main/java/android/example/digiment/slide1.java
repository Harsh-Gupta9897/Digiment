package android.example.digiment;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class slide1 extends AppCompatActivity {
    private LinearLayout alinearLayout;
private TextView[] mdots;
    public Slide_adapter_main sadap = new Slide_adapter_main(this);
    private Button previous;
    private Button next;
   private int mcurrentpage;

    public slide1() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide1);
        ViewPager aslideview = findViewById(R.id.slideviewpager);
        alinearLayout=findViewById(R.id.dotslayout);
        previous= findViewById(R.id.previous);
        next= findViewById(R.id.next);

        aslideview.setAdapter(sadap);

countdots(0);

aslideview.addOnPageChangeListener(viewlistener);

    }
    public void countdots(int position)
    {
mdots = new TextView[3];
for(int i=0;i<mdots.length;i++)
{
mdots[i]=new TextView(this);
mdots[i].setText(Html.fromHtml("&#8226;"));
mdots[i].setTextSize(35);
mdots[i].setTextColor(getResources().getColor(R.color.colortransparentwhite));
alinearLayout.addView(mdots[i]);
}
if(mdots.length>0)
{
   mdots[position].setTextColor(getResources().getColor(R.color.colorwhite));

}
    }

    ViewPager.OnPageChangeListener viewlistener= new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
countdots(i);
mcurrentpage=i;
if(i==0)
{
    next.setEnabled(true);
    previous.setEnabled(false);
    previous.setVisibility(View.INVISIBLE);
    next.setText("next");
    previous.setText("back");
}
else if (i==mdots.length-1)
            {
                next.setEnabled(true);
                previous.setEnabled(true);
                previous.setVisibility(View.VISIBLE);
                next.setText("finish");
                previous.setText("back");
            }
else
{
    next.setEnabled(true);
    previous.setEnabled(true);
    previous.setVisibility(View.VISIBLE);
    next.setText("next");
    previous.setText("back");
}
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };
}
