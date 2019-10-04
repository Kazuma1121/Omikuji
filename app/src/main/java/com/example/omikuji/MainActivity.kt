package com.example.omikuji

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.media.AudioAttributes
import android.media.SoundPool
import android.provider.MediaStore
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var soundPool: SoundPool
    private var soundOne = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val audioAttributes = AudioAttributes.Builder()
            .setUsage(AudioAttributes.USAGE_GAME)
            .setContentType(AudioAttributes.CONTENT_TYPE_SPEECH)
            .build()
        
        soundPool = SoundPool.Builder()
            .setAudioAttributes(audioAttributes)
            .setMaxStreams(1)
            .build()
        
        soundOne = soundPool.load(this, R.raw.se_maoudamashii_explosion03, 1)

        soundPool.setOnLoadCompleteListener { soundPool, sampleId, status ->
            Log.d("debug", "sampleId=$sampleId")
            Log.d("debug", "status=$status")
        }

        button.setOnClickListener {

            soundPool.play(soundOne, 1.0f, 1.0f, 0, 0, 1.0f)

            val intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
        }
    }
}