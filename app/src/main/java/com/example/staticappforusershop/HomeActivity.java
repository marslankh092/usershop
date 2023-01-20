package com.example.staticappforusershop;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuAdapter;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.FileUtils;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeActivity extends AppCompatActivity   {

    BottomNavigationView bottomNavigationView;
    TextView name,t1;
    RecyclerView lst_company,lstRandom;
    BadgeDrawable badgeDrawable;
    Uri selectedFileUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //BOTTOM NAVIGATION
        getSupportActionBar().hide();

        bottomNavigationView=findViewById(R.id.bottom_mavigator);
        bottomNavigationView.setSelectedItemId(R.id.home);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        return true;
                    case R.id.favorite:
                       // startActivity(new Intent(getApplicationContext(),FavoriteActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_NEW_TASK));
                     //   overridePendingTransition(0,0);
                        HomeActivity.this.finish();
                        return true;
                    case R.id.cart:
                     //  startActivity(new Intent(getApplicationContext(),CartActivity.class));
                      //  overridePendingTransition(0,0);
                        return true;
                    case R.id.order:
                      //  startActivity(new Intent(getApplicationContext(), OrderActivity.class));
                      //  overridePendingTransition(0,0);
                        return true;
                    case R.id.search:
                       // startActivity(new Intent(getApplicationContext(), SearchActivity.class));
                       // overridePendingTransition(0, 0);
                        return true;

                }
                return false;
            }
        });

        badgeDrawable= bottomNavigationView.getOrCreateBadge(R.id.cart);
        badgeDrawable.clearNumber();
        badgeDrawable.setVisible(false);

        //BOTTOM NAVIGATION END
        t1=findViewById(R.id.t1);
        lst_company=findViewById(R.id.view1);
        lst_company.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        lst_company.setHasFixedSize(true);
        name=findViewById(R.id.name);

        //set Avatar
        getMenu();
     //   getBannerImage();
      //  initDB();
      //  updateCartCount();

    }

    private void uploadFile(){}
    private void getMenu() {
    }
    private void displayMenu(List<Menu> menus) {
//        MenuAdapter menuAdapter =new MenuAdapter(HomeActivity.this,menus);
//        lst_company.setAdapter(menuAdapter);
    }
    private void getTooping(String menuId) {
//        compositeDisposable.add(mservice.getProductByMenuID(menuId)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Consumer<List<Product>>() {
//                    @Override
//                    public void accept(List<Product> products) throws Exception {
//                        Common.toppingList=products;
//                    }
//                }));
    }

    @Override
    protected void onResume() {
        super.onResume();

    }





}