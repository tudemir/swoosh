package com.tudemir.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.tudemir.swoosh.Model.Player
import com.tudemir.swoosh.R
import com.tudemir.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
        println(player.league)
    }

    fun onBallerClick(view:View){
        beginnerSkillBtn.isChecked = false
        player.skill = "baller"
    }

    fun onBeginnerClick(view:View){
        ballerSkillBtn.isChecked = false
        player.skill = "beginner"
    }
    fun onSkillFinishClicked(view:View){
        if(player.skill != ""){
            val finishActivity = Intent(this,FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishActivity)
        }
        else
            Toast.makeText(this, "PLease select a skill level", Toast.LENGTH_SHORT).show()

    }
}
