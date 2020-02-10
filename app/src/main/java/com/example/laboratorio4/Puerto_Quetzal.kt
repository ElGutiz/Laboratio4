package com.example.laboratorio4

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Button
import android.widget.EditText
import androidx.navigation.Navigation
import com.example.laboratorio4.databinding.FragmentPuertoQuetzalBinding
import kotlinx.android.synthetic.main.fragment_puerto__quetzal.*

class Puerto_Quetzal : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setHasOptionsMenu(true)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView: View = inflater.inflate(R.layout.fragment_puerto__quetzal, container, false)
        val comentario: EditText = rootView.findViewById(R.id.final_comment)
        val sub_coment: Button = rootView.findViewById(R.id.sub_comment)

        sub_coment.setOnClickListener {
            val comment_final = comentario.text.toString()
            val main = Intent(activity, shareComment::class.java)
            main.putExtra("Comentario_final", comment_final)
        }

        val binding = FragmentPuertoQuetzalBinding.inflate(inflater)
        var model1 = Model()
        model1.phrase = "A place where you can feel the breeze of the wet air..."
        model1.title = "Puerto Quetzal: Where so many containers live."
        model1.description = "Puerto Quetzal is located in the department of Escuintla, Guatemala, on the Pacific coast (Latitude 13º 55 'N; Longitude 90º 47' W); 98 km from the Capital City, it is state-owned, however, since its inception in 1983, it has successfully used a mixed system by authorizing individuals to provide certain services to the ship and cargo with tariffs set by the Company and approved by the Agreement of Government.\n" +
                "\n" + "The main dock is of the marginal type and the ships it serves are: solid bulk, container carrier, tank, gas, barge, refrigerators, general cargo, roll on - roll off, cruise ships and cargo ships other than the above." +
                "It was built in 1980 and on March 18, 1983, the Port Services were inaugurated, which began to be provided under limited conditions since the port complex was under construction. In November 1985 the first construction phase of the port is completed, the Quetzal Port is inaugurated and the Quetzal Port Company is created for its administration.\n" +
                "\n" +
                "Among its latest projects, we find the construction of a 230 m clover overpass that facilitates the vehicular flow from Puerto San José to Iztapa, two ears and tracks that facilitate the vehicular flow from Guatemala to Puerto San José - Iztapa in both directions, and a circle that facilitates the vehicular flow from Puerto Quetzal to San José - Iztapa.\n" +
                "\n" +
                "Puerto Quetzal continues day by day with its ranges of services to meet the needs of its customers and the country's exports and imports." + "\n" + "\n" + "Wikipedia"
        binding.model = model1
        return binding.getRoot();

        // Inflate the layout for this fragment
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val comentario: EditText = view.findViewById(R.id.final_comment)
        val sub_coment: Button = view.findViewById(R.id.sub_comment)

        sub_coment.setOnClickListener {
            val comment_final = comentario.text.toString()
            val main = Intent(activity, shareComment::class.java)
            main.putExtra("Comentario_final", comment_final)
        }

        sub_comment.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.toShareComment1))
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
