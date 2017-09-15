package teampass.gympass;

import android.content.Context;

import android.graphics.Color;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by DELL on 9/15/2017.
 */

public class CustomAdapter extends ArrayAdapter {
    private Context context;
    private int resourse;
    private ArrayList<Menu> arrMenu;
    public CustomAdapter( Context context, int resource,ArrayList<Menu> objects) {
        super(context, resource, objects);
       this.context=context;
        this.resourse=resource;
        this.arrMenu=objects;
    }

    @NonNull
    @Override

    public View getView(int position, View convertView,  ViewGroup parent) {
        ViewHodler viewHodler;
        if(convertView==null){
          viewHodler = new ViewHodler();
            convertView = LayoutInflater.from(context).inflate(R.layout.test,parent,false);

            viewHodler.imgTheHinh =(ImageView) convertView.findViewById(R.id.img_thehinh);
            viewHodler.tvTheHinh2 =(TextView) convertView.findViewById(R.id.tv_thehinh2);
            convertView.setTag(viewHodler);
        }else  {
            viewHodler=(ViewHodler) convertView.getTag();
        }
        Menu menu= arrMenu.get(position);
        viewHodler.imgTheHinh.setBackgroundResource(R.drawable.cc);
        viewHodler.tvTheHinh2.setText(menu.getName());
        return convertView;

    }
    public class ViewHodler {
        ImageView imgTheHinh;
        TextView tvTheHinh2;
    }
}

