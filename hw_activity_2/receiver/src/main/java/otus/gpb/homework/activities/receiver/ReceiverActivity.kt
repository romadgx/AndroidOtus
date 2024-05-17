package otus.gpb.homework.activities.receiver

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class ReceiverActivity : AppCompatActivity() {

    private lateinit var posterImageView: ImageView
    private lateinit var descriptionTextView: TextView
    private lateinit var yearTextView: TextView
    private lateinit var titleTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receiver)

        posterImageView = findViewById(R.id.posterImageView)
        descriptionTextView = findViewById(R.id.descriptionTextView)
        yearTextView = findViewById(R.id.yearTextView)
        titleTextView = findViewById(R.id.titleTextView)

        // Вот тут я застрял, я что то не понимаю как принять данные из другого приложения....
        // все перепробовал но ни к чему не пришел. Нуждаюсь в вашем совете.... Спасибо.
//        val payload: Payload? = intent.extras?.getParcelable("FILMS1")
//        descriptionTextView.setText(payload?.description)
    }
}