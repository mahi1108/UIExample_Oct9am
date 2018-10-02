package cubex.mahesh.uiexample_oct9am

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     /*   b1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                tv1.text = et1.text
            }
        }) */
        b1.setOnClickListener {
            tv1.text = et1.text
        }
    }

    fun getText(v:View)
    {
/*    var et:EditText =  findViewById(R.id.et1)
    var tv:TextView =    findViewById(R.id.tv1)
     tv.setText(et.getText()) */
        tv1.text = et1.text
    }
}
