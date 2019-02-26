package me.alhaz.snippet.appbartopcollapse

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.AppBarLayout
import android.support.design.widget.CollapsingToolbarLayout
import android.support.v7.widget.Toolbar


class MainActivity : AppCompatActivity() {

    private lateinit var toolbar: Toolbar
    private lateinit var collapsingToolbarLayout: CollapsingToolbarLayout
    private lateinit var appbarLayout: AppBarLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Add back button for example

        toolbar = findViewById<Toolbar>(R.id.toolbar)
        toolbar.setNavigationIcon(R.drawable.ic_menu_back)

        // Add collapsible toolbar and title

        collapsingToolbarLayout = findViewById<CollapsingToolbarLayout>(R.id.collapsible_toolbar)
        collapsingToolbarLayout.setTitle("Collapsible")
        collapsingToolbarLayout.setExpandedTitleTypeface(Typeface.SANS_SERIF)
        collapsingToolbarLayout.setExpandedTitleColor(resources.getColor(R.color.colorWhite))
        collapsingToolbarLayout.setCollapsedTitleTypeface(Typeface.SANS_SERIF)
        collapsingToolbarLayout.setCollapsedTitleTextColor(resources.getColor(R.color.colorWhite))

        /*
        appbarLayout = findViewById<AppBarLayout>(R.id.appbar)
        appbarLayout.addOnOffsetChangedListener(object : AppBarLayout.OnOffsetChangedListener {
            internal var isShow = false
            internal var scrollRange = -1

            override fun onOffsetChanged(appBarLayout: AppBarLayout, verticalOffset: Int) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.totalScrollRange
                }
                if (scrollRange + verticalOffset == 0) {
                    isShow = true
                    //showOption(R.id.action_info)
                }
                else if (isShow) {
                    isShow = false
                    //hideOption(R.id.action_info)
                }
            }
        })
        */

    }


}
