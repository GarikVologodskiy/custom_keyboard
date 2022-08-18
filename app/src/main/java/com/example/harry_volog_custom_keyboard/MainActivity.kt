package com.example.harry_volog_custom_keyboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        close.setOnClickListener {

            val slidedown = AnimationUtils.loadAnimation(applicationContext, R.anim.abc_fade_in)
            keyboardparentlayout.startAnimation(slidedown)
            keyboardparentlayout.visibility = View.GONE
        }

        igboedittext.setOnClickListener {
            keyboardparentlayout.visibility = View.VISIBLE
            keyboardparentlayout.visibility = View.VISIBLE
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.abc_fade_in)
            keyboardparentlayout.startAnimation(slideup)
        }

        //disable android soft keyboard
        window.setFlags(
            WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM,
            WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM)

        a1.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            a1.startAnimation(slideup)
            igboedittext.append("1")
            a1.textSize = 30F
        }
        b2.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            b2.startAnimation(slideup)
            igboedittext.append("2")
            b2.textSize = 30F
        }
        c3.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            c3.startAnimation(slideup)
            igboedittext.append("3")
            c3.textSize = 30F
        }
        d4.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            d4.startAnimation(slideup)
            igboedittext.append("4")
            d4.textSize = 30F
        }
        e5.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            e5.startAnimation(slideup)
            igboedittext.append("5")
            e5.textSize = 30F
        }
        f6.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            f6.startAnimation(slideup)
            igboedittext.append("6")
            f6.textSize = 30F
        }
        g7.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            g7.startAnimation(slideup)
            igboedittext.append("7")
            g7.textSize = 30F
        }
        h8.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            h8.startAnimation(slideup)
            igboedittext.append("8")
            h8.textSize = 30F
        }
        k9.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            k9.startAnimation(slideup)
            igboedittext.append("9")
            k9.textSize = 30F
        }
        l0.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            l0.startAnimation(slideup)
            igboedittext.append("0")
            l0.textSize = 30F
        }
        a.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            a.startAnimation(slideup)
            igboedittext.append("a")
            a.textSize = 30F
        }
        b.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            b.startAnimation(slideup)
            igboedittext.append("b")
            b.textSize = 30F
        }
        c.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            c.startAnimation(slideup)
            igboedittext.append("ch")
            c.textSize = 30F
        }
        d.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            d.startAnimation(slideup)
            igboedittext.append("d")
            d.textSize = 30F
        }
        e.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            e.startAnimation(slideup)
            igboedittext.append("e")
            e.textSize = 30F
        }
        f.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            f.startAnimation(slideup)
            igboedittext.append("f")
            f.textSize = 30F
        }
        g.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            g.startAnimation(slideup)
            igboedittext.append("g")
            g.textSize = 30F
        }
        h.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            h.startAnimation(slideup)
            igboedittext.append("h")
            h.textSize = 30F
        }
        i.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            i.startAnimation(slideup)
            igboedittext.append("i")
            i.textSize = 30F
        }
        j.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            j.startAnimation(slideup)
            igboedittext.append("j")
            j.textSize = 30F
        }
        k.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            k.startAnimation(slideup)
            igboedittext.append("k")
            k.textSize = 30F
        }
        l.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            l.startAnimation(slideup)
            igboedittext.append("l")
            l.textSize = 30F
        }
        m.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            m.startAnimation(slideup)
            igboedittext.append("m")
            m.textSize = 30F
        }
        n.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            n.startAnimation(slideup)
            igboedittext.append("n")
            n.textSize = 30F
        }
        o.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            o.startAnimation(slideup)
            igboedittext.append("o")
            o.textSize = 30F
        }
        p.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            p.startAnimation(slideup)
            igboedittext.append("p")
            p.textSize = 30F
        }
        r.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            r.startAnimation(slideup)
            igboedittext.append("r")
            r.textSize = 30F
        }
        s.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            s.startAnimation(slideup)
            igboedittext.append("s")
            s.textSize = 30F
        }
        t.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            t.startAnimation(slideup)
            igboedittext.append("t")
            t.textSize = 30F
        }
        u.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            u.startAnimation(slideup)
            igboedittext.append("u")
            u.textSize = 30F
        }
        v.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            v.startAnimation(slideup)
            igboedittext.append("v")
            v.textSize = 30F
        }
        w.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            w.startAnimation(slideup)
            igboedittext.append("w")
            w.textSize = 30F
        }
        y.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            y.startAnimation(slideup)
            igboedittext.append("y")
            y.textSize = 30F
        }
        z.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            z.startAnimation(slideup)
            igboedittext.append("z")
            z.textSize = 30F
        }

        spacebar.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            spacebar.startAnimation(slideup)
            igboedittext.append(" ")
            spacebar.layoutParams = LinearLayout.LayoutParams(200, 100)
        }
        back.setOnClickListener {
            val slideup = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            back.startAnimation(slideup)
            val params = LinearLayout.LayoutParams(50, 60)
            back.layoutParams = params

            var str = igboedittext.text.toString()
            if(str.isEmpty()) {

            }
            else {
                str = str.substring(0, str.length-1)
                igboedittext.setText(str)
            }
        }
    }
}