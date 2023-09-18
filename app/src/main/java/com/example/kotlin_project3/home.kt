package com.example.kotlin_project3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HomeActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityHomeBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        binding.popup.setOnClickListener {
            val popupMenu = PopupMenu(this@HomeActivity, binding.popup)
            popupMenu.menuInflater.inflate(R.menu.menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener {
                    it->
                Toast.makeText(this@HomeActivity, "You Clicked :"+it.title, Toast.LENGTH_SHORT).show()
                true
            }
            popupMenu.show()
        }
    }
    Class 27(Splash Screen) 6
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.kotlin->{
                Toast.makeText(this, "Kotlin :"+item.title, Toast.LENGTH_SHORT).show()
            }
            R.id.java->{
                Toast.makeText(this, "Java", Toast.LENGTH_SHORT).show()
            }
            R.id.python->{
                Toast.makeText(this, "Python", Toast.LENGTH_SHORT).show()
            }
            R.id.dart->{
                Toast.makeText(this, "Dart", Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}