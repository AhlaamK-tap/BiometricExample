package company.tap.biometricexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import company.tap.tapbiometriclibrary.AuthenticateActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun AuthentcateClicked(view: View) {
        startActivity(Intent(this,AuthenticateActivity::class.java))
    }
}
