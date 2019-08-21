package android.example.digiment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Slide_adapter_main extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;
    public Slide_adapter_main(Context context)
    {
        this.context=context;
    }
    public int[] images = {
            R.drawable.ic_grade_black_24dp,
            R.drawable.ic_menu_camera,
            R.drawable.ic_menu_send



    };
    public String[] heading ={
            "Like","Use","share"

    };
    public String[] discription={

            "dvjhhhhhhhhds","hhhhhhhhhhhhhh","gggggggggggg"
    };

    @Override
    public int getCount() {
        return heading.length;
    }

    @Override
    public void destroyItem(ViewGroup container , int position , @NonNull Object o) {
        container.removeView((RelativeLayout)o);

    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return false;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slidervp ,container,false);
        ImageView slideimageview = view.findViewById(R.id.slideimageview);
        TextView slideheading = view.findViewById(R.id.heading);
        TextView description = view.findViewById(R.id.description);
        slideimageview.setImageResource(position);
        slideheading.setText(position);
        description.setText(position);
        container.addView(view);
        return view;
    }

}


