package com.example.laboratorio4


import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val f_name = view!!.findViewById<FloatingActionButton>(R.id.floatingActionButton)
        val textView = view!!.findViewById<TextView>(R.id.textView)
        val get_name = view!!.findViewById<TextView>(R.id.get_name)

        f_name.setOnClickListener {
            if(nombre.getVisibility() == View.VISIBLE){
                textView.visibility = View.INVISIBLE
                get_name.visibility = View.VISIBLE
                get_name.text = nombre.text
                nombre.visibility = View.INVISIBLE
            }else{
                if(nombre.getVisibility() == View.INVISIBLE) {
                    textView.visibility = View.VISIBLE
                    get_name.visibility = View.INVISIBLE
                    nombre.visibility = View.VISIBLE
                }
            }
        }

        first_place.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.toPuertoQuetzal))
        second_place.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.toTikal))
        third_place.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.toAmatitlan))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        setHasOptionsMenu(true)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.exmaple_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.action_bio){
            val launchNewIntent = Intent(activity, Biography::class.java)
            startActivityForResult(launchNewIntent, 0)
        }
        return super.onOptionsItemSelected(item)
    }
}
