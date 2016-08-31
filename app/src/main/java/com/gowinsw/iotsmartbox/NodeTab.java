package com.gowinsw.iotsmartbox;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by gowinsw on 8/31/16.
 */
public class NodeTab extends Main{

    ViewGroup.LayoutParams fill = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT);

    private boolean locked = false;

    NodeTab(LinearLayout layout, String title)
    {
        Button connect =  new Button(getParent());
        connect.setText("Connect");
        connect.setLayoutParams(fill);
        layout.addView(connect);
    }
    /*public NodeTab(LinearLayout tab, final TextView NodeLabel, final Button connect, final Switch onOff, final String title)
    {
        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Connect to the box
                NodeLabel.setText(title);
            }
        });

        onOff.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    setLocked(true);
                }
                else{
                    setLocked(false);
                }
            }
        });*/

    public void setLocked(boolean l)
    {
        locked = l;
        String toaster;
        if(locked)
            toaster=" locked.";
        toaster=" unlocked.";
        String output = "Node is now "+toaster;


    }

    public boolean getLocked()
    {

        return locked;
    }
}