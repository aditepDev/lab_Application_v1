package com.aditep.lab_android_v1.activity;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.aditep.lab_android_v1.R;
import com.aditep.lab_android_v1.dao.PhotoItemDao;
import com.aditep.lab_android_v1.databinding.ActivityMoreInfoBinding;
import com.aditep.lab_android_v1.fragment.MoreInfoFragment;

public class MoreInfoActivity extends AppCompatActivity {
    ActivityMoreInfoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initInstances();

        PhotoItemDao dao = getIntent().getParcelableExtra("dao");

        binding = DataBindingUtil.setContentView(this, R.layout.activity_more_info);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentContainer, MoreInfoFragment.newInstance(dao))
                    .commit();
        }
    }

    private void initInstances() {
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
