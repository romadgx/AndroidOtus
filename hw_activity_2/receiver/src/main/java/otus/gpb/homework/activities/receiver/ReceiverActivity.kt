package otus.gpb.homework.activities.receiver

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.mylibrary.FILMS
import com.example.mylibrary.Payload


class ReceiverActivity : AppCompatActivity() {

    private lateinit var posterImageView: ImageView
    private lateinit var descriptionTextView: TextView
    private lateinit var yearTextView: TextView
    private lateinit var titleTextView: TextView

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receiver)

        posterImageView = findViewById(R.id.posterImageView)
        descriptionTextView = findViewById(R.id.descriptionTextView)
        yearTextView = findViewById(R.id.yearTextView)
        titleTextView = findViewById(R.id.titleTextView)


        val payload: Payload? = intent.extras?.getParcelable(FILMS)
        Log.i("PAYLOAD_TEST", payload?.description.toString())

    }
}