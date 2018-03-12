package com.elifaybike.actionbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Activity için appBar olarak set edilecek kontrole erişildi
        Toolbar myToolBar = (Toolbar) findViewById(R.id.appbar);

        //Bu metot toolbar kontrolünü appbar olarak set etmeye yarar
        setSupportActionBar(myToolBar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //title özelliği Arama olan seçeneği ekliyoruz.
        //bu menünün indis değeri=0
        MenuItem menuItem1 = menu.add("Arama");

        //iconunu ayarlıyoruz
        menuItem1.setIcon(R.drawable.search);
        //appdbarda her zaman görünmesini sağlicaz
        menuItem1.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);

        //title özelliği için ayarları eklicez
        //indis değeri=1
        MenuItem menuItem2 = menu.add("Ayarlar");
        menuItem2.setIcon(R.drawable.settings);

        //appbarda yeterli alan varsa gösterilir
        //yeterli alan olmadığı zamaan overflow menüsünde gösterilir
        menuItem2.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);

        //title özelliğine beğen olan seçeneği ekleyelim
        //indis değeri=2
        MenuItem menuItem3 = menu.add("Beğen");
        menuItem3.setIcon(R.drawable.like);

        //appbarda overflow menünün içinde gözüksün
        menuItem3.setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //item.getItemId() bu kodumuz tıklanan menü ID bilgisini alır
        switch (item.getItemId()) {
            case 0:
                //Id bilgisi=0 ise arama menüsü tıklantı
                Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            case 1:
                Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            case 2:
                Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
        }
        return false;
    }
}
