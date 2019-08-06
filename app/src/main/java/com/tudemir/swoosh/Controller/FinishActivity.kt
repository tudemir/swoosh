package com.tudemir.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tudemir.swoosh.Model.Player
import com.tudemir.swoosh.R
import com.tudemir.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        println(player.league)
        searchLeaguesTxt.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}
