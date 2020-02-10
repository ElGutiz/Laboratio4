package com.example.laboratorio4

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.laboratorio4.databinding.FragmentTikalBinding
import kotlinx.android.synthetic.main.fragment_tikal.*

class Tikal : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setHasOptionsMenu(true)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentTikalBinding.inflate(inflater)
        var model1 = Model()
        model1.phrase = "Let's take a ride to one of the most mytical places of ths mistery country..."
        model1.title = "Tikal: A city of Mayans"
        model1.description = "Its the ruin of an ancient city, which was likely to have been called Yax Mutal, found in a rainforest in Guatemala.[2] It is one of the largest archaeological sites and urban centers of the pre-Columbian Maya civilization. It is located in the archaeological region of the Petén Basin in what is now northern Guatemala. Situated in the department of El Petén, the site is part of Guatemalas Tikal National Park and in 1979 it was declared a UNESCO World Heritage Site." +
                "Tikal was the capital of a conquest state that became one of the most powerful kingdoms of the ancient Maya. Though monumental architecture at the site dates back as far as the 4th century BC, Tikal reached its apogee during the Classic Period, c. 200 to 900 AD. During this time, the city dominated much of the Maya region politically, economically, and militarily, while interacting with areas throughout Mesoamerica such as the great metropolis of Teotihuacan in the distant Valley of Mexico. There is evidence that Tikal was conquered by Teotihuacan in the 4th century CE." +
                " Following the end of the Late Classic Period, no new major monuments were built at Tikal and there is evidence that elite palaces were burned. These events were coupled with a gradual population decline, culminating with the site's abandonment by the end of the 10th century.\n" +
                "\n" +
                "Tikal is the best understood of any of the large lowland Maya cities, with a long dynastic ruler list, the discovery of the tombs of many of the rulers on this list and the investigation of their monuments, temples and palaces." + "\n" + "\n" + "Wikipedia"
        binding.model = model1
        return binding.getRoot();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tikal, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sub_comment.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.toShareComment2))
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
