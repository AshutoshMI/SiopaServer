package siopa.ashu.androidsiopaserver.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import siopa.ashu.androidsiopaserver.Interface.ItemClickListener;
import siopa.ashu.androidsiopaserver.R;

/**
 * Created by DELL on 5/19/2018.
 */

public class OrderViewHolder extends RecyclerView.ViewHolder{
    public TextView txtOrderId, txtOrderStatus, txtOrderPhone, txtOrderAddress;

    public Button btnEdit,btnRemove,btnDetail,btnDirection;


    public OrderViewHolder(View itemView) {
        super(itemView);

        txtOrderAddress = (TextView)itemView.findViewById(R.id.order_address);
        txtOrderId = (TextView)itemView.findViewById(R.id.order_id);
        txtOrderStatus = (TextView)itemView.findViewById(R.id.order_status);
        txtOrderPhone = (TextView)itemView.findViewById(R.id.order_phone);

        btnEdit = (Button)itemView.findViewById(R.id.btnEdit);
        btnRemove = (Button)itemView.findViewById(R.id.btnRemove);
        btnDetail = (Button)itemView.findViewById(R.id.btnDetail);
        btnDirection = (Button)itemView.findViewById(R.id.btnDirection);

    }

}


