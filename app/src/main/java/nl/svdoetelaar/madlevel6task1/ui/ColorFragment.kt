package nl.svdoetelaar.madlevel6task1.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_color.*
import nl.svdoetelaar.madlevel6task1.R
import nl.svdoetelaar.madlevel6task1.model.ColorItem

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class ColorFragment : Fragment() {
    private val colors = arrayListOf<ColorItem>()
    private lateinit var colorAdapter: ColorAdapter

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_color, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvColors.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        rvColors.adapter = colorAdapter

        colorAdapter = ColorAdapter(colors, ::onColorClick)

        observeColors()
    }

    private fun onColorClick(colorItem: ColorItem) {
        Snackbar.make(rvColors, "This color is: ${colorItem.name}", Snackbar.LENGTH_LONG).show()
    }

    private fun observeColors() {
        TODO("Not yet implemented")
    }
}