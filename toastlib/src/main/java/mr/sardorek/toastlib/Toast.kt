package mr.sardorek.toastlib

import android.content.Context
import android.widget.Toast
import androidx.fragment.app.Fragment

fun Context.toast(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}
fun Fragment.toast(text: String) {
    Toast.makeText(requireContext(), text, Toast.LENGTH_SHORT).show()
}