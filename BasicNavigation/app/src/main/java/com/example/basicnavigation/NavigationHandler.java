package com.example.basicnavigation;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;

public class NavigationHandler implements NavigationView.OnNavigationItemSelectedListener
{
    private Intent activity;
    private Context context;
    private DrawerLayout drawer;
    @Override
    public boolean onNavigationItemSelected(MenuItem m)
    {
        m.setChecked(true);
        drawer.closeDrawers();
        activity.putExtra("itemTitle", m.getItemId());
        context.startActivity(activity);

        return true;
    }

    public void setVariables(Context context, Intent activity, DrawerLayout drawer)
    {
        this.context = context;
        this.activity = activity;
        this.drawer = drawer;
    }
}
