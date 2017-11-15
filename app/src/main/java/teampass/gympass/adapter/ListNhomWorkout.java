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

import junit.framework.Assert;

import java.util.ArrayList;
import java.util.List;

import teampass.gympass.R;
import teampass.gympass.bean.NhomBaiTap;
import teampass.gympass.bean.NhomWorkout;

/**
 * Created by Admin on 9/16/2017.
 */

public class ListNhomWorkout extends ArrayAdapter<NhomWorkout> {
    Context mContext;
    ArrayList<NhomWorkout> mNhom = new ArrayList<NhomWorkout>();

    public ListNhomWorkout(@NonNull Context context, @LayoutRes int resource, @NonNull List<NhomWorkout> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mNhom = new ArrayList<NhomWorkout>(objects);
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
        NhomWorkout obj = mNhom.get(position);
        viewHolder.txtName.setText(obj.getTennhom());
        viewHolder.imgAva.setImageResource(getDrawable(getContext(),obj.getHinhanh()));
        return rowView;
    }
    public static int getDrawable(Context context, String name) {
        Assert.assertNotNull(context);
        Assert.assertNotNull(name);
        return context.getResources().getIdentifier(name,"drawable", context.getPackageName());
    }
    static class ViewHolder {
        TextView txtName;
        ImageView imgAva;
    }
}
