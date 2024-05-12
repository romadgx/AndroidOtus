package otus.gpb.homework.activities.sender

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Payload(
    val title: String,
    val year: String,
    val description: String
) : Parcelable