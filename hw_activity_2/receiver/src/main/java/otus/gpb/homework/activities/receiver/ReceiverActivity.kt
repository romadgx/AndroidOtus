package otus.gpb.homework.activities.receiver

import android.content.Context
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import com.example.mylibrary.DESCR
import com.example.mylibrary.FILMS
import com.example.mylibrary.Payload
import com.example.mylibrary.TITLE
import com.example.mylibrary.YEAR


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


        val title = intent.extras?.getString(TITLE)
        val descr = intent.extras?.getString(DESCR)
        val year = intent.extras?.getString(YEAR)

        titleTextView.text = title
        descriptionTextView.text = descr
        yearTextView.text = year

        if (title == "Interstellar") {
            val image = ResourcesCompat.getDrawable(getResources(), R.drawable.interstellar, null);
            posterImageView.setImageDrawable(image)
        } else if (title == "Interstellar") {
            val image = ResourcesCompat.getDrawable(getResources(), R.drawable.niceguys, null);
            posterImageView.setImageDrawable(image)
        }

    }
}