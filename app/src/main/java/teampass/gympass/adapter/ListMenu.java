package teampass.gympass.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import teampass.gympass.R;
import teampass.gympass.model.Menun;

/**
 * Created by Admin on 9/16/2017.
 */

public class ListMenu extends ArrayAdapter<Menun> {
    Context mContext;
    ArrayList<Menun> mMenun = new ArrayList<Menun>();

    public ListMenu(@NonNull Context context, @LayoutRes int resource, @NonNull List<Menun> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mMenun = new ArrayList<Menun>(objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rowView = convertView;
        ViewHolder viewHolder;
        if (rowView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.item_menu, null);
            viewHolder = new ViewHolder();
            viewHolder.txtName = (TextView) rowView.findViewById(R.id.txtName);
            viewHolder.imgAva = (ImageView) rowView.findViewById(R.id.imgAva);
            rowView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();

        }
        Menun menun = mMenun.get(position);
        viewHolder.txtName.setText(menun.getName());
        viewHolder.imgAva.setImageResource(menun.getAvatar());
        return rowView;
    }

    static class ViewHolder {
        TextView txtName;
        ImageView imgAva;
    }
}
