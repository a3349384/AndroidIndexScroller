package cn.zmy.indexscrollerdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by zmy on 2016/6/21 0021.
 */
public class CitiesAdapter extends RecyclerView.Adapter<CitiesAdapter.CityViewHolder>
{
    private Context context;
    private ArrayList<CityItem> cityItems;

    public CitiesAdapter(Context context, ArrayList<CityItem> cityItems)
    {
        this.context = context;
        this.cityItems = cityItems;
    }

    @Override
    public int getItemCount()
    {
        return cityItems.size();
    }

    @Override
    public CityViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        return new CityViewHolder(LayoutInflater.from(context).inflate(R.layout.item_city,parent,false));
    }

    @Override
    public void onBindViewHolder(CityViewHolder holder, int position)
    {
        holder.textViewCityName.setText(cityItems.get(position).getName());
    }

    class CityViewHolder extends RecyclerView.ViewHolder
    {
        public TextView textViewCityName;
        public CityViewHolder(View itemView)
        {
            super(itemView);
            textViewCityName = (TextView) itemView.findViewById(R.id.textView_cityName);
        }
    }
}
