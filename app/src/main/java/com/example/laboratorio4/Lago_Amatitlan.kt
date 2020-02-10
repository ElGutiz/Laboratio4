package com.example.laboratorio4

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.laboratorio4.databinding.FragmentLagoAmatitlanBinding
import kotlinx.android.synthetic.main.fragment_lago__amatitlan.*


class Lago_Amatitlan : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentLagoAmatitlanBinding.inflate(inflater)
        var model1 = Model()
        model1.phrase = "Let the peace and the beauty of the nature take you to a wonderful trip."
        model1.title = "Lago de Atitlan: Wonderful Views"
        model1.description = "It is a lake in the Guatemalan Highlands of the Sierra Madre mountain range. It is in the Sololá Department of southwestern Guatemala. It is the deepest lake in Central America." +
                "Atitlán means \"between the waters\". In the Nahuatl language, \"atl\" is the word for water, and \"titlan\" means between. The \"tl\" at the end of the word \"atl\" is dropped and the words are combined to form \"Atitlán\"." +
                "\n" + "\n" + "Atitlán is technically an endorheic lake, feeding into two nearby rivers rather than draining into the ocean. It is shaped by deep surrounding escarpments and three volcanoes on its southern flank. The lake basin is volcanic in origin, filling an enormous caldera formed by an eruption 84,000 years ago. The culture of the towns and villages surrounding Lake Atitlán is influenced by the Maya people. The lake is about 50 kilometres (31 mi) west-northwest of Antigua. It should not be confused with the smaller Lake Amatitlán." +
                "\n" + "\n" + "Lake Atitlán is renowned as one of the most beautiful lakes in the world, and is Guatemala's most important national and international tourist attraction. German explorer and naturalist Alexander von Humboldt called it \"the most beautiful lake in the world,\" and Aldous Huxley famously wrote of it in his 1934 travel book Beyond the Mexique Bay: \"Lake Como, it seems to me, touches on the limit of permissibly picturesque, but Atitlán is Como with additional embellishments of several immense volcanoes. It really is too much of a good thing.\"" +
                "\n" + "\n" + "Wikipedia"
        binding.model = model1
        return binding.getRoot();
        return inflater.inflate(com.example.laboratorio4.R.layout.fragment_lago__amatitlan, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sub_comment.setOnClickListener {
            it.findNavController().navigate(R.id.toShareComment3)
        }
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
