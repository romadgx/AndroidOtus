package otus.gpb.homework.activities.sender

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.mylibrary.Payload

class SenderActivity : AppCompatActivity() {

    private lateinit var btnOpenMap: Button
    private lateinit var btnSendEmail: Button
    private lateinit var btnOpenReceiver: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sender)

        btnOpenMap = findViewById(R.id.btn_maps)
        btnSendEmail = findViewById(R.id.btn_mail)
        btnOpenReceiver = findViewById(R.id.btn_open_receiver)

        btnOpenMap.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("geo:0,0?q=Рестораны") // не смог понять как получить "текущую локацию"
            ).apply {
                setPackage("com.google.android.apps.maps")
            }
            startActivity(intent)
        }

        btnSendEmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                setType("message/rfc822")
                setData(Uri.parse("mailto:"))
                putExtra(Intent.EXTRA_EMAIL, arrayOf("android@otus.ru"))
                putExtra(Intent.EXTRA_SUBJECT,"Hello!")
                putExtra(Intent.EXTRA_TEXT, "Hello Otus!")
            }
            startActivity(intent)
        }

        btnOpenReceiver.setOnClickListener {
            val interstellar = Payload("Interstellar", "2014", "interstellar description ...")
            val niceguys = Payload("Niceguys", "2016", "niceguys description ...")

            val intent = Intent().apply {
                setType("text/plain")
                setAction("Action.SEND")
                addCategory("Category.DEFAULT")
                putExtra("FILMS1", interstellar)
                putExtra("FILMS2", niceguys)
            }
            startActivity(intent)
        }

    }
}