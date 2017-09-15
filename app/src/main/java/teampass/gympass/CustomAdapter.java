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
        convertView = LayoutInflater.from(context).inflate(R.layout.test,parent,false);
        TextView tv_thehinh =(TextView) convertView.findViewById(R.id.tv_thehinh);
        TextView tv_thehinh2 =(TextView) convertView.findViewById(R.id.tv_thehinh2);

        Menu menu= arrMenu.get(position);
        tv_thehinh.setBackgroundColor(menu.getColor());
        tv_thehinh2.setText((position+1)+"");
        tv_thehinh2.setText(menu.getName());
        return convertView;

    }
}

