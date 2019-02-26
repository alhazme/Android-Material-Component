package me.alhaz.snippet.appbartopdefault

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.Menu
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("Default")
    }

    /*
     * On Create Options Menu
     *
     * Mengambil data menu dari res > menu > menu_main.xml
     *
     */

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    /*
     * On Options Item Selected
     *
     * Fungsi yang dijalankan ketika icon di actionbar ditekan sesuai id menu yang ada di file res > menu > menu_main.xml
     *
     */


    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        item?.let {
            val menuItem = it
            when (menuItem.itemId) {
                R.id.menu_main_search -> {
                    Log.d("menu_main_search", "search clicked")
                }
                R.id.menu_main_favorite -> {
                    Log.d("menu_main_favorite", "favorite clicked")
                }
                R.id.menu_main_setting -> {
                    Log.d("menu_main_setting", "setting clicked")
                }
                else -> {
                    Log.d("else", "do nothing")
                }
            }
        }
        return super.onOptionsItemSelected(item)
    }


}
